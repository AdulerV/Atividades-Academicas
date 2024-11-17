<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/PrimeirosExercicios/saida1.css">
    <title>Resultado</title>
</head>

<body>
    <div>
        <?php
        if (isset($_POST['num']) && $_POST['num'] != null) {
            $num = $_POST['num'];
            echo informatica($num);
        } else {
            $num = 0;
            echo "<p>Insira um valor válido</p>";
        }

        function informatica($n)
        {
            for ($contador = 1; $contador <= $n; $contador++) {
                echo "$contador. INFORMÁTICA <br>";
            }
        }
        ?>
    </div>
</body>

</html>