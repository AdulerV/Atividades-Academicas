<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Agenda Telefônica</title>
</head>

<body>
    <table>
        <caption>Agenda Telefônica</caption>

        <thead>
            <tr>
                <th colspan="5">Lista de Contatos</th>
            </tr>
        </thead>

        <tbody>
            <?php include_once("./backend/read.php") ?>
        </tbody>

        <tfoot>
            <tr>
                <td>Nome</td>
                <td>Email</td>
                <td>Telefones</td>
                <td>Endereço</td>
                <td>Ação</td>
            </tr>
        </tfoot>
    </table>

    <a href="telas/add/add.php" id="btn-adicionar-contato">Adicionar Contato</a>

    <script src="script.js"></script>
</body>

</html>