<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/PrimeirosExercicios/saida1.css">
    <title>Questão 01</title>
</head>

<body>
    <div>
        <?php
        function sorte()
        {
            for ($contador = 1; $contador <= 100; $contador++) {
                echo " $contador. SORTE <br>";
            }
        }

        echo sorte();
        ?>
    </div>
</body>

</html>