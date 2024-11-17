<?php
header("Content-Type: text/html; charset=utf-8", true);
error_reporting(0);
?>
<!DOCTYPE HTML>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <title>Wiki games</title>
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
    $data_lancamento = "";
    $plataforma = "";
    $desenvolvedora = "";
    $destino = "";
    $ComandoSQL = "";

    require_once 'funcoes/conexao.php';
    $codigo = $_GET['codigo'];

    switch ($_POST['form_operacao']) {
        case "alteracao":
            try {
                $codigo = $_POST['codigo'];
                $nome = $_POST['nome'];
                $data_lancamento = $_POST['data_lancamento'];
                $plataforma = $_POST['plataforma'];
                $desenvolvedora = $_POST['desenvolvedora'];

                $stmt = $conn->prepare('UPDATE tb_jogo SET nome =:nome,data_lancamento = :data_lancamento,plataforma = :plataforma, desenvolvedora= :desenvolvedora WHERE codigo = :codigo');

                $stmt->bindValue(':codigo', $codigo);
                $stmt->bindValue(':nome', $nome);
                $stmt->bindValue(':data_lancamento', $data_lancamento);
                $stmt->bindValue(':plataforma', $plataforma);
                $stmt->bindValue(':desenvolvedora', $desenvolvedora);
                $stmt->execute();

                $destino = "function () {window.location='consulta_jogo.php';}";
                echo "<script>sendToastr('Jogo alterado com sucesso! Clique para continuar!','success',$destino)</script>";
                break;
            } catch (PDOException $e) {

                $destino = "function () {window.location='index.php';}";
                echo "<script>sendToastr($e->$getMessage(),'error',$destino)</script>";
                die();
            }
        case "exclusao":
            try {
                $codigo = $_POST['codigo'];
                $stmt = $conn->prepare('DELETE FROM tb_jogo WHERE codigo = :codigo');
                $stmt->bindValue(':codigo', $codigo);
                $stmt->execute();
                $destino = "function () {window.location='consulta_jogo.php';}";
                echo "<script>sendToastr('Jogo excluído com sucesso! Clique para seguir!','success',$destino)</script>";
                break;
            } catch (PDOException $e) {

                $destino = "function () {window.location='index.php';}";
                echo "<script>sendToastr($e->$getMessage(),'error',$destino)</script>";
                die();
            }
    }

    $ComandoSQL = "SELECT * FROM tb_jogo WHERE codigo = '" . $codigo . "'";
    $result = $conn->query($ComandoSQL);
    if (!$result) {
        $destino = "function () {window.location='index.php';}";
        echo "<script>sendToastr('Nenhum jogo foi encontrado! Clique para continuar!','error',$destino)</script>";
    }
    $row = $result->fetch(PDO::FETCH_OBJ)

    ?>
    <script LANGUAGE="JavaScript">
        function define_operacao(operacao) {
            if (operacao == "alt") {
                document.form_alteracao_exclusao_jogo.form_operacao.value = "alteracao";
            }
            if (operacao == "exc") {
                document.form_alteracao_exclusao_jogo.form_operacao.value = "exclusao";
            }
            document.form_alteracao_exclusao_jogo.submit();
        }
    </script>

    <?php $cabecalho = require_once('funcoes/cabecalho.php');
    echo $cabecalho ?>

    <article class="artigo">
        <div class="secaoConteudo">

            <h1 class="titulo">Cadastro de Jogos</h1>
            <h3>Alteração e Exclusão:</h3>

            <form method="POST" action="alteracao_exclusao_jogo.php" name="form_alteracao_exclusao_jogo">
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
                        <td class="label">Data de lançamento:</td>
                        <td>
                            <input name="data_lancamento" type="date" id="data_lancamento" required="required" class="inpInsercao" value="<?php echo $row->data_lancamento; ?>"></input>*
                        </td>
                    </tr>

                    <tr>
                        <td class="label">Plataformas:</td>
                        <td>
                            <input name="plataforma" type="text" id="plataforma" size="1000" maxlength="1000" required="required" class="inpInsercao" value="<?php echo $row->plataforma; ?>">*
                        </td>
                    </tr>

                    <tr>
                        <td class="label">Desenvolvedora:</td>
                        <td>
                            <input name="desenvolvedora" type="text" id="desenvolvedora" size="200" maxlength="200" required="required" class="inpInsercao" value="<?php echo $row->desenvolvedora; ?>">*
                        </td>
                    </tr>

                    <td colspan='2' class="td_c">
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