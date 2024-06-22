<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Questão7</title>
    <link rel="stylesheet" href="Questao7.css">

    <?php

    error_reporting(0);

    if (isset($_POST['inputNumero'])) {
        $x = $_POST['inputNumero'];
    }

    ?>

</head>

<body>
    <form action="Questao7.php" method="POST">
        <h2>Impar ou Par</h1>
            <label for="inputNumero"><input type="number" id="inputNumero" name="inputNumero"></label>
            <p> <?php if (!is_nan($x)) {
                    echo $x % 2 == 0 ? "O valor inserido ($x) é par" : "O valor inserido ($x) é impar";
                }
                ?></p>
            <label for="inputSubmit"><input type="submit" id="inputSubmit"></label>
    </form>
</body>

</html>