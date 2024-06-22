<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Questão 11</title>
    <link rel="stylesheet" href="../css/saida.css">
</head>

<body>
    <?php
    /*11. Projeto - Codificar um programa capaz de verificar em um vetor de 1000 elementos inteiros qual é o
    maior e menor número, a média aritmética dos números e a quantidade de números pares e impares. O
    programa deverá inicialmente preencher o vetor com números aleatórios entre 0 e 1000, para isso
    sugiro a utilização da função rand.*/
    echo "<div><h3><b>Projeto: </b></h3>";

    $par = 0;
    $impar = 0;
    $soma = 0;

    for ($i = 1; $i <= 1000; $i++) {
        $vetor[$i] = rand(0, 1000);

        if ($vetor[$i] % 2 == 0) {
            $par++;
        } else {
            $impar++;
        }

        $soma += $vetor[$i];
        $maior = max($vetor);
        $menor = min($vetor);
    }
    $media = $soma / 1000;
    var_dump($vetor);
    echo "<b>Maior: </b>$maior;  <b>Menor: </b>$menor. <br> 
    <b>Média: </b>$media. <br> 
    <b>Quantidade de pares: </b>$par;  <b>Quantidade de ímpares: </b>$impar<b>."
    ?>
</body>

</html>