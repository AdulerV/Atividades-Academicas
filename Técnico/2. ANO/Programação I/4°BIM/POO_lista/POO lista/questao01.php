<?php

/*1. LampadaTresEstados - Imagine uma lâmpada que possa ter três estados: 
apagada, acesa e meia-luz. Usando a classe Lampada como base, 
escreva a classe LampadaTresEstados.*/

class LampadaTresEstados
{
    private $estado;

    function apaga()
    {
        $this->estado = 0;
    }

    function meia_luz()
    {
        $this->estado = 1;
    }

    function acesa()
    {
        $this->estado = 2;
    }

    function mostraDados()
    {
        if ($this->estado == 0) {
            echo "Lâmpada apagada!";
        } elseif ($this->estado == 1) {
            echo "Lâmpada com meia-luz!";
        } elseif ($this->estado == 2) {
            echo "Lâmpada acesa!";
        }
    }
}

$lampada1 = new LampadaTresEstados();
$lampada2 = new LampadaTresEstados();
$lampada3 = new LampadaTresEstados();

$lampada1->apaga();
$lampada2->meia_luz();
$lampada3->acesa();

echo "<br><b> Lampada1: </b><br>";
$lampada1->mostraDados();
echo "<br><br><b> Lampada2: </b><br>";
$lampada2->mostraDados();
echo "<br><br><b> Lampada3: </b><br>";
$lampada3->mostraDados();
