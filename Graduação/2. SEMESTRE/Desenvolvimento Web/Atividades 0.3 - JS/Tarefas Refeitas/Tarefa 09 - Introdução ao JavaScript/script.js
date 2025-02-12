const btn = document.querySelector("button");

btn.addEventListener("click", function () {
    let input = document.querySelector("#input");
    let numero = parseFloat(input.value);

    if (isNaN(numero)) {
        window.alert("Por favor, insira um número válido.");
        return;
    }

    if (verificarNumeroIntervalo(numero)) {
        mostrarDivisores(calcularDivisores(numero));
        mudarCorInput(calcularDivisores(numero), input);
    } else {
        window.alert("O número deve estar entre 10 e 1000.");
    }
})

const verificarNumeroIntervalo = (numero) => (numero >= 10 && numero <= 1000);

function calcularDivisores(numero) {
    let divisores = new Array();
    let indice = 0;

    for (let contador = 1; contador <= numero; contador++) {
        if (numero % contador == 0) {
            divisores[indice] = contador;
            indice++;
        }
    }
    return divisores;
}

function mostrarDivisores(divisores) {
    let resultado = document.querySelector("p");
    resultado.textContent = `Divisores: ${divisores.join(", ")}`;
}

function mudarCorInput(divisores, input) {
    if (divisores.length > 5) {
        input.style.backgroundColor = "red";
    } else {
        input.style.backgroundColor = "";
    }
}