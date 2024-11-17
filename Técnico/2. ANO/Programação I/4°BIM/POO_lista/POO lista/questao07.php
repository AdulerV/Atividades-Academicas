<?php
/*7. EquacaoSegundoGrau - Crie uma classe EquacaoSegundoGrau que contenha somente uma
operação, a que calcula as raízes da equação. Considere que os valores de a, b e c serão passados
para uma operação desta classe. Qual a complexidade adicional de se criar esta classe, quando
comparada com um algoritmo simples? Quais as vantagens esperadas?*/

class EquacaoSegundoGrau
{
    private $a;
    private $b;
    private $c;

    function calculaRaiz($a, $b, $c)
    {
        $this->a = $a;
        $this->b = $b;
        $this->c = $c;

        $delta = pow($this->b, 2) - 4 * $this->a * $this->c;

        $x1 = (-$this->b + sqrt($delta)) / (2 * $this->a);

        $x2 = (-$this->b - sqrt($delta)) / (2 * $this->a);

        echo "S = { $x1, $x2 }";
    }
}

$equacao1 = new EquacaoSegundoGrau();
$equacao2 = new EquacaoSegundoGrau();

echo "<br><b> Equação 1: </b><br>";
$equacao1->calculaRaiz(4, -3, -1);
echo "<br><br><b> Equação 2: </b><br>";
$equacao2->calculaRaiz(5, 0, -45);
