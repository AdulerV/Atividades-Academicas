<?php
@session_start();
if (isset($_SESSION['email'])) {
	$email_usuario = $_SESSION['email'];
	echo "Usuario logado: " .  $email_usuario;
} else {
	echo '<a href="./usuarioLogin.php">Login</a>';
}
