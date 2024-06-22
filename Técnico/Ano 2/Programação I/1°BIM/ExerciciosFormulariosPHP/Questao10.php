<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Questão10</title>
    <link rel="stylesheet" href="Questao10.css">

    <?php
    error_reporting(0);

    if (isset($_POST['inputNum1'], $_POST['inputNum2'], $_POST['inputNum3'])) {

        $num1 = $_POST['inputNum1'];
        $num2 = $_POST['inputNum2'];
        $num3 = $_POST['inputNum3'];

        if ((!is_nan($num1)) && !is_nan($num2) && !is_nan($num3)) {

            $resultado = max($num1, $num2, $num3);
        }
    }
    ?>
</head>

<body>
    <form action="Questao10.php" method="POST">
        <label for="inputNum1">Insira o valor 1<br><input type="number" name="inputNum1"></label><br>
        <label for="inputNum2">Insira o valor 2<br><input type="number" name="inputNum2"></label><br>
        <label for="inputNum3">Insira o valor 3<br><input type="number" name="inputNum3"></label><br>
        <p><?php echo "O maior número entre os três valores inseridos é o $resultado"; ?></p>
        <label for="inputbutton"><input type="submit" name="inputbutton"></label>
    </form>
</body>

</html>