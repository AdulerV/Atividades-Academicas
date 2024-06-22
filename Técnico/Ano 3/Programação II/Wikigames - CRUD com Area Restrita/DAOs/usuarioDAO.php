<?php
class usuarioDAO
{
    public function login($email, $senha)
    {
        require 'conexao.php';
        require_once '../Models/usuario.php';
        require_once '../Helpers/GUID.php';

        $sql = "SELECT * FROM tb_usuario where  email=? LIMIT 1";

        $stmt = $conn->prepare($sql);
        $stmt->execute([$email]);
        $row = $stmt->fetch();

        $usuario = NULL;

        if ($row) {
            $usuario = new Usuario();

            $usuario->id = $row['id'];
            $usuario->email = $row['email'];
            $usuario->salt = $row['salt'];
            $usuario->hash_senha = $row['hash_senha'];

            if (Bcrypt($senha, $usuario->salt) == $usuario->hash_senha) {
                $usuario->salt = "";
                $usuario->hash_senha = "";

                return $usuario;
            } else {
                return NULL;
            }
        } else {
            return NULL;
        }
    }

    public function inserir($email, $senha)
    {
        require_once 'conexao.php';
        require_once '../Models/usuario.php';
        require_once '../Helpers/GUID.php';

        $stmt = $conn->prepare('INSERT INTO  tb_usuario (id,email,salt,hash_senha) 
            values 
            (:id,:email,:salt,:hash_senha)');

        $obj = new Usuario();

        if (!$obj->id)
            $obj->id = GUID();

        $obj->salt = GUID();

        $obj->email = $email;
        $obj->hash_senha = Bcrypt($senha, $obj->salt);

        $stmt->bindValue(':id', $obj->id);
        $stmt->bindValue(':email', $obj->email);
        $stmt->bindValue(':salt', $obj->salt);
        $stmt->bindValue(':hash_senha', $obj->hash_senha);

        $stmt->execute();
    }

    public function alterar(Usuario $obj)
    {
        require_once 'conexao.php';
        require_once '../Models/usuario.php';

        $stmt = $conn->prepare('UPDATE tb_usuario SET
                email =:email,
                salt = :salt, 
                hash_senha = :hash_senha 
                 WHERE id = :id');

        $stmt->bindValue(':id', $obj->id);
        $stmt->bindValue(':email', $obj->email);
        $stmt->bindValue(':salt', $obj->salt);
        $stmt->bindValue(':hash_senha', $obj->hash_senha);

        $stmt->execute();
    }

    public function excluir($id)
    {
        require_once 'conexao.php';

        $stmt = $conn->prepare('DELETE FROM  tb_usuario WHERE id = :id');

        $stmt->bindValue(':id', $id);

        $stmt->execute();
    }

    public function retornarPorId(string $id)
    {
        require_once 'conexao.php';
        require_once '../Models/usuario.php';

        $sql = "SELECT * FROM tb_usuario where  id=? LIMIT 1";

        $stmt = $conn->prepare($sql);
        $stmt->execute([$id]);
        $row = $stmt->fetch();

        $obj = NULL;

        if ($row) {
            $obj = new Usuario();

            $obj->id = $row['id'];
            $obj->email = $row['email'];
        }

        return $obj;
    }

    public function retornarPorEmail(string $email)
    {
        require_once 'conexao.php';
        require_once '../Models/usuario.php';

        $sql = "SELECT * FROM tb_usuario where  email=? LIMIT 1";

        $stmt = $conn->prepare($sql);
        $stmt->execute([$email]);
        $row = $stmt->fetch();

        $obj = NULL;

        if ($row) {
            $obj = new Usuario();

            $obj->id = $row['id'];
            $obj->email = $row['email'];
            $obj->salt = $row['salt'];
            $obj->hash_senha = $row['hash_senha'];
        }

        return $obj;
    }
}
