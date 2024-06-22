<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Questão 4</title>
    <style>
        table,
        caption,
        th,
        td {
            border-width: 2px;
            border-style: double;
        }
    </style>
</head>

<body>
    <?php
    /*4. LivroDeLivraria - Usando o resultado do exercício 3 como base, crie uma classe LivroDeLivraria
    que represente os dados básicos de um livro que está à venda em uma livraria.*/

    class LivroDeLivraria
    {
        private $nome;
        private $genero;
        private $autor;
        private $lançamento;
        private $editora;
        private $tipo;
        private $preço;

        function inicializa($n, $g, $a, $l, $e, $t, $p)
        {
            $this->nome = $n;
            $this->genero = $g;
            $this->autor = $a;
            $this->lançamento = $l;
            $this->editora = $e;
            $this->tipo = $t;
            $this->preço = $p;
        }

        function mostraDados()
        {
            if ($this->lançamento <= date('Y')) {
                echo "<td> $this->nome </td>
                <td> $this->genero </td>  
                <td> $this->autor </td>  
                <td> $this->lançamento </td>  
                <td> $this->editora </td>
                <td> $this->tipo </td>  
                <td> $this->preço </td>";
            } else {
                echo "<th>Insira um livro válido!<th>";
            }
        }
    }

    $livro1 = new LivroDeLivraria();
    $livro2 = new LivroDeLivraria();
    $livro3 = new LivroDeLivraria();

    $livro1->inicializa("Harry Potter e a Pedra Filosofal", "Literatura fantástica", "J. K. Rowling", 1997, "Rocco", "Capa Comum", 24.30);
    $livro2->inicializa("O Senhor dos Anéis", "Alta fantasia", "J. R. R. Tolkien", 1954, "HarperCollins", "Capa Dura", 117.50);
    $livro3->inicializa("Memórias Póstumas de Brás Cubas", "Romance", "Machado de Assis", 1881, "Penguin-Companhia", "Kindle", 22.90);

    echo "<table>
    <caption>Livraria Leitura</caption>
    <tr>
    <th> Livros </th> 
    <th> Nome </th>
    <th> Gênero </th>  
    <th> Autor(a) </th>  
    <th> Lançamento </th>  
    <th> Editora </th>
    <th> Tipo </th>  
    <th> Preço (R$) </th>
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