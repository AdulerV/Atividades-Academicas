<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Questão 04</title>
    <link rel="stylesheet" href="index.css">
</head>

<body>
    <form>
        <h2>Soma dos cem:</h2>
        <?php
        $soma = 0;
        for ($valor = 1; $valor <= 100; $valor++) {
            $soma += $valor;
        }
        echo "$soma";
        ?>
    </form>
</body>

</html>