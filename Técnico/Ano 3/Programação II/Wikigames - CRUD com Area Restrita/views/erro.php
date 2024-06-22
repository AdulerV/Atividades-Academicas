<!doctype html>
<html lang="pt-br">
<header>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</header>

<body style="text-align:center" class="text-white bg-dark">
    <?php require_once './menu.php' ?>

    <?php
    echo '<section style="width:500px;  position:absolute; top:50%; left:50%; transform: translate(-50%, -50%);">';
    ?>

    <h2 class="text-danger">Erro:</h2>

    <?php
    echo '<br><div class="p-3 text-danger-emphasis bg-danger-subtle border border-danger-subtle rounded-3">' .
        $_GET["mensagem"] .
        '</div><br>';
    ?>

    <button class="btn btn-secondary" onclick="voltar()">Voltar</button>

    <script>
        function voltar() {
            window.history.back();
        }
    </script>

    <?php
    echo '</section>';
    require_once './rodape.php'
    ?>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>

</html>