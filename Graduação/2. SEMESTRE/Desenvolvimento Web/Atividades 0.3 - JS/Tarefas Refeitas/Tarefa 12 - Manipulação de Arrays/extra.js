let input = document.querySelector("#input");
let array = [];  // Inicializa o array apenas uma vez
const btn = document.querySelector("button");

btn.addEventListener("click", function () {
    incluirElemento(array, input);
    ordenarArray(array);
    implementarArrayLista(array);
    input.value = null;
    input.focus();
})

const ordenarArray = (array) => array.sort((a, b) => a.toLowerCase().localeCompare(b.toLowerCase()));

function incluirElemento(array, input) {
    let valor = input.value.trim();  // Remove espaços desnecessários
    if (valor && !array.includes(valor)) {  // Verifica se o valor não é vazio e não é duplicado
        array.push(valor);
    }
}

function implementarArrayLista(array) {
    let lista = document.querySelector("ol");
    lista.innerHTML = "";  // Limpa a lista antes de recriar os elementos

    array.forEach(elemento => {
        let li = document.createElement("li");
        li.textContent = elemento;
        lista.appendChild(li);
    });
}
