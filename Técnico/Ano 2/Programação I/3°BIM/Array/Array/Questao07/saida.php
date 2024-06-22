<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/saida.css">
    <title>Questão 07</title>
</head>

<body>
    <?php
    /*6.Dada uma matriz M de 5x3 elementos inteiros (fornecida pelo teclado), faça um
algoritmo para:
a) Percorrer a matriz linha por linha (fixe a linha, varie a coluna).
b) Percorrer a matriz coluna por coluna (fixe a coluna, varie a linha).*/

    echo "<div><b>a) Percorrer a matriz linha por linha (fixe a linha, varie a coluna).</b>";

    for ($i = 1; $i <= 5; $i++) {
        for ($j = 1; $j <= 3; $j++) {
            $m[$i][$j] = rand(0, 10);
        }
    }

    var_dump($m);

    echo "<b>b) Percorrer a matriz coluna por coluna (fixe a coluna, varie a linha).</b>";
    for ($j = 1; $j <= 3; $j++) {
        for ($i = 1; $i <= 5; $i++) {
            $m[$i][$j] = rand(0, 10);
        }
    }
    var_dump($m);
    ?>
</body>

</html>