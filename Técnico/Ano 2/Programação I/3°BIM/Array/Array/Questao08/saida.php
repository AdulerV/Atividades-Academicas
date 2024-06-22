<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/saida.css">
    <title>Questão 08</title>
</head>
<body>
    <?php
    /*8. Soma linha - Dada uma matriz MAT de 4x5 elementos (fornecida pelo teclado), faça um algoritmo
    para somar os elementos de cada linha gerando o vetor SOMALINHA. Em seguida, somar os
    elementos do vetor SOMALINHA na variável TOTAL que deve ser impressa ao final. */

    echo "<div><b>Soma linha:</b><br><br>";

    $lin1 = 0;
    $lin2 = 0;
    $lin3 = 0;
    $lin4 = 0;

    for ($i = 1; $i <= 4; $i++) {
        for ($j = 1; $j <= 5; $j++) {
            $MAT[$i][$j] = rand(0, 10);

            switch ($i) {
                case $i == 1:
                    $lin1 += $MAT[$i][$j];
                    break;
                case $i == 2:
                    $lin2 += $MAT[$i][$j];
                    break;
                case $i == 3:
                    $lin3 += $MAT[$i][$j];
                    break;
                case $i == 4:
                    $lin4 += $MAT[$i][$j];
                    break;
                default:
                    break;
            }
        }
    }
    $SOMALINHA = array(1 => $lin1, 2 => $lin2, 3 => $lin3, 4 => $lin4);
    $TOTAL = $lin1 + $lin2 + $lin3 + $lin4;

    echo "<b>Vetor MAT:</b>";
    var_dump($MAT);
    echo "<b>Vetor SOMALINHA:</b>";
    var_dump($SOMALINHA);
    echo "<b>Vetor TOTAL: </b>";
    echo $TOTAL;
    ?>
</body>
</html>