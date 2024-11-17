<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/saida.css">
    <title>Questão 09</title>
</head>

<body>
    <?php
    /*9. Método da bolha - Elaborar um algoritmo que leia um vetor A de 20 elementos inteiros e o classifique
    em ordem crescente.*/
    echo "<div><h3><b>Método da bolha:</b></h3>";

    for ($i = 1; $i <= 20; $i++) {
        $A[$i] = rand(0, 10); 
    }
    echo "<div><h3><b>Vetor desordenado:</b></h3>";
    var_dump($A);
    echo "<div><h3><b>Vetor em ordem crescente:</b></h3>";
    sort($A);
    var_dump($A);
    ?>
</body>

</html>