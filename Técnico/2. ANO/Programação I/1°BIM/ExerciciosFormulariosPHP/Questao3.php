<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Questao3</title>
    <link rel="stylesheet" href="Questao3.css">

    <?php
    error_reporting(0);

    if (isset($_POST['inputAnosFumados'], $_POST['inputCigarrosFumados'], $_POST['inputPrecoCarteira'])) {

        $NumDeAnosFumados = $_POST['inputCigarrosFumados'];
        $NumDeCigarrosFumados = $_POST['inputAnosFumados'];
        $PrecoDeUmaCarteira = $_POST['inputPrecoCarteira'];

        if ((!is_nan($NumDeCigarrosFumados)) && !is_nan($NumDeAnosFumados) && !is_nan($PrecoDeUmaCarteira)) {

            $CigarrosPorCarteira = 20; //O padrão nacional é de 20 cigarros por maço/carteira
            $TotalDiasFumados = $NumDeAnosFumados * 365;
            $TotalDeCigarros = $TotalDiasFumados * $NumDeCigarrosFumados;
            $PrecoDaUnidade = $PrecoDeUmaCarteira / $CigarrosPorCarteira;
            $GastoTotal = $PrecoDaUnidade * $TotalDeCigarros;
        }
    }
    ?>

</head>

<body>
    <form name="formularioFumante" action="Questao3.php" method="POST">
        <label for="inputAnosFumados"> Número de anos que você fuma: <br>
            <input name="inputAnosFumados" type="number" min="0" id="inputAnosFumados"></label>
        <br>
        <br>
        <label for="inputCigarrosFumados"> Quantidade de cigarros fumados diariamente: <br>
            <input name="inputCigarrosFumados" type="number" min="0" id="inputCigarrosFumados"></label>
        <br>
        <br>
        <label for="inputPrecoCarteira">O preço de uma carteira de cigarros: <br>
            <input name="inputPrecoCarteira" type="number" min="0" id="inputPrecoCarteira"></label>
        <br>
        <p><?php echo "O fumante gastou R$" . number_format($GastoTotal, 2, ',', '.') . " ao longo de sua vida. "; ?></p>
        <label for="inputSubmit">
            <input name="inputSubmit" type="submit"></label>
    </form>
</body>

</html>