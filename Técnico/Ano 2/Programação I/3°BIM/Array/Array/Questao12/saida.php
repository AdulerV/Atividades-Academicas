<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Questão 12</title>
    <link rel="stylesheet" href="../css/saida.css">
</head>

<body>
    <?php
    /*12. Megasena - Elaborar um aplicativo capaz de sortear palpites para a Megasena. O programa deve
    receber como entrada o número de cartões e o número de palpites por cartão, fornecendo como saída
    os palpites sorteados.*/
    if (isset($_POST["cartoes"], $_POST["palpites"]) && $_POST["cartoes"] != null && $_POST["palpites"] != null) {
        
        echo "<div><h3><b>Palpites Sorteados: </b></h3>";
        $cartões = $_POST['cartoes'];
        $palpites =  $_POST['palpites'];
        $num = [];

        for ($i = 1; $i <= $palpites; $i++) {
            for ($j = 1; $j <= $cartões; $j++) {
                $num[$j][$i] = rand(1, 60);
            }
        }
        var_dump($num);
    } else {
        $cartões = 0;
        $palpites =  0;
        $num = 0;
        echo "<p>Insira um valor válido</p>";
    }


    ?>
</body>

</html>