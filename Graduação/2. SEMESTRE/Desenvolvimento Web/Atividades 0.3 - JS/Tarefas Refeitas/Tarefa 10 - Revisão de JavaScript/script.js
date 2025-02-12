let inpNumero1 = document.querySelector("#inpNumero1");
let inpNumero2 = document.querySelector("#inpNumero2");
const btn = document.querySelector("button");
let produtoAcumulado = 0;

inpNumero1.addEventListener("keyup", function () {
    principal(inpNumero1, inpNumero2);
});

inpNumero2.addEventListener("keyup", function () {
    principal(inpNumero2, inpNumero1);
});

btn.addEventListener("click", function () {
    acumularValores(inpNumero1, inpNumero2);
    mudarCorInput(inpNumero1);
    mudarCorInput(inpNumero2);
    habilitarBotao(inpNumero1.value, inpNumero2.value);
});

function principal(input1, input2) {
    mudarCorInput(input1);
    mostrarProduto(input1.value, input2.value);
    habilitarBotao(input1.value, input2.value);
}

const verificarValor = (valor) => (parseFloat(valor) > 0);

function acumularValores(input1, input2) {
    let resultado = document.querySelector("#acumulado");
    produtoAcumulado += parseFloat(input1.value) * parseFloat(input2.value);
    resultado.textContent = `Acumulado: ${produtoAcumulado}`;
    input1.value = '';
    input2.value = '';
}

function mudarCorInput(input) {
    if (verificarValor(input.value)) {
        input.style.backgroundColor = "green";
    } else {
        input.style.backgroundColor = "red";
    }
}

function habilitarBotao(numero1, numero2) {
    if (verificarValor(numero1) && verificarValor(numero2)) {
        btn.disabled = false;
    } else {
        btn.disabled = true;
    }
}

function mostrarProduto(numero1, numero2) {
    let resultado = document.querySelector("#produto");

    if (verificarValor(numero1) && verificarValor(numero2)) {
        resultado.textContent = `Valor: ${parseFloat(numero1) * parseFloat(numero2)}`;
    } else {
        resultado.textContent = "Informe números maiores do que zero";
    }
}
