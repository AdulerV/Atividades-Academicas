<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Questão 10</title>
    <link rel="stylesheet" href="../css/saida.css">
</head>

<body>
    <?php
    /*10. Busca seqüencial e busca binária - Dado um vetor A de 128 elementos inteiros, verificar se existe
    um elemento igual K (chave) no vetor. Se existir, imprimir a posição onde foi encontrada a chave; se
    não, imprimir: 'chave K não encontrada'. O vetor A e a chave K são fornecidos pelo teclado.*/
    if (isset($_POST['num']) && $_POST['num'] != null) {

        echo "<div><h3><b>Busca seqüencial:</b></h3>";
        $K = $_POST['num'];
        $auxiliar = 0;

        for ($i = 1; $i <= 128; $i++) {
            $A[$i] = rand(0, 100);

            if ($A[$i] == $K) {
                $auxiliar = $A[$i];
                $pos = $i;
            }
        }
        var_dump($A);

        if ($auxiliar == $K) {
            echo "<b>Chave encontrada na posição</b> $pos.<br>";
        } else {
            echo "<b>Chave não encontrada</b><br>";
        }
    } else {
        $K = 0;
        $auxiliar = 0;
        echo "<p>Insira um valor válido</p>";
    }

    ?>
</body>

</html>