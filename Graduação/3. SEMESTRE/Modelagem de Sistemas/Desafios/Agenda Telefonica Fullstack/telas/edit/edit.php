<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Editar Contato</title>
</head>

<body>
    <fieldset>
        <?php
        include_once("../../backend/database/conexao.php");

        $idContato = $_GET["id"];

        $sqlContatos = "SELECT * FROM contato WHERE id_contato = " . $idContato;
        $contatos = mysqli_query($conexao, $sqlContatos);

        $sqlTelefones = "SELECT numero_telefone FROM telefone WHERE fk_id_contato = " . $idContato;
        $telefones = mysqli_query($conexao, $sqlTelefones);

        $sqlEndereco = "SELECT * FROM endereco WHERE fk_id_contato = " . $idContato;
        $enderecos = mysqli_query($conexao, $sqlEndereco);
        ?>

        <h1 id="titulo">Editar Contato</h1>

        <form action="../../backend/update.php" method="post">
            <fieldset>
                <legend>Informações Básicas</legend>

                <input type="hidden" name="id-contato" value="<?= $idContato ?>">

                <?php foreach ($contatos as $contato) { ?>

                    <label for="nome-contato">Nome</label>
                    <input type="text" name="nome-contato" id="nome-contato" placeholder="João da Silva" value="<?= $contato['nome'] ?>">

                    <label for="correio-eletronico-contato">Email</label>
                    <input type="email" name="correio-eletronico-contato" id="correio-eletronico-contato"
                        placeholder="contato@email.com" value="<?= $contato['email'] ?>">

                    <label for="telefone-contato[]">Telefone</label>

                    <?php foreach ($telefones as $telefone) {
                        echo "<input type='tel' name='telefone-contato[]' class='telefones-contato' placeholder='55-21-99999-9999' pattern='[0-9]{2}-[0-9]{2}-[0-9]{5}-[0-9]{4}' value='" . $telefone['numero_telefone'] . "'>";
                    }
                    ?>

                <?php } ?>

                <div id="container-btns-telefone">
                    <button id="btn-adicionar-telefone" type="button">+</button>
                    <button id="btn-remover-telefone" type="button">-</button>
                </div>
            </fieldset>

            <fieldset>
                <legend>Endereço</legend>

                <?php foreach ($enderecos as $endereco) { ?>

                    <label for="patria">País</label>
                    <input type="text" name="patria" id="patria" placeholder="Brasil" value="<?= $endereco['pais'] ?>">

                    <label for="estado">Estado</label>
                    <input type="text" name="estado" id="estado" placeholder="Rio de Janeiro" class="endereco-contato" value="<?= $endereco['estado'] ?>">

                    <label for="municipio">Município</label>
                    <input type="text" name="municipio" id="municipio" placeholder="Rio de Janeiro"
                        class="endereco-contato" value="<?= $endereco['municipio'] ?>">

                    <label for="bairro">Bairro</label>
                    <input type="text" name="bairro" id="bairro" placeholder="Copacabana" class="endereco-contato" value="<?= $endereco['bairro'] ?>">

                    <label for="logradouro">Logradouro</label>
                    <input type="text" name="logradouro" id="logradouro" placeholder="Avenida Prado Júnior"
                        class="endereco-contato" value="<?= $endereco['logradouro'] ?>">

                    <label for="numero">Número</label>
                    <input type="number" name="numero" id="numero" placeholder="0" class="endereco-contato" min="0" value="<?= $endereco['numero'] ?>">

                <?php } ?>

            </fieldset>

            <div id="container-btns">
                <button id="btn-salvar-contato" type="submit">Salvar</button>
                <button id="btn-limpar-informacoes" type="reset">Restabelecer</button>
                <a href="../../index.php" id="btn-voltar-pagina">Voltar</a>
            </div>
        </form>
    </fieldset>

    <script src="script.js"></script>
</body>

</html>