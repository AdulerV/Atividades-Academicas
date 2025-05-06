<?php
$servidor = "localhost";
$nomeUsuario = "root";
$senha = "";
$banco = "agenda_database";

$conexao = mysqli_connect($servidor, $nomeUsuario, $senha, $banco);

if (!$conexao) {
  die("A conexão falhou: " . mysqli_connect_error());
}
