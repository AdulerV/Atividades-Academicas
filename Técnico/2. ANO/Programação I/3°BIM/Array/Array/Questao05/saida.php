<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Questão 05</title>
    <link rel="stylesheet" href="../css/saida.css">
</head>

<body>
    <?php
    /*5. Acima da média - Elaborar um algoritmo para calcular e imprimir o número de alunos que tiraram
nota acima da nota média da turma. Preencher o vetor com valores aleatórios (função rand), a turma
tem 40 alunos.*/


    echo "<div><h3><b>Preenchimento Vetor:</b></h3>";

    $soma = 0;

    for ($i = 1; $i <= 40; $i++) {

        $nota[$i] = rand(0, 10);
        $soma += $nota[$i];
        echo "<div><b>Aluno $i:</b> $nota[$i]<div><br>";
    }

    $media = $soma / 40;
    $cont = 0;

    for ($i = 1; $i <= 40; $i++) {

        if ($nota[$i] > $media) {
            $cont++;
        }
    }

    echo "<b>Média da turma: </b> $media <br>";
    echo "<b>Alunos que tiraram acima da média: </b> $cont";
    ?>
</body>

</html>