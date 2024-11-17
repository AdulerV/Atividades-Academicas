<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Questão 02</title>
    <link rel="stylesheet" href="../css/saida.css">
</head>

<body>
    <?php
    /*2. Soma Vetores - Elaborar um algoritmo que defina e leia dois vetores A e B com 20 elementos inteiros
cada, calcule e imprima o vetor SOMA.*/
    echo "<div><h3><b>Soma Vetores:</b></h3>";

    for ($i = 1; $i <= 20; $i++) {
        $a[$i] = rand(1, 10);
        $b[$i] = rand(1, 10);

        $soma[$i] = $a[$i] + $b[$i];
    }
    echo "<b>Vetor A:</b>";
    var_dump($a);
    echo "<b>Vetor B:</b>";
    var_dump($b);
    echo "<b>Vetor SOMA:</b>";
    var_dump($soma);
    ?>
</body>

</html>