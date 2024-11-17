<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Questão4</title>
    <link rel="stylesheet" href="Questao4.css">
    <?php
    error_reporting(0);

    if (isset($_POST['inputX'], $_POST['inputY'])) {

        $x = $_POST['inputX'];
        $y = $_POST['inputY'];

        if ((!is_nan($x)) && !is_nan($y)) {

            $restoDaDivisao = $x % $y;
            $quociente = $x / $y;
        }
    }
    ?>
</head>

<body>

    <form name="formularioDivisao" action="Questao4.php" method="POST">
        <label for="inputX">Insira o primeiro valor:
            <br>
            <input type="number" min="0" name="inputX" id='inputX'></label>
        <br>
        <br>
        <label for="inputY">Insira o segundo valor:
            <br>
            <input type="number" min="0" name="inputY" id="inputY"></label>
        <br>
        <br>
        <p><?php echo "O quociente é " . number_format($quociente, 0) . " e o resto da divisão é $restoDaDivisao"; ?></p>
        <br>
        <label for="inputButton"><input type="submit" name="inputButton"></label>
    </form>
</body>

</html>