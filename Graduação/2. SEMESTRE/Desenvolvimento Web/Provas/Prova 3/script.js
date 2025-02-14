const estadosCidades = [
    {
        nome: "Minas Gerais",
        cidades: ["Belo Horizonte", "Juiz de Fora", "Betim"]
    },

    {
        nome: "Rio de Janeiro",
        cidades: ["Rio de Janeiro", "Niterói", "Campus"]
    },

    {
        nome: "São Paulo",
        cidades: ["São Paulo", "Campinas", "São José dos Campos"]
    },
]

let selectEstado = document.querySelector("#estados");

selectEstado.addEventListener("change", function () {
    compararEstados(selectEstado, estadosCidades);
})

function iniciarRotina() {
    carregarEstados(estadosCidades);
}

function carregarEstados(estados) {
    let lista = new Array(`<option>Selecionar</option>`);

    for (const estado of estados) {
        lista.push(`<option value="${estado.nome}">${estado.nome}</option>`);
    }
    selectEstado.innerHTML = lista.join("");
}

function compararEstados(selecione, estados) {
    let selecioneCidade = document.querySelector("#cidades");

    for (const estado of estados) {
        if (estado.nome === selecione.value) {
            carregarCidades(estado, selecioneCidade);
            return;
        }
    }
    selecioneCidade.value = "";
    selecioneCidade.disabled = true;
}

function carregarCidades(estado, selecioneCidade) {
    let lista = new Array(`<option>Selecionar</option>`);

    for (cidade of estado.cidades) {
        lista.push(`<option value="${cidade}">${cidade}</option>`);

    }

    selecioneCidade.innerHTML = lista.join("");
    selecioneCidade.disabled = false;
}
