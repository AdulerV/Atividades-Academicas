<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/pag_principal.css">
    <link rel="shortcut icon" href="images/favicon.png" type="image/x-icon">
    <title>Wiki Games</title>
</head>

<body>
    <?php $cabecalho = require_once('funcoes/cabecalho.php');
    echo $cabecalho ?>

    <article class="artigo">
        <div class="secaoConteudo">
            <h1 class="titulo">Bem-vindo à maior Wiki de Games do mundo!</h1>
            <p> Bem-vindo ao Wiki Games, o lugar onde você pode encontrar informações completas sobre os seus jogos e
                personagens favoritos! Se você é um amante de videogames, então você está no lugar certo. Nós fornecemos
                uma lista extensiva de jogos dos mais variados gêneros, como ação, aventura, RPG, esportes, entre
                outros.
                Além disso, você pode encontrar informações detalhadas sobre os personagens, incluindo suas habilidades,
                história
                e curiosidades</p>
            <p>Em nosso site, você pode navegar encontrar diferentes categorias, como os jogos mais populares,
                lançamentos recentes, personagens icônicos e muito mais. Se você está procurando informações específicas
                sobre um jogo ou personagem em particular, é fácil encontrar o que precisa.</p>
            <p>Nós nos esforçamos para manter nossas informações sempre atualizadas, para que você possa ter certeza de
                que
                está obtendo as informações mais recentes e precisas. E se você quiser contribuir com seu conhecimento
                sobre
                jogos e personagens, você pode se tornar um membro do nosso site e ajudar a expandir nossa lista de
                informações.</p>
            <p>Então, se você é um gamer ávido ou apenas está começando a explorar o mundo dos jogos, o Wiki Games é o
                lugar perfeito para começar a sua jornada. Explore nosso site hoje e mergulhe no incrível mundo dos
                jogos!
            </p>
            <section class="secaoImagem">
                <img src="images/logoExemplo.png" alt="Logo de exemplo no artigo">
            </section>
            <hr>
        </div>
    </article>

    <?php $rodape = require_once('funcoes/rodape.php');
    echo $rodape ?>
</body>

</html>