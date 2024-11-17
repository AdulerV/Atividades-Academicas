<!doctype html>
<?php include("checarlogin.php") ?>
<html lang="pt-br">
<header>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="stylesheet" href="../Helpers/centralizador.css">
</header>

<body style="text-align:center" class="text-white bg-dark">
    <?php require_once './menu.php' ?>

    <article>
        <h2 style="color:chartreuse">Consultando Personagem</h2>

        <form class="m-3">
            <?php
            require "../DAOs/personagemDAO.php";
            require "./controles.php";

            $codigo = $_GET["codigo"];

            $dao = new personagemDAO();

            $obj = $dao->retornarPorId($codigo);

            if ($obj) {

                input('nome', 'Nome', $obj->nome, true, 'text', null, null);
                input('altura', 'Altura', $obj->altura, true, 'text', null, null);
                input('peso', 'Peso', $obj->peso, true, 'text', null, null);
                input('nome_franquia', 'Nome da Franquia', $obj->nome_franquia, true, 'text', null, null);
                input2($obj->genero, true);
            } else {
                echo "<p>Personagem não encontrado.</p>";
            }
            echo '<input type="hidden" name="codigo" value="' . $codigo . '">';

            ?>
            <a class="btn btn-secondary" href="./personagemlistar.php">Voltar</a>
        </form>
    </article>

    <?php require_once './rodape.php' ?>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>

</html>