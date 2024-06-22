<!doctype html>
<html lang="pt-br">
<header>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="stylesheet" href="../Helpers/centralizador.css">
</header>

<body style="text-align:center" class="text-white bg-dark">
    <?php require_once './menu.php' ?>

    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        include_once '../models/usuario.php';
        include_once '../daos/usuarioDAO.php';

        $email = $_POST["email"];
        $senha = $_POST["senha"];

        $dao = new usuarioDAO();

        $dao->inserir($email, $senha);

        header('Location: ./index.php');
    }
    ?>

        <h2 style="color:chartreuse">Criar Conta</h2>

        <form class="m-3" action="usuarioInserir.php" name="formulario_postado" method="post">
            <?php
            require "../DAOs/usuarioDAO.php";
            require "./controles.php";

            input('email', 'E-mail', '', false, "email", 100, 100);
            input('senha', 'Senha', '', false, "password", 100, 100);
            ?>
            <br>
            <button class="btn btn-success">Salvar</button>
            <a class="btn btn-secondary" href="./index.php">Voltar para a Página Inicial</a>
        </form>
    </article>
    <?php require_once './rodape.php' ?>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>

</html>