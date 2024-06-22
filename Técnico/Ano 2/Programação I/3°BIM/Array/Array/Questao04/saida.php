<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Questão 04</title>
    <link rel="stylesheet" href="../css/saida.css">
</head>

<body>
    <?php
    /*4. Preenchimento Vetor - Escreva um algoritmo que:
a) Leia um conjunto A de 100 elementos reais;
b) construa e imprima um outro conjunto B formado da seguinte maneira:
i) os elementos de ordem par são os correspondentes de A divididos por 2.
ii) os elementos de ordem ímpar são os correspondentes de A multiplicados por 3.*/
    echo "<div><h3><b>Preenchimento Vetor:</b></h3>";
    for ($i = 1; $i <= 100; $i++) {
        $a[$i] = $i;

        if ($i % 2 == 0) {
            $b[$i] = $a[$i] / 2;
        } else {
            $b[$i] = $a[$i] * 3;
        }
    }
    echo "<b>Vetor A:</b>";
    var_dump($a);
    echo "<b>Vetor B:</b>";
    var_dump($b);
    ?>
</body>

</html>