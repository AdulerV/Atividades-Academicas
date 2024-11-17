<?php
/*5. Ponto2D - Crie uma classe Ponto2D para representar um ponto no espaço cartesiano de duas
dimensões. Que dados e operações esta classe deve ter?*/

class Ponto2D
{
    private $x;
    private $y;

    function inicializaPonto($x, $y)
    {
        $this->x = $x;
        $this->y = $y;
    }

    function mostraPonto()
    {
        echo "Pontos: ($this->x, $this->y)";
    }
}

$ponto1 = new Ponto2D();
$ponto2 = new Ponto2D();

$ponto1->inicializaPonto(3, 4);
$ponto2->inicializaPonto(7, -3);

echo "<br><b> Pontos1: </b><br>";
$ponto1->mostraPonto();
echo "<br><br><b> Pontos2: </b><br>";
$ponto2->mostraPonto();
