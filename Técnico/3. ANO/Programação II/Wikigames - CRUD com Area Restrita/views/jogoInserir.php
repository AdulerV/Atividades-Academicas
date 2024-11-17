<!doctype html>
<?php include("checarlogin.php") ?>
<html lang="pt-br">
<header>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</header>

<body style="text-align:center" class="text-white bg-dark">
    <?php require_once './menu.php' ?>

    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        include_once '../Models/jogo.php';
        include_once '../DAOs/jogoDAO.php';


        $obj = new Jogo();

        $obj->nome = $_POST["nome"];
        $obj->data_lancamento = $_POST["data_lancamento"];
        $obj->plataforma = $_POST["plataforma"];
        $obj->desenvolvedora = $_POST["desenvolvedora"];

        $dao = new jogoDAO();

        $dao->inserir($obj);


        header('Location: jogolistar.php');
    }
    ?>

    <h2 style="color:chartreuse">Cadastro de jogos</h2>

    <form class="m-3" action="jogoInserir.php" name="formulario_postado" method="post">
        <?php
        require "../DAOs/jogoDAO.php";
        require "./controles.php";

        input('nome', 'Nome', '', false, 'text', 255, 255);
        input('data_lancamento', 'Data de Lançamento', '', false, 'date', null, null);
        input('plataforma', 'Plataforma', '', false, 'text', 1000, 1000);
        input('desenvolvedora', 'Desenvolvedora', '', false, 'text', 200, 200)
        ?>
        <button class="btn btn-success">Salvar</button>
        <a class="btn btn-secondary" href="./jogoListar.php">Voltar</a>

    </form>

    <?php require_once './rodape.php' ?>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>

</html>