const btnAdicionaContato = document.querySelector("#btn-adicionar-contato");
const btnSalvaContato = document.querySelector("#btn-salvar-contato");
const btnFechaPopup = document.querySelector("#btn-fechar-popup");
const btnApagaContato = document.querySelectorAll(".btn-apagar-contato");
const popup = document.querySelector("dialog");

btnAdicionaContato.addEventListener('click', () => {
    mostrarModal();
});

btnSalvaContato.addEventListener('click', () => {
    const novaLinhaTabela = document.createElement("tr");
    const inputs = document.querySelectorAll("input");

    if (validarInputs(inputs)) {
        adicionarInformacoesBasicas(novaLinhaTabela);
        adicionarEndereco(novaLinhaTabela);
        adicionarBotao(novaLinhaTabela);
        limparInputs(inputs);
        fecharModal();
    } else {
        window.alert("Insira os dados corretamente.");
    }
});

btnFechaPopup.addEventListener('click', () => fecharModal());

function validarInputs(inputs) {
    for (const input of inputs) {
        if (input.value === "" || !input.checkValidity()) {
            return false;
        }
    }
    return true;
}

function limparInputs(inputs) {
    inputs.forEach(input => input.value = null);
}

function adicionarInformacoesBasicas(novaLinhaTabela) {
    let dadosContato = document.querySelectorAll(".dados-contato");

    const corpoTabela = document.querySelector("tbody");
    const mensagem = document.querySelector("#mensagem");

    if (mensagem) {
        mensagem.closest("tr").remove();
    }

    corpoTabela.appendChild(novaLinhaTabela);

    dadosContato.forEach(dado => {
        const novoDadoTabela = document.createElement("td");
        const conteudo = document.createTextNode(dado.value);

        novoDadoTabela.appendChild(conteudo);
        novaLinhaTabela.appendChild(novoDadoTabela);
    });
}

function adicionarEndereco(novaLinhaTabela) {
    let enderecoContato = document.querySelectorAll(".endereco-contato");
    let dadosEndereco = new Array();

    for (let i = 0; i < enderecoContato.length; i++) {
        dadosEndereco[i] = enderecoContato[i].value;
    }

    const novoDadoTabela = document.createElement("td");
    const endereco = document.createTextNode(dadosEndereco.join(", "));
    novoDadoTabela.appendChild(endereco);
    novaLinhaTabela.appendChild(novoDadoTabela);
}

function adicionarBotao(novaLinhaTabela) {
    const novoDadoTabela = document.createElement("td");
    const botaoApaga = document.createElement("button");
    const conteudoBotao = document.createTextNode("Excluir");
    botaoApaga.appendChild(conteudoBotao);
    botaoApaga.classList.add("btn-apagar-contato");

    botaoApaga.addEventListener('click', () => {
        const linhaContato = botaoApaga.closest("tr");
        linhaContato.remove();
    });

    novoDadoTabela.appendChild(botaoApaga);
    novaLinhaTabela.appendChild(novoDadoTabela);
}

const fecharModal = () => popup.close();
const mostrarModal = () => popup.showModal();