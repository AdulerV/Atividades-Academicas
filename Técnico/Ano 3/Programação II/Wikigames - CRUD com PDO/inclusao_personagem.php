<?php
header("Content-Type: text/html; charset=utf-8", true);
error_reporting(E_ERROR | E_WARNING | E_PARSE);
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
    $altura = "";
    $peso = "";
    $nome_franquia = "";
    $genero = "";
    $destino = "";
    $ComandoSQL = "";
    if ($_POST['form_operacao'] == "inclusao_personagem") {
        try {
            require_once 'funcoes/conexao.php';

            $codigo = $_POST['codigo'];
            $nome =  $_POST['nome'];
            $altura = $_POST['altura'];
            $peso = $_POST['peso'];
            $nome_franquia = $_POST['nome_franquia'];
            $genero = $_POST['genero'];

            if (!is_numeric($altura)) {
                $destino = "function () {window.location='inclusao_personagem.php';}";
                echo "<script>sendToastr('Altura deve ser um valor numérico!<br />Clique para continuar!','error',$destino)</script>";
                die();
            }

            if (!is_numeric($peso)) {
                $destino = "function () {window.location='inclusao_personagem.php';}";
                echo "<script>sendToastr('Peso deve ser um valor numérico!<br />Clique para continuar!','error',$destino)</script>";
                die();
            }

            $result = $conn->query("SELECT * FROM tb_personagem WHERE codigo = $codigo");
            $count = $result->rowCount();
            if ($count > 0) {
                $destino = "function () {window.location='inclusao_personagem.php';}";
                echo "<script>sendToastr('Código do personagem já cadastrado!<br />Clique para continuar!','error',$destino)</script>";
            }

            $stmt = $conn->prepare('INSERT INTO tb_personagem VALUES
            (:codigo,:nome,:altura,:peso,:nome_franquia,:genero)');
            $stmt->bindValue(':codigo', $codigo);
            $stmt->bindValue(':nome', $nome);
            $stmt->bindValue(':altura', $altura);
            $stmt->bindValue(':peso', $peso);
            $stmt->bindValue(':nome_franquia', $nome_franquia);
            $stmt->bindValue(':genero', $genero);
            $stmt->execute();
        } catch (PDOException $e) {

            $destino = "function () {window.location='index.php';}";
            echo "<script>sendToastr($e->$getMessage(), 'error',$destino)</script>";
            die();
        }

        $destino = "function () {window.location='inclusao_personagem.php';}";
        echo "<script>sendToastr('Personagem cadastrado com sucesso!<br />Clique para continuar!','success',$destino)</script>";
    }
    ?>

    <?php $cabecalho = require_once('funcoes/cabecalho.php');
    echo $cabecalho ?>

    <article class="artigo">
        <div class="secaoConteudo">

            <h1 class="titulo">Cadastro de Personagem</h1>
            <h3>Inclusão:</h3>

            <form method="POST" action="inclusao_personagem.php" name="form_inclusao">
                <table>
                    <tr>
                        <td class="label">Código:</td>
                        <td>
                            <input name="codigo" type="number" id="codigo" size="10" maxlength="10" required="required" class="inpInsercao">*
                        </td>
                    </tr>

                    <tr>
                        <td class="label">Nome:</td>
                        <td>
                            <input name="nome" type="text" id="nome" size="255" maxlength="255" required="required" class="inpInsercao">*
                        </td>
                    </tr>

                    <tr>
                        <td class="label">Altura:</td>
                        <td>
                            <input name="altura" type="text" id="altura" size="10" maxlength="10" required="required" class="inpInsercao">*
                        </td>
                    </tr>

                    <tr>

                        <td class="label">Peso:</td>
                        <td>
                            <input name="peso" type="text" id="peso" size="10" maxlength="10" required="required" class="inpInsercao">*
                        </td>

                    </tr>

                    <tr>
                        <td class="label">Nome da Franquia:</td>
                        <td>
                            <input name="nome_franquia" type="text" id="nome_franquia" size="255" maxlength="255" required="required" class="inpInsercao">*
                        </td>
                    </tr>

                    <tr>
                        <td class="label">Gênero:</td>
                        <td>
                            <select name="genero" required="required" class="inpInsercao">
                                <option value="">Selecione o gênero</option>
                                <option value="Masculino">Masculino</option>
                                <option value="Feminino">Feminino</option>
                            </select>*
                        </td>

                    </tr>

                    <tr>
                        <td colspan='2'>
                            <br />
                            <input type="hidden" name="form_operacao" value="inclusao_personagem">
                            <input type="submit" name="enviar" value="Inserir Novo Personagem" class="botao">
                            * dados obrigatórios
                        </td>
                    </tr>
                </table>
                <p><a href="JavaScript: window.history.back();">Voltar</a></p>
            </form>
        </div>
    </article>

    <?php $rodape = require_once('funcoes/rodape.php');
    echo $rodape ?>
</body>

</html>