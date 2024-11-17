<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <?php 
    $n1 = 8;
    $n2 = 7.5;
    $n3 = 10;
    $n4 = 9;
    $media = ($n1 + $n2*2 + $n3*3 + $n4*4)/10;

    echo "<b>A media do aluno é:</b> " . number_format($media, 1);
    ?>
    
</body>
</html>