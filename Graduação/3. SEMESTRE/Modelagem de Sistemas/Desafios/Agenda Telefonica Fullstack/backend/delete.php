<?php
include_once("database/conexao.php");

$idContato = $_GET["id"];

if (isset($idContato)) {
    $sqlTelefones = "DELETE FROM telefone WHERE fk_id_contato=" . $idContato;
    mysqli_query($conexao, $sqlTelefones);

    $sqlEnderecos = "DELETE FROM endereco WHERE fk_id_contato=" . $idContato;
    mysqli_query($conexao, $sqlEnderecos);

    $sqlContato = "DELETE FROM contato WHERE id_contato=" . $idContato;
    mysqli_query($conexao, $sqlContato);

    mysqli_close($conexao);
    header('location: ../index.php');
}
