<!doctype html>
<?php include("checarlogin.php") ?>
<html lang="pt-br">
<header>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</header>

<body style="text-align:center" style="background-color:black" class="text-white bg-dark">
    <?php require_once './menu.php' ?>

    <h1 style="color:chartreuse">Jogos</h1>
    <div class="d-grid gap-2 col-2 mx-auto">
        <a class="btn btn-primary btn-lg" href="./jogoinserir.php" style="text-align: height">Inserir</a>
    </div>
    <table class="table" style="background-color:black" class="text-white bg-dark">
        <thead>
            <th style="color:aqua">Nome</th>
            <th style="color:aqua">Desenvolvedora</th>
            <th></th>
        </thead>
        <tbody>
            <?php
            require '../DAOs/jogoDAO.php';
            require '../Models/jogo.php';

            $dao = new jogoDAO();

            $objetos = $dao->retornarTodos();

            foreach ($objetos as $obj) {
                echo '<tr>
                            <td style="color:chartreuse">' . $obj->nome . '</td>
                            <td style="color:chartreuse">' . $obj->desenvolvedora . '</td>
                            <td>
                                <a class="btn btn-secondary"  href="./jogoConsultar.php?codigo=' . $obj->codigo . '">Consultar</a>
                                <a class="btn btn-warning" href="./jogoAlterar.php?codigo=' . $obj->codigo . '">Alterar</a>
                                <a class="btn btn-danger" href="./jogoExcluir.php?codigo=' . $obj->codigo . '">Excluir</a>
                            </td>
                        </tr>';
            }
            ?>

        </tbody>

    </table>

    <?php require_once './rodape.php' ?>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>

</html>