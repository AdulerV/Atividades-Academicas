<!DOCTYPE html
	*POO - 05/12/2016
>
<html>
<head>
    <meta charset="UTF-8"/>
	<title>POO 1</title>
</head>
<body>
	<?php
		class Data{
			private $dia;
			private $mes;
			private $ano;
		
			function inicializa($d, $m, $a){
				if ($this->dataEvalida($d, $m, $a))
				{   $this->dia = $d;
					$this->mes = $m;
					$this->ano = $a;  }
				else
				{   $this->dia = 0;
					$this->mes = 0;
					$this->ano = 0;  }				
			}
			
			function dataEvalida($d, $m, $a){
				if (($d>=1) && ($d<=31) && ($m>=1) && ($m<=12))
				  { return true; }
				else { return false; }
			}
			
			function mostraData() {
				echo $this->dia."/".$this->mes."/";
				echo $this->ano."<br>";
			}
		}
	
			$data1 = new Data();
			$data1->inicializa(22, 04, 1500);
			echo "Data1 = ";
			$data1->mostraData();
			
			$data2 = new Data();
			$data2->inicializa(15, 20, 2016);
			echo "Data2 = ";
			$data2->mostraData();
	?>
</body>
</html>
