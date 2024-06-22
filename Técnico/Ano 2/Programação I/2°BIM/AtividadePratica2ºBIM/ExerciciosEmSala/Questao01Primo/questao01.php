<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/saida.css">
    <title>Resultado01</title>
</head>
<body>
    <?php
if (isset($_POST['inputNum']) && $_POST['inputNum'] != null) {

    $num = $_POST['inputNum'];
    $d = 0;
    if ($num > 0) {
        for ($i = 1; $i <= $num; $i++) {

            if ($num % $i == 0) {
                $d++;
            }
        }
        if ($d == 2) {
            echo "<p>Se trata de um número primo.</p>";
        } else {
            echo "<p>Se trata de um número não primo.</p>";
        }
    } else {
        echo "<p>Insira um número válido</p>";
    }
} else {
    $num = 0;
    echo "<p>Insira um número válido</p>";
}
?>
</body>
</html>