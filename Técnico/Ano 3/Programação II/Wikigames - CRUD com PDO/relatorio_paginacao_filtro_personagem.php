<?php
header("Content-Type: text/html; charset=utf-8", true);
error_reporting(E_ERROR | E_WARNING | E_PARSE);
?>
<!DOCTYPE HTML>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <title>Wiki games</title>
    <link rel="stylesheet" href="css/relatorio.css">
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
            <h1 class="titulo">Cadastro de Personagens</h1>

            <form>
                <?php
                $ComandoSQL = "";
                $filtro = "";
                $maximo = 0;
                $pagina = 0;
                $inicio = 0;
                try {
                    require_once 'funcoes/conexao.php';

                    if (isset($_REQUEST['filtro'])) {
                        $filtro = $_REQUEST['filtro'];
                    }
                    $maximo = 5;

                    $pagina = intval(($_GET["pagina"]));
                    if ($pagina == "") {
                        $pagina = "1";
                    }
                    $inicio = $pagina - 1;
                    $inicio = $maximo * $inicio;

                    $ComandoSQL = "SELECT * FROM tb_personagem WHERE nome LIKE '%$filtro%'";
                    $result = $conn->query($ComandoSQL);
                    $rows = $result->fetchAll();
                    $total = count($rows);

                    $ComandoSQL = "SELECT * FROM tb_personagem WHERE nome LIKE '%$filtro%' LIMIT $inicio, $maximo";
                    $result = $conn->query($ComandoSQL);

                    if ($total == 0) {
                        $destino = "function () {window.location='consulta_personagem.php';}";
                        echo "<script>sendToastr('Nenhum personagem foi encontrado! <br /> Clique para continuar!','error',$destino)</script>";
                    } else {
                        echo "<table border='1'>";

                        echo "<thead><th colspan='7'><h3>Relatório de Personagem:</h3></th></thead>";

                        echo "<tr>\n";

                        echo "<td>\n";
                        echo "<b>Código</b>\n";
                        echo "</td>\n";

                        echo "<td>\n";
                        echo "<b>Nome</b>\n";
                        echo "</td>\n";

                        echo "<td>\n";
                        echo "<b>Altura</b>\n";
                        echo "</td>\n";

                        echo "<td>\n";
                        echo "<b>Peso</b>\n";
                        echo "</td>\n";

                        echo "<td>\n";
                        echo "<b>Nome da Franquia</b>\n";
                        echo "</td>\n";

                        echo "<td>\n";
                        echo "<b>Gênero</b>\n";
                        echo "</td>\n";

                        while ($row = $result->fetch(PDO::FETCH_OBJ)) {
                            echo "<tr>\n";

                            echo "<td >\n";
                            echo $row->codigo . "&nbsp;\n";
                            echo "</td>\n";

                            echo "<td >\n";
                            echo $row->nome . "&nbsp;\n";
                            echo "</td>\n";

                            echo "<td >\n";
                            echo $row->altura . " m &nbsp;\n";
                            echo "</td>\n";

                            echo "<td >\n";
                            echo $row->peso . " Kg &nbsp;\n";
                            echo "</td>\n";

                            echo "<td >\n";
                            echo $row->nome_franquia . "&nbsp;\n";
                            echo "</td>\n";

                            echo "<td >\n";
                            echo $row->genero . "&nbsp;\n";
                            echo "</td>\n";
                        }
                    }
                    echo "</table>";
                } catch (PDOException $e) {
                    print "Erro!: " . $e->getMessage() . "<br/>";
                    die();
                }
                $menos = $pagina - 1;
                $mais = $pagina + 1;
                $pgs = ceil($total / $maximo);
                if ($pgs > 1) {
                    echo "<br clear='all'/><br/><br/>";

                    if ($menos > 0) {
                        echo "<a href='relatorio_paginacao_filtro_personagem.php?pagina=$menos&filtro=$filtro'>
		            <button type='button' class='btn btn-outline-success'>Anterior</button></a> | ";
                    }

                    for ($i = 1; $i <= $pgs; $i++) {
                        if ($i != $pagina) {
                            echo "<a href='relatorio_paginacao_filtro_personagem.php?pagina=$i&filtro=$filtro'>
				        <button type='button' class='btn btn-outline-success'>$i</button></a> | ";
                        } else {
                            echo "<strong><font color='#000'>$i</font></strong> | ";
                        }
                    }

                    if ($mais <= $pgs) {
                        echo "<a href='relatorio_paginacao_filtro_personagem.php?pagina=$mais&filtro=$filtro'>
			        <button type='button' class='btn btn-outline-success'>Próxima</button></a>";
                    }
                }
                $conn = null;
                ?>
            </form>
            <p><a href="consulta_personagem.php">Voltar</a></p>
        </div>
    </article>

    <?php $rodape = require_once('funcoes/rodape.php');
    echo $rodape ?>
</body>

</html>