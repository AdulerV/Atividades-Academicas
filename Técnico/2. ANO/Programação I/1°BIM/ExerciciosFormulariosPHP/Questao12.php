<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Questão12</title>
    <link rel="stylesheet" href="Questao12.css">
    <?php
    error_reporting(0);

    if (isset($_POST['inputAnoAtual'], $_POST['inputDataNascimento'])) {

        $dataDeNascimento = $_POST["inputDataNascimento"];
        $dataAtual = $_POST["inputAnoAtual"];

        if ((!is_nan($dataDeNascimento)) && !is_nan($dataAtual)) {
            $idade =  $dataAtual - $dataDeNascimento;
        }
    }
    ?>
</head>

<body>
    <form action="Questao12.php" method="POST">
        <label for="inputAnoAtual">Insira o ano atual<br>
            <input type="number" name="inputAnoAtual"></label><br>
        <label for="inputDataNascimento">Insira sua data de nascimento <br>
            <input type="number" name="inputDataNascimento"></label><br>
        <label for="inputButton"><input type="submit" name="inputButton"></label>
        <p><?php echo "Você tem $idade anos"; ?></p>
    </form>
</body>

</html>