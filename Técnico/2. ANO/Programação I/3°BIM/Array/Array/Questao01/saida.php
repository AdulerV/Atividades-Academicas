<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Questão 01</title>
    <link rel="stylesheet" href="../css/saida.css">

</head>

<body>
    <?php
    /* Média turma - Um professor tem uma turma de 80 alunos e deseja calcular e imprimir a nota de cada
aluno seguida da média da turma. As notas serão fornecidas pelo teclado. Elaborar um algoritmo para
automatizar a situação */

    $soma = 0;
    echo "<div><h3>Soma das Notas</h3><div><br>";
    for ($i = 1; $i <= 80; $i++) {
        $nota[$i] = rand(0, 10);
        $soma += $nota[$i];
        echo "<div><b>Aluno $i:</b> $nota[$i]<div><br>";
    }

    $media = $soma / 80;

    echo "<br><b>Soma das notas:</b> $soma <br>";
    echo "<br><b>Media das notas:</b> $media<br>";
    ?>
</body>

</html>