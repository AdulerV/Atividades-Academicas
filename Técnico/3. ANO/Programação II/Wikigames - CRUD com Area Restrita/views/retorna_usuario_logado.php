<?php
@session_start();
if (isset($_SESSION['login'])) {
	$nome_usuario = $_SESSION['login'];
	echo '<div class="mt-2 text-light">';

	echo '&nbsp [Usuario logado: ' .  $nome_usuario . '] &nbsp';

	echo '<a class="text-danger" href="logout.php">Logout</a>';

	echo '</div>';
} else {
	echo '&nbsp <a class="text-danger" href="usuarioLogin.php">Login</a>';
}
