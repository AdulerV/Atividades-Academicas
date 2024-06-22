<?php
header("Content-Type: text/html; charset=utf-8", true);
error_reporting(E_ERROR | E_WARNING | E_PARSE);
?>

<!DOCTYPE HTML>
<html lang="pt-br">

<head>
	<meta charset="utf-8">
	<title>Wiki games</title>
	<link rel="stylesheet" href="css/inclusao_alteracao_exclusao.css">
	<link rel="shortcut icon" href="images/favicon.png" type="image/x-icon">
	<link href="css/toastr.css" rel="stylesheet" />
	<script src="jquery/jquery-3.3.1.min.js"></script>
	<script src="popper/popper.min.js"></script>
	<script src="bootstrap4/js/bootstrap.min.js"></script>
	<script src="funcoes/toastr.min.js"></script>
	<script src="funcoes/funcao_toastr.js"></script>
</head>

<body>
	<?php
	$codigo = "";
	$nome = "";
	$data_lancamento = "";
	$plataforma = "";
	$desenvolvedora = "";
	$destino = "";
	$ComandoSQL = "";

	if ($_POST['form_operacao'] == "inclusao_jogo") {
		try {
			require_once 'funcoes/conexao.php';

			$codigo = $_POST['codigo'];
			$nome =  $_POST['nome'];
			$data_lancamento = $_POST['data_lancamento'];
			$plataforma = $_POST['plataforma'];
			$desenvolvedora = $_POST['desenvolvedora'];

			$result = $conn->query("SELECT * FROM tb_jogo WHERE codigo = $codigo");
			$count = $result->rowCount();
			if ($count > 0) {
				$destino = "function () {window.location='inclusao_jogo.php';}";
				echo "<script>sendToastr('Código do jogo já cadastrado!<br />Clique para continuar!','error',$destino)</script>";
			}

			$stmt = $conn->prepare('INSERT INTO tb_jogo VALUES
		(:codigo,:nome,:data_lancamento,:plataforma,:desenvolvedora)');
			$stmt->bindValue(':codigo', $codigo);
			$stmt->bindValue(':nome', $nome);
			$stmt->bindValue(':data_lancamento', $data_lancamento);
			$stmt->bindValue(':plataforma', $plataforma);
			$stmt->bindValue(':desenvolvedora', $desenvolvedora);
			$stmt->execute();
		} catch (PDOException $e) {

			$destino = "function () {window.location='index.php';}";
			echo "<script>sendToastr($e->$getMessage(), 'error',$destino)</script>";
			die();
		}

		$destino = "function () {window.location='inclusao_jogo.php';}";
		echo "<script>sendToastr('Jogo cadastrado com sucesso!<br />Clique para continuar!','success',$destino)</script>";
	}
	?>

	<?php $cabecalho = require_once('funcoes/cabecalho.php');
	echo $cabecalho ?>

	<article class="artigo">
		<div class="secaoConteudo">

			<h1 class="titulo">Cadastro de Jogos</h1>
			<h3>Inclusão:</h3>

			<form method="POST" action="inclusao_jogo.php" name="form_inclusao">
				<table>
					<tr>
						<td class="label">Código:</td>
						<td>
							<input name="codigo" type="number" id="codigo" size="10" maxlength="10" required="required" class="inpInsercao">*
						</td>
					</tr>

					<tr>
						<td class="label">Nome:</td>
						<td>
							<input name="nome" type="text" id="nome" size="255" maxlength="255" required="required" class="inpInsercao">*
						</td>
					</tr>

					<tr>
						<td class="label">Data de lançamento:</td>
						<td>
							<input name="data_lancamento" type="date" id="data_lancamento" required="required" class="inpInsercao"></input>*
						</td>
					</tr>

					<tr>
						<td class="label">Plataformas:</td>
						<td>
							<input name="plataforma" type="text" id="plataforma" size="1000" maxlength="1000" required="required" class="inpInsercao">*
						</td>
					</tr>

					<tr>
						<td class="label">Desenvolvedora:</td>
						<td>
							<input name="desenvolvedora" type="text" id="desenvolvedora" size="200" maxlength="200" required="required" class="inpInsercao">*
						</td>
					</tr>

					<tr class="trBotao">

						<td colspan='2'>
							<br />
							<input type="hidden" name="form_operacao" value="inclusao_jogo">
							<input type="submit" name="enviar" value="Inserir Novo Jogo" class="botao">
							* dados obrigatórios
						</td>
					</tr>
				</table>
				<p><a href="JavaScript: window.history.back();">Voltar</a></p>
			</form>
		</div>
	</article>

	<?php $rodape = require_once('funcoes/rodape.php');
	echo $rodape ?>
</body>

</html>