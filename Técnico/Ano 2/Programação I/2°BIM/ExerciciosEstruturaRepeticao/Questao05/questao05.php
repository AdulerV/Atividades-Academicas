<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Questão 05</title>
    <link rel="stylesheet" href="index.css">
</head>

<body>
    <form>
        <h2>Divisibilidade por 5:</h2>
        <?php
        for ($num = 1; $num <= 100; $num++) {
            if ($num % 5 == 0) {
                echo "$num,";
            }
        }
        ?>
    </form>
</body>

</html>