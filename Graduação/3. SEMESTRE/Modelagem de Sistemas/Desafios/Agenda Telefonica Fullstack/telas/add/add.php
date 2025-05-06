<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Criar Contato</title>
</head>

<body>
    <fieldset>
        <h1 id="titulo">Adicionar Contato</h1>

        <form action="../../backend/create.php" method="post">
            <fieldset>
                <legend>Informações Básicas</legend>

                <label for="nome-contato">Nome</label>
                <input type="text" name="nome-contato" id="nome-contato" placeholder="João da Silva">

                <label for="correio-eletronico-contato">Email</label>
                <input type="email" name="correio-eletronico-contato" id="correio-eletronico-contato"
                    placeholder="contato@email.com">

                <label for="telefone-contato[]">Telefone</label>
                <input type="tel" name="telefone-contato[]" class="telefones-contato"
                    placeholder="55-21-99999-9999" pattern="[0-9]{2}-[0-9]{2}-[0-9]{5}-[0-9]{4}">

                <div id="container-btns-telefone">
                    <button id="btn-adicionar-telefone" type="button">+</button>
                    <button id="btn-remover-telefone" type="button">-</button>
                </div>
            </fieldset>

            <fieldset>
                <legend>Endereço</legend>

                <label for="patria">País</label>
                <input type="text" name="patria" id="patria" placeholder="Brasil" class="Brasil">

                <label for="estado">Estado</label>
                <input type="text" name="estado" id="estado" placeholder="Rio de Janeiro" class="endereco-contato">

                <label for="municipio">Município</label>
                <input type="text" name="municipio" id="municipio" placeholder="Rio de Janeiro"
                    class="endereco-contato">

                <label for="bairro">Bairro</label>
                <input type="text" name="bairro" id="bairro" placeholder="Copacabana" class="endereco-contato">

                <label for="logradouro">Logradouro</label>
                <input type="text" name="logradouro" id="logradouro" placeholder="Avenida Prado Júnior"
                    class="endereco-contato" value="">

                <label for="numero">Número</label>
                <input type="number" name="numero" id="numero" placeholder="0" class="endereco-contato" min="0">
            </fieldset>

            <div id="container-btns">
                <button id="btn-salvar-contato" type="submit">Salvar</button>
                <button id="btn-limpar-informacoes" type="reset">Limpar</button>
                <a href="../../index.php" id="btn-voltar-pagina">Voltar</a>
            </div>
        </form>
    </fieldset>

    <script src="script.js"></script>
</body>

</html>