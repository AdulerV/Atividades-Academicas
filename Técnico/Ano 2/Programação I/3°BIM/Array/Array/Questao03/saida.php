<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Questão 03</title>
    <link rel="stylesheet" href="../css/saida.css">
</head>

<body>
    <?php
    /*3. Preenchimento Vetor - Dado o vetor VET, definido por:
int VET[100];
a) preenchê-lo com o valor inteiro 30;
b) preenchê-lo com o números inteiros 1, 2, 3, ..., 100;
c) preencher VET[i] com 1, se i é quadrado perfeito, e com 0, nos demais casos.*/
    echo "<div><h3><b>Preenchimento Vetor:</b></h3>";
    for ($i = 1; $i <= 100; $i++) {
        $VET[$i] = 30;
    }
    echo "<b>a) Preenchê-lo com o valor inteiro 30;</b>";
    var_dump($VET);

    for ($i = 1; $i <= 100; $i++) {
        $VET[$i] = $i;
    }
    echo "<b>b) preenchê-lo com o números inteiros 1, 2, 3, ..., 100;</b>";
    var_dump($VET);

    for ($i = 1; $i <= 100; $i++) {
        $aux = sqrt($i);
        $aux2 = intval($aux);

        if ($aux2 * $aux2 == $i) {
            $VET[$i] = 1;
        } else {
            $VET[$i] = 0;
        }
    }
    echo "<b>c) preencher VET[i] com 1, se i é quadrado perfeito, e com 0, nos demais casos.</b>";
    var_dump($VET);
    ?>
</body>

</html>