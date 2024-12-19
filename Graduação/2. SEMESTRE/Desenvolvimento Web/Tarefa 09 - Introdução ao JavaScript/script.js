const numero = document.querySelector('#inpNumber');
const paragrafo = document.querySelector('#paragrafo');

const verificarNumero = () => {
    redefinirConfiguracoes();

    if (numero.value >= 10 /*&&  numero.value <= 1000 */) {
        imprimirDivisores(numero);
    } else {
        window.alert("Número inserido inválido.");
    }
}

const redefinirConfiguracoes = () => {
    paragrafo.innerHTML = "";
    numero.style.backgroundColor = "white";
}

const imprimirDivisores = (numero) => {
    let divisores = 0, resultado = "";

    for (let i = 1; i <= numero.value; i++) {
        if (numero.value % i == 0) {
            resultado += `<br> ${i}`;
            divisores++;
        }
    }
    paragrafo.innerHTML += `Divisores de ${numero.value}:`
    paragrafo.innerHTML += resultado;
    mudarCorInput(divisores);
}

const mudarCorInput = (divisores) => {
    if (divisores > 5) {
        numero.style.backgroundColor = "#FF0000";
    }
}

