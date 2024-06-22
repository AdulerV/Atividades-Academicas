<?php

$hostname = 'localhost';
$username = 'root';
$password = '';
$database = 'bd_wikigames';
try {

    $conn = new PDO(
        "mysql:host=$hostname;dbname=$database;charset=utf8",
        $username,
        $password,
        array(PDO::MYSQL_ATTR_INIT_COMMAND => "SET NAMES utf8")
    );

    $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch (PDOException $e) {
    echo $e->getMessage();
}
