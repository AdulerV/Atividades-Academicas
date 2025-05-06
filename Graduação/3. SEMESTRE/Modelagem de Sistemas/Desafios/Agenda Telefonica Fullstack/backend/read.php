<?php
include_once("backend/database/conexao.php");

$sql = "SELECT * FROM contato";
$contatos = mysqli_query($conexao, $sql);

if (mysqli_num_rows($contatos) > 0) {
    foreach ($contatos as $contato) {
        $sqlTelefones = "SELECT numero_telefone FROM telefone WHERE fk_id_contato = " . $contato["id_contato"];
        $telefones = mysqli_query($conexao, $sqlTelefones);

        $sqlEnderecos = "SELECT * FROM endereco WHERE fk_id_contato = " . $contato["id_contato"];
        $enderecos = mysqli_query($conexao, $sqlEnderecos);
?>
        <tr>
            <td><?= $contato["nome"] ?></td>
            <td><?= $contato["email"] ?></td>
            <td>
                <?php
                foreach ($telefones as $telefone) {
                    echo $telefone["numero_telefone"] . "<br>";
                }
                ?>
            </td>
            <td>
                <?php
                foreach ($enderecos as $endereco) {
                    echo $endereco["pais"] . " - "
                        . $endereco["estado"] . " - "
                        . $endereco["municipio"] . " - "
                        . $endereco["bairro"] . " - "
                        . $endereco["logradouro"] . " - "
                        . $endereco["numero"];
                }
                ?>
            </td>
            <td id="table-data-btns">
                <a href="telas/edit/edit.php?id=<?= $contato['id_contato'] ?>" class="btn-editar-contato">Editar</a>
                <a href="backend/delete.php?id=<?= $contato['id_contato'] ?>" class="btn-excluir-contato">Excluir</a>
            </td>
        </tr>
<?php
    }
} else {
    echo "<tr><td colspan='5' id='mensagem-nenhum-contato'>Nenhum Contato Encontrado</td></tr>";
}
mysqli_close($conexao);
?>