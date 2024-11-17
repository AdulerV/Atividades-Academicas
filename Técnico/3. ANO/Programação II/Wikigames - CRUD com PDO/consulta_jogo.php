<?php
header("Content-Type: text/html; charset=utf-8", true);
error_reporting(E_ERROR | E_WARNING | E_PARSE);
?>
<!DOCTYPE HTML>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <title>Wiki games</title>
    <link rel="stylesheet" href="css/consulta.css">
    <link rel="shortcut icon" href="images/favicon.png" type="image/x-icon">
    <link href="css/toastr.css" rel="stylesheet" />
    <script src="jquery/jquery-3.3.1.min.js"></script>
    <script src="popper/popper.min.js"></script>
    <script src="bootstrap4/js/bootstrap.min.js"></script>
    <script src="funcoes/toastr.min.js"></script>
    <script src="funcoes/funcao_toastr.js"></script>
</head>

<body>
    <?php $cabecalho = require_once('funcoes/cabecalho.php');
    echo $cabecalho ?>

    <article class="artigo">
        <div class="secaoConteudo">
            <h1 class="titulo">Cadastro de Jogos</h1>

            <form method="post" action="relatorio_paginacao_filtro_jogo.php?pagina=1">
                <p><input name="filtro" type="text" id="filtro" class="inpInsercao" placeholder="Insira o Nome do Jogo" size="30" maxlength="30">
                    <input type="submit" name="submit" value="Pesquisar Jogo" class="botao">
                </p>

                <?php
                try {
                    require_once 'funcoes/conexao.php';

                    $result = $conn->query("SELECT * FROM tb_jogo");
                    $count = $result->rowCount();

                    if ($count > 0) {
                        echo "<table border='1'>";

                        echo "<thead><th colspan='6'><h3>Consulta de Jogo:</h3></th></thead>";

                        echo "<tr>\n";

                        echo "<td>\n";
                        echo "<b>Código</b>\n";
                        echo "</td>\n";

                        echo "<td>\n";
                        echo "<b>Nome</b>\n";
                        echo "</td>\n";

                        echo "<td>\n";
                        echo "<b>Data de lançamento</b>\n";
                        echo "</td>\n";

                        echo "<td>\n";
                        echo "<b>Plataformas</b>\n";
                        echo "</td>\n";

                        echo "<td>\n";
                        echo "<b>Desenvolvedora</b>\n";
                        echo "</td>\n";

                        echo "<td>\n";
                        echo "<b>Alteração</b>\n";
                        echo "</td>\n";

                        echo "</tr>\n";

                        while ($row = $result->fetch(PDO::FETCH_OBJ)) {

                            echo "<tr>\n";

                            echo "<td >\n";
                            echo $row->codigo . "&nbsp;\n";
                            echo "</td>\n";

                            echo "<td >\n";
                            echo $row->nome . "&nbsp;\n";
                            echo "</td>\n";

                            echo "<td >\n";
                            echo $row->data_lancamento . "&nbsp;\n";
                            echo "</td>\n";

                            echo "<td >\n";
                            echo $row->plataforma . "&nbsp;\n";
                            echo "</td>\n";

                            echo "<td >\n";
                            echo $row->desenvolvedora . "&nbsp;\n";
                            echo "</td>\n";

                            echo "<td>\n";
                            echo "<a href='alteracao_exclusao_jogo.php?codigo=" . $row->codigo . "'>";
                            echo "<img class='imglink' src='images/xis.png' border='0'><img class='imglink' src='images/circulo.png' border='0'></a>&nbsp;\n";
                            echo "</td>\n";

                            echo "</tr>\n";
                        }
                    } else {
                        $destino = "function () {window.location='index.php';}";
                        echo "<script>sendToastr('Nenhum jogo foi encontrado! <br /> Clique para continuar!','error',$destino)</script>";
                    }
                    echo "</table>";
                    $conn = null;
                } catch (PDOException $e) {
                    $destino = "function () {window.location='index.php';}";
                    echo "<script>sendToastr($e->$getMessage(),'error',$destino)</script>";
                    die();
                }
                ?>
            </form>
        </div>
    </article>

    <?php $rodape = require_once('funcoes/rodape.php');
    echo $rodape ?>
</body>

</html>