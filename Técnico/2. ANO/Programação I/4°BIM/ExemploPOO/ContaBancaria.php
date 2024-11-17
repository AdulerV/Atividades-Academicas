<!DOCTYPE html
	*POO - 05/12/2016
>
<html>
<head>
    <meta charset="UTF-8"/>
	<title>POO Exercícios</title>
</head>
<body>
	<?php
		class ContaBancariaSimplificada{
			private $nomeCorrentista;
			private $saldo;
			private $contaeEspecial;
		
			function abrirConta($nome, $deposito, $tipo){
				$this->nomeCorrentista = $nome;
				$this->saldo = $deposito;
				$this->contaeEspecial = $tipo;
			}
			function deposito($valor){
				$this->saldo += $valor;
			}
			function retirada($valor) {
				if ($this->contaeEspecial == false)
					{ if ($valor <= $this->saldo)
						{ $this->saldo -= $valor; }	}
				else { $this->saldo -= $valor; }
			}
			function mostraDados() {
				echo "Nome: ".$this->nomeCorrentista."<br>";
				echo "Saldo: ".$this->saldo."<br>";
				echo "Tipo: ";
				if ($this->contaeEspecial == true) { echo "Especial<br>"; }
					else { echo "Comum<br>"; }
			}
		}
	
			$conta1 = new ContaBancariaSimplificada();
			$conta1->abrirConta("Camilo Lélis", 1000, true);
			$conta1->deposito(500);
			$conta1->retirada(200);
			$conta1->mostraDados();
			
			$conta2 = new ContaBancariaSimplificada();
			$conta2->abrirConta("Cecília Lorenzi", 800, false);
			$conta2->retirada(500);
			$conta2->retirada(400);
			echo "<br>";
			$conta2->mostraDados();
?>
</body>
</html>
