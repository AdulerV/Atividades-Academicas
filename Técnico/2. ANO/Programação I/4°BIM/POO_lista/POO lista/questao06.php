<?php
/*6. Veiculo - Crie uma classe Veiculo que represente os dados e operações de um veículo de
transporte como nome, número de passageiros que pode carregar, tipo (aéreo, terrestre ou
aquático), número de rodas, etc.*/

class Veiculo
{
    private $nome;
    private $numPassageiros;
    private $tipo;
    private $numRodas;
    private $movimento;

    function inicializa($n, $nPass, $t, $nRod)
    {
        $this->nome = $n;
        $this->numPassageiros = $nPass;
        $this->tipo = $t;
        $this->numRodas = $nRod;
    }

    function mover()
    {
        $this->movimento = true;
    }

    function parar()
    {
        $this->movimento = false;
    }

    function mostraDados()
    {
        if ($this->movimento == true) {
            echo "O véiculo $this->nome está se movendo em ambiente $this->tipo. <br>";
        } elseif ($this->movimento == false) {
            echo "O véiculo $this->nome está parado para visualização, logo, seus dados são: <br>";
            echo "Nome: $this->nome | Número de Passageiros: $this->numPassageiros | Tipo: $this->tipo | Número de Rodas: $this->numRodas";
        }
    }
}

$veiculo1 = new Veiculo();
$veiculo2 = new Veiculo();

$veiculo1->inicializa("Paulistinha CAP-4", 2, "aéreo", 3);
$veiculo2->inicializa("Gol", 5, "terrestre", 4);

$veiculo1->mover();
$veiculo2->parar();

echo "<br><b> Veículo1: </b><br>";
$veiculo1->mostraDados();
echo "<br><b> Veículo2: </b><br>";
$veiculo2->mostraDados();
