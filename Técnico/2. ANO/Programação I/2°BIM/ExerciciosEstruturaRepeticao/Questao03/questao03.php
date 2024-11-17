<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Questão 03</title>
    <link rel="stylesheet" href="index.css">
</head>

<body>
    <form>
        <h2>Pares:</h2>
        <?php
        for ($valor = 0; $valor <= 50; $valor++) {
            if ($valor % 2 == 0) {
                echo $valor . ", ";
            }
        }
        ?>
    </form>
</body>

</html>