<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Questão 3</title>
    <style>
        table,
        td,
        th {
            border-width: 2px;
            border-style: double;
        }
    </style>
</head>

<body>
    <?php
    /*3. Livro - Crie uma classe Livro que represente os dados básicos de um livro, sem se preocupar
    com a sua finalidade.*/

    class Livro
    {
        private $nome;
        private $genero;
        private $autor;
        private $lançamento;

        function inicializa($n, $g, $a, $l)
        {
            $this->nome = $n;
            $this->genero = $g;
            $this->autor = $a;
            $this->lançamento = $l;
        }

        function mostraDados()
        {
            if ($this->lançamento <= date('Y')) {
                echo "<td> $this->nome </td>
                <td> $this->genero </td>  
                <td> $this->autor </td>  
                <td> $this->lançamento </td>";
            } else {
                echo "<th>Insira um livro válido!<th>";
            }
        }
    }

    $livro1 = new Livro();
    $livro2 = new Livro();
    $livro3 = new Livro();

    $livro1->inicializa("Harry Potter e a Pedra Filosofal", "Literatura fantástica", "J. K. Rowling", 1997);
    $livro2->inicializa("O Senhor dos Anéis", "Alta fantasia", "J. R. R. Tolkien", 1954);
    $livro3->inicializa("Memórias Póstumas de Brás Cubas", "Romance", "Machado de Assis", 1881);

    echo "<table><tr>
    <th> Livros </th> 
    <th> Nome </th>
    <th> Gênero </th>  
    <th> Autor(a) </th>  
    <th> Lançamento </th>  
    </tr>";

    echo "<tr><th>Livro 1</th>";
    $livro1->mostraDados();
    echo "</tr>";

    echo "<tr><th>Livro 2</th>";
    $livro2->mostraDados();
    echo "</tr>";

    echo "<tr><th>Livro 3</th>";
    $livro3->mostraDados();
    echo "</tr></table>";
    ?>
</body>

</html>