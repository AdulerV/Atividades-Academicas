<!doctype html>
<?php include("checarlogin.php") ?>
<html lang="pt-br">
<header>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="stylesheet" href="../Helpers/centralizador.css">
</header>

<body style="text-align:center" class="text-white bg-dark">
    <?php require_once './menu.php' ?>

    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        include_once '../Models/personagem.php';
        include_once '../DAOs/personagemDAO.php';

        $mensagensErro = false;

        $peso = $_POST["peso"];
        $altura = $_POST["altura"];

        if (!is_numeric($peso) || !is_numeric($altura)) {
            $mensagensErro = "Os campos 'Peso' e 'Altura' precisam ser um valor numérico.";
        } else {

            $obj = new personagem();

            $obj->nome = $_POST['nome'];
            $obj->altura = $_POST['altura'];
            $obj->peso = $_POST['peso'];
            $obj->nome_franquia = $_POST["nome_franquia"];
            $obj->genero = $_POST["genero"];

            $dao = new personagemDAO();

            $dao->inserir($obj);

            header('Location: ./personagemListar.php');
        }
        if ($mensagensErro) {
            header('Location: ./erro.php?mensagem=' . $mensagensErro);
        }
    }
    ?>

    <article>
        <h2 style="color:chartreuse">Cadastro de Personagens</h2>

        <form class="m-3" action="personagemInserir.php" name="formulario_postado" method="post">
            <?php
            require "../DAOs/personagemDAO.php";
            require "./controles.php";

            input('nome', 'Nome', '', false, 'text', 255, 255);
            input('altura', 'Altura', '', false, 'text', null, null);
            input('peso', 'Peso', '', false, 'text', null, null);
            input('nome_franquia', 'Nome da Franquia', '', false, 'text', 255, 255);
            input2("", false);

            echo '<input type="hidden" name="codigo" value="' . $codigo . '">';
            ?>
            <br>
            <button class="btn btn-success">Salvar</button>
            <a class="btn btn-secondary" href="./personagemListar.php">Voltar</a>
        </form>
    </article>

    <?php require_once './rodape.php' ?>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>

</html>