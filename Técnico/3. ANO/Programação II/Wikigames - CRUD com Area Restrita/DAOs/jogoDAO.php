<?php
class jogoDAO
{
    public function inserir(Jogo $obj)
    {
        require_once 'conexao.php';
        require_once '../Models/jogo.php';
        require_once '../Helpers/GUID.php';

        $stmt = $conn->prepare('INSERT INTO  tb_jogo (codigo,nome,data_lancamento,plataforma,desenvolvedora) 
            values 
            (:codigo,:nome,:data_lancamento,:plataforma,:desenvolvedora)');

        if (!$obj->codigo)
            $obj->codigo = GUID();

        $stmt->bindValue(':codigo', $obj->codigo);
        $stmt->bindValue(':nome', $obj->nome);
        $stmt->bindValue(':data_lancamento', $obj->data_lancamento);
        $stmt->bindValue(':plataforma', $obj->plataforma);
        $stmt->bindValue(':desenvolvedora', $obj->desenvolvedora);

        $stmt->execute();
    }

    public function alterar(Jogo $obj)
    {
        require_once 'conexao.php';
        require_once '../models/jogo.php';

        $stmt = $conn->prepare('UPDATE tb_jogo SET
                nome =:nome,
                data_lancamento = :data_lancamento, 
                plataforma = :plataforma,
                desenvolvedora= :desenvolvedora
                 WHERE codigo = :codigo');

        $stmt->bindValue(':codigo', $obj->codigo);
        $stmt->bindValue(':nome', $obj->nome);
        $stmt->bindValue(':data_lancamento', $obj->data_lancamento);
        $stmt->bindValue(':plataforma', $obj->plataforma);
        $stmt->bindValue(':desenvolvedora', $obj->desenvolvedora);

        $stmt->execute();
    }

    public function excluir($codigo)
    {
        require_once 'conexao.php';

        $stmt = $conn->prepare('DELETE FROM  tb_jogo WHERE codigo = :codigo');

        $stmt->bindValue(':codigo', $codigo);

        $stmt->execute();
    }

    public function retornarPorId(string $codigo)
    {
        require_once 'conexao.php';
        require_once '../Models/jogo.php';

        $sql = "SELECT * FROM tb_jogo where  codigo=? LIMIT 1";

        $stmt = $conn->prepare($sql);
        $stmt->execute([$codigo]);
        $row = $stmt->fetch();

        $obj = NULL;

        if ($row) {

            $obj = new Jogo();

            $obj->codigo = $row['codigo'];
            $obj->nome = $row['nome'];
            $obj->data_lancamento = $row['data_lancamento'];
            $obj->plataforma = $row['plataforma'];
            $obj->desenvolvedora = $row["desenvolvedora"];
        }

        return $obj;
    }

    public function retornarTodos()
    {
        require_once 'conexao.php';
        require_once '../models/jogo.php';

        $sql = "SELECT * FROM tb_jogo ORDER BY nome";
        $objects = array();

        foreach ($conn->query($sql) as $row) {

            $obj = new Jogo();

            $obj->codigo = $row['codigo'];
            $obj->nome = $row['nome'];
            $obj->data_lancamento = $row['data_lancamento'];
            $obj->plataforma = $row['plataforma'];
            $obj->desenvolvedora = $row["desenvolvedora"];

            $objects[] = $obj;
        }

        return $objects;
    }
}
