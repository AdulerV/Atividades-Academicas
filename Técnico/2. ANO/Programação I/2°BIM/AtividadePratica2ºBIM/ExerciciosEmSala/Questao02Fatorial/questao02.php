<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="css/saida.css">
</head>
<body>
    <?php
if (isset($_POST['inputNum']) && $_POST['inputNum'] != null) {

    $num = $_POST['inputNum'];
    $fatorial = 1;

    for ($contador = 1; $contador <= $num; $contador++) {
        $fatorial = $fatorial * $contador;
    }
    echo "<p>O fatorial de $num é: $fatorial</p>";

} else {
    $num = 0;
    echo "<p>Insira um número válido</p>";
}
?>
</body>
</html>