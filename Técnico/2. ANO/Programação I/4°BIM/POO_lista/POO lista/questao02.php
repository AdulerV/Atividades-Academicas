<?php
/*2. DataHora - Crie uma classe DataHora que represente simultaneamente uma data e uma hora aproximada.
Dica: o classe pode conter instâncias das classes Data e HoraAproximada.*/

class DataHora
{
    private $dia;
    private $mes;
    private $ano;
    private $hora;
    private $minuto;

    function inicializa($d, $m, $a, $h, $min)
    {
        if ($this->dataEvalida($d, $m, $h, $min)) {
            $this->dia = $d;
            $this->mes = $m;
            $this->ano = $a;
            $this->hora = $h;
            $this->minuto = $min;
        } else {
            $this->dia = 0;
            $this->mes = 0;
            $this->ano = 0;
            $this->hora = 0;
            $this->minuto = 0;
        }
    }

    function dataEvalida($d, $m, $h, $min)
    {
        if (($d >= 1) && ($d <= 31) && ($m >= 1) && ($m <= 12) && ($h >= 1) && ($h <= 24) && ($min >= 1) && ($min <= 60)) {
            return true;
        } else {
            return false;
        }
    }

    function mostraData()
    {
        if (($this->minuto <= 60) && ($this->minuto >= 30)) {
            echo "Hora Aproximada: " . $this->hora += 1;
            echo "<br> Data: " . $this->dia . "/" . $this->mes . "/" . $this->ano . "<br>";
        } else {
            echo "Hora Aproximada: " . $this->hora;
            echo "<br> Data: " . $this->dia . "/" . $this->mes . "/" . $this->ano . "<br>";
        }
    }
}

$dataHora1 = new DataHora();
$dataHora2 = new DataHora();
$dataHora3 = new DataHora();

$dataHora1->inicializa(2, 6, 2005, 4, 20);
$dataHora2->inicializa(31, 12, 2022, 23, 59);
$dataHora3->inicializa(-2, 14, 2000, 0, -77);

echo "<b><br> Data1 e Hora1: </b><br>";
$dataHora1->mostraData();
echo "<b><br> Data2 e Hora2: </b><br>";
$dataHora2->mostraData();
echo "<b><br> Data3 e Hora3: </b><br>";
$dataHora3->mostraData();
