<?php include("checarlogin.php") ?>
<html lang="pt-br">
    <header>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    </header>
    <body style="text-align:center" class="text-white bg-dark">
        <?php require_once './menu.php' ?>
      
        <?php 
      
            if ($_SERVER["REQUEST_METHOD"] == "POST") {
                include_once '../DAOs/jogoDAO.php';

                $codigo=$_POST["codigo"];
                
                $dao = new jogoDAO();

                $dao->excluir($codigo);

                header('Location: ./jogolistar.php');
            }
        ?>

        <h2 style="color:chartreuse">Excluindo jogo</h2>

        <form class="m-3" action="jogoExcluir.php" name="formulario_postado" method="post">            <?php
                require "../DAOs/jogoDAO.php";
                require "./controles.php";

                $codigo= $_GET["codigo"];

                $dao = new jogoDAO();

                $obj = $dao->retornarPorId($codigo);
                
                if ($obj) {
                    input('nome', 'Nome', $obj->nome, true, "text",null,null);
                    input('nome', 'Nome', $obj->nome, true, "text",null,null);
                    input('data_lancamento', 'Data de Lançamento', $obj->data_lancamento, true, "date",null,null);
                    input('plataforma', 'Plataforma', $obj->plataforma, true, "text",null,null);
                    input('desenvolvedora', 'Desenvolvedora', $obj->desenvolvedora, true, "text",null,null);
                }
                else {
                    echo "<p>Aluno não encontrado.</p>";
                }

                echo '<input type="hidden" name="codigo" value="' . $codigo . '">';
                
            ?>
            <button class="btn btn-danger">Excluir</button>
            <a class="btn btn-secondary" href="./jogoListar.php">Voltar</a>
        </form>

        <?php require_once './rodape.php' ?>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    </body>
</html>