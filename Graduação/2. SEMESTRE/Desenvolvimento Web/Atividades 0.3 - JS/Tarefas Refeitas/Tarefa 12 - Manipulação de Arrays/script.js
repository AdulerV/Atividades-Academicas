let input = document.querySelector("#input");
let array = new Array();
const btn = document.querySelector("button");

btn.addEventListener("click", function () {
    incluirElemento(array, input);
    ordenarArray(array);
    implementarArrayLista(array);
    input.value = null;
    input.focus();
})

const ordenarArray = (array) => array.sort((a, b) => a.toLowerCase().localeCompare(b.toLowerCase()));

const incluirElemento = (array, input) => input.value != '' ? array.push(input.value) : array;

function implementarArrayLista(array) {
    let lista = document.querySelector("ol");
    let itens = new Array();

    for (const elemento of array) {
        itens.push(`<li>${elemento}</li>`)
    }
    lista.innerHTML = itens.join("");
}

