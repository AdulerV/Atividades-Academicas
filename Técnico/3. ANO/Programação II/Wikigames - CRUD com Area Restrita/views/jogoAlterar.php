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
        require_once '../models/jogo.php';
        require_once '../DAOs/jogoDAO.php';

        $obj = new Jogo();

        $obj->codigo = $_POST["codigo"];
        $obj->nome = $_POST["nome"];
        $obj->data_lancamento = $_POST["data_lancamento"];
        $obj->plataforma = $_POST["plataforma"];
        $obj->desenvolvedora = $_POST["desenvolvedora"];

        $dao = new jogoDAO();

        $dao->alterar($obj);

        header('Location: ./jogoListar.php');
    }
    ?>

    <h2 style="color:chartreuse">Alterando Jogo</h2>

    <form class="m-3" action="jogoAlterar.php" name="formulario_postado" method="post">
        <?php
        require_once "../DAOs/jogoDAO.php";
        require_once "./controles.php";

        $codigo = $_GET["codigo"];

        $dao = new jogoDAO();

        $obj = $dao->retornarPorId($codigo);

        if ($obj) {
            input('nome', 'Nome', $obj->nome, false, "text", 255, 255);
            input('data_lancamento', 'Data de Lançamento', $obj->data_lancamento, false, "date", null, null);
            input('plataforma', 'Plataforma', $obj->plataforma, false, "text", 1000, 1000);
            input('desenvolvedora', 'Desenvolvedora', $obj->desenvolvedora, false, "text", 200, 200);
        } else {
            echo "<p>Jogo não encontrado.</p>";
        }

        echo '<input type="hidden" name="codigo" value="' . $codigo . '">';

        ?>
        <button class="btn btn-success">Salvar</button>
        <a class="btn btn-secondary" href="./jogoListar.php">Voltar</a>
    </form>
    <?php require_once './rodape.php' ?>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>

</html>