<?php
header("Content-Type: text/html; charset=utf-8", true);
error_reporting(0);
?>
<!DOCTYPE HTML>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <title>Wiki games </title>
    <link rel="stylesheet" href="css/inclusao_alteracao_exclusao.css">
    <link rel="shortcut icon" href="images/favicon.png" type="image/x-icon">
    <link href="css/toastr.css" rel="stylesheet" />
    <script src="jquery/jquery-3.3.1.min.js"></script>
    <script src="popper/popper.min.js"></script>
    <script src="bootstrap4/js/bootstrap.min.js"></script>
    <script src="funcoes/toastr.min.js"></script>
    <script src="funcoes/funcao_toastr.js"></script>
</head>

<body>
    <?php
    $codigo = "";
    $nome = "";
    $altura = "";
    $peso = "";
    $nome_franquia = "";
    $genero = "";
    $destino = "";
    $ComandoSQL = "";

    require_once 'funcoes/conexao.php';
    $codigo = $_GET['codigo'];

    switch ($_POST['form_operacao']) {
        case "alteracao":
            try {
                $codigo = $_POST['codigo'];
                $nome =  $_POST['nome'];
                $altura = $_POST['altura'];
                $peso = $_POST['peso'];
                $nome_franquia = $_POST['nome_franquia'];
                $genero = $_POST['genero'];

                if (!is_numeric($altura)) {
                    $destino = "function () {window.location='consulta_personagem.php';}";
                    echo "<script>sendToastr('Altura deve ser um valor numérico!<br />Clique para continuar!','error',$destino)</script>";
                    die();
                }

                if (!is_numeric($peso)) {
                    $destino = "function () {window.location='consulta_personagem.php';}";
                    echo "<script>sendToastr('Peso deve ser um valor numérico!<br />Clique para continuar!','error',$destino)</script>";
                    die();
                }

                $stmt = $conn->prepare('UPDATE tb_personagem SET nome =:nome,altura = :altura,peso = :peso, nome_franquia= :nome_franquia,genero=:genero WHERE codigo = :codigo');

                $stmt->bindValue(':codigo', $codigo);
                $stmt->bindValue(':nome', $nome);
                $stmt->bindValue(':altura', $altura);
                $stmt->bindValue(':peso', $peso);
                $stmt->bindValue(':nome_franquia', $nome_franquia);
                $stmt->bindValue(':genero', $genero);
                $stmt->execute();

                $destino = "function () {window.location='consulta_personagem.php';}";
                echo "<script>sendToastr('Personagem alterado com sucesso! Clique para continuar!','success',$destino)</script>";
                break;
            } catch (PDOException $e) {

                $destino = "function () {window.location='index.php';}";
                echo "<script>sendToastr($e->$getMessage(),'error',$destino)</script>";
                die();
            }
        case "exclusao":
            try {
                $codigo = $_POST['codigo'];
                $stmt = $conn->prepare('DELETE FROM tb_personagem WHERE codigo = :codigo');
                $stmt->bindValue(':codigo', $codigo);
                $stmt->execute();
                $destino = "function () {window.location='consulta_personagem.php';}";
                echo "<script>sendToastr('Personagem excluído com sucesso! Clique para seguir!','success',$destino)</script>";
                break;
            } catch (PDOException $e) {
                $destino = "function () {window.location='index.php';}";
                echo "<script>sendToastr($e->$getMessage(),'error',$destino)</script>";
                die();
            }
    }

    $ComandoSQL = "SELECT * FROM tb_personagem WHERE codigo = '" . $codigo . "'";
    $result = $conn->query($ComandoSQL);
    if (!$result) {
        $destino = "function () {window.location='index.php';}";
        echo "<script>sendToastr('Nenhum personagem foi encontrado! Clique para continuar!','error',$destino)</script>";
    }
    $row = $result->fetch(PDO::FETCH_OBJ)
    ?>

    <script LANGUAGE="JavaScript">
        function define_operacao(operacao) {
            if (operacao == "alt") {
                document.form_alteracao_exclusao_personagem.form_operacao.value = "alteracao";
            }
            if (operacao == "exc") {
                document.form_alteracao_exclusao_personagem.form_operacao.value = "exclusao";
            }
            document.form_alteracao_exclusao_personagem.submit();
        }
    </script>

    <?php $cabecalho = require_once('funcoes/cabecalho.php');
    echo $cabecalho ?>

    <article class="artigo">
        <div class="secaoConteudo">

            <h1 class="titulo">Cadastro de Personagens</h1>
            <h3>Alteração e Exclusão:</h3>

            <form method="POST" action="alteracao_exclusao_personagem.php" name="form_alteracao_exclusao_personagem">
                <table>
                    <tr>
                        <td class="label">Código:</td>
                        <td>
                            <input name="codigo" type="number" readonly="readonly" class="inpInsercao" value="<?php echo $row->codigo; ?>">*
                        </td>
                    </tr>

                    <tr>
                        <td class="label">Nome:</td>
                        <td>
                            <input name="nome" type="text" id="nome" size="255" maxlength="255" required="required" class="inpInsercao" value="<?php echo $row->nome; ?>">*
                        </td>
                    </tr>

                    <tr>
                        <td class="label">Altura:</td>
                        <td>
                            <input name="altura" type="text" id="altura" size="10" maxlength="10" required="required" class="inpInsercao" value="<?php echo $row->altura; ?>">*
                        </td>
                    </tr>

                    <tr>
                        <td class="label">Peso:</td>
                        <td>
                            <input name="peso" type="text" id="peso" size="10" maxlength="10" required="required" class="inpInsercao" value="<?php echo $row->peso ?>">*
                        </td>
                    </tr>

                    <tr>
                        <td class="label">Nome da Franquia:</td>
                        <td>
                            <input name="nome_franquia" type="text" id="nome_franquia" size="255" maxlength="255" required="required" class="inpInsercao" value="<?php echo $row->nome_franquia ?>">*
                        </td>
                    </tr>

                    <tr>
                        <td class="label">Gênero:</td>
                        <td>
                            <select name="genero" required="required" class="inpInsercao">
                                <option value="">Selecione o gênero</option>
                                <option value="Masculino" <?php if ($row->genero == "Masculino") echo " selected"; ?>>Masculino</option>
                                <option value="Feminino" <?php if ($row->genero == "Feminino") echo " selected"; ?>>Feminino</option>
                            </select>*
                        </td>
                    </tr>

                    <tr>
                        <td colspan='2'>
                            <br>
                            <input type="hidden" name="form_operacao" value="consulta">
                            <input name="alterar" type="button" value="Alterar" onClick="define_operacao('alt');" class="botao">
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input name="excluir" type="button" value="Excluir" onClick="define_operacao('exc');" class="botao">
                            <p>* dados obrigatórios</p> <a href="JavaScript: window.history.back();">Voltar</a>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </article>

    <?php $rodape = require_once('funcoes/rodape.php');
    echo $rodape ?>
</body>

</html>