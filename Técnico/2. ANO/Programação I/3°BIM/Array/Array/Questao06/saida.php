<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Questão 06</title>
    <link rel="stylesheet" href="../css/saida.css">
</head>

<body>
    <?php
    /*6. Soma matrizes - Escreva um algoritmo que leia duas matrizes reais de dimensão 3x5, calcule e
imprima a soma das matrizes.*/

    echo "<div><h3><b>Soma matrizes:</b></h3>";

    for ($i = 1; $i <= 3; $i++) {
        for ($j = 1; $j <= 5; $j++) {
            $v1[$i][$j] = rand(0, 10);
            $v2[$i][$j] = rand(0, 10);
            $soma[$i][$j] = $v1[$i][$j] + $v2[$i][$j];
        }
    }
    echo "<b>Primeira Matriz:</b>";
    var_dump($v1);
    echo "<b>Segunda Matriz:</b>";
    var_dump($v2);
    echo "<b>Soma das Matrizes: </b>";
    var_dump($soma);
    ?>
</body>

</html>