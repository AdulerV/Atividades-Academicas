<?php
class personagemDAO
{
    public function inserir(personagem $obj)
    {
        require_once 'conexao.php';
        require_once '../Models/personagem.php';
        require_once '../Helpers/GUID.php';

        $stmt = $conn->prepare('INSERT INTO  tb_personagem (codigo,nome,altura,peso,nome_franquia,genero) 
            values 
            (:codigo,:nome,:altura,:peso,:nome_franquia,:genero)');

        if (!$obj->codigo)
            $obj->codigo = GUID();

        $stmt->bindValue(':codigo', $obj->codigo);
        $stmt->bindValue(':nome', $obj->nome);
        $stmt->bindValue(':altura', $obj->altura);
        $stmt->bindValue(':peso', $obj->peso);
        $stmt->bindValue(':nome_franquia', $obj->nome_franquia);
        $stmt->bindValue(':genero', $obj->genero);

        $stmt->execute();
    }

    public function alterar(personagem $obj)
    {
        require_once 'conexao.php';
        require_once '../Models/personagem.php';

        $stmt = $conn->prepare('UPDATE tb_personagem SET
                nome =:nome,
                altura = :altura, 
                peso = :peso,
                nome_franquia= :nome_franquia,
                genero = :genero
                 WHERE codigo = :codigo');

        $stmt->bindValue(':codigo', $obj->codigo);
        $stmt->bindValue(':nome', $obj->nome);
        $stmt->bindValue(':altura', $obj->altura);
        $stmt->bindValue(':peso', $obj->peso);
        $stmt->bindValue(':nome_franquia', $obj->nome_franquia);
        $stmt->bindValue(':genero', $obj->genero);

        $stmt->execute();
    }

    public function excluir($codigo)
    {
        require_once 'conexao.php';

        $stmt = $conn->prepare('DELETE FROM  tb_personagem WHERE codigo = :codigo');

        $stmt->bindValue(':codigo', $codigo);

        $stmt->execute();
    }

    public function retornarPorId(string $codigo)
    {
        require_once 'conexao.php';
        require_once '../Models/personagem.php';

        $sql = "SELECT * FROM tb_personagem where  codigo=? LIMIT 1";

        $stmt = $conn->prepare($sql);
        $stmt->execute([$codigo]);
        $row = $stmt->fetch();

        $obj = NULL;

        if ($row) {

            $obj = new personagem();

            $obj->codigo = $row['codigo'];
            $obj->nome = $row['nome'];
            $obj->altura = $row['altura'];
            $obj->peso = $row['peso'];
            $obj->nome_franquia = $row["nome_franquia"];
            $obj->genero = $row["genero"];
        }

        return $obj;
    }

    public function retornarTodos()
    {
        require_once 'conexao.php';
        require_once '../models/personagem.php';

        $sql = "SELECT * FROM tb_personagem ORDER BY nome";
        $objects = array();

        foreach ($conn->query($sql) as $row) {

            $obj = new personagem();

            $obj->codigo = $row['codigo'];
            $obj->nome = $row['nome'];
            $obj->altura = $row['altura'];
            $obj->peso = $row['peso'];
            $obj->nome_franquia = $row["nome_franquia"];
            $obj->genero = $row["genero"];

            $objects[] = $obj;
        }

        return $objects;
    }
}
