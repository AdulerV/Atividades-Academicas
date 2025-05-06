<?php
inserirQuery();

function inserirQuery()
{
    include_once("./database/conexao.php");
    $idContato = $_POST["id-contato"];

    editarDadosContato($conexao, $idContato);
    editarTelefone($conexao, $idContato);
    editarEndereco($conexao, $idContato);

    mysqli_close($conexao);
    header('location: ../index.php');
}

function editarDadosContato($conexao, $idContato)
{
    $nome_contato = $_POST["nome-contato"];
    $email_contato = $_POST["correio-eletronico-contato"];

    $sql = "UPDATE contato SET nome = '$nome_contato', email = '$email_contato' WHERE id_contato = '$idContato'";
    mysqli_query($conexao, $sql);
}

function editarTelefone($conexao, $idContato)
{
    $telefones = $_POST["telefone-contato"];

    $sqlTelefones = "DELETE FROM telefone WHERE fk_id_contato = '$idContato'";
    mysqli_query($conexao, $sqlTelefones);

    foreach ($telefones as $telefone) {
        $sql = "INSERT INTO telefone (numero_telefone, fk_id_contato) VALUES ('$telefone', '$idContato')";
        mysqli_query($conexao, $sql);
    }
}

function editarEndereco($conexao, $idContato)
{
    $patria = $_POST["patria"];
    $estado = $_POST["estado"];
    $municipio = $_POST["municipio"];
    $bairro = $_POST["bairro"];
    $logradouro = $_POST["logradouro"];
    $numero = $_POST["numero"];

    $sql = "UPDATE endereco SET pais = '$patria', estado = '$estado', municipio = '$municipio', bairro = '$bairro', logradouro = '$logradouro', numero = '$numero' WHERE fk_id_contato = '$idContato'";
    mysqli_query($conexao, $sql);
}
