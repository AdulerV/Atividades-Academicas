let acumulado = 0;

const carregarInputs = () => {
    let numero1 = document.querySelector("#inpNumero1");
    let numero2 = document.querySelector("#inpNumero2");
    let btn = document.querySelector("#botao");

    btn.disabled = true;
    numero1.style.backgroundColor = "red";
    numero2.style.backgroundColor = "red";
}

const verificarNumeros = () => {
    let numero1 = document.querySelector("#inpNumero1");
    let numero2 = document.querySelector("#inpNumero2");

    if (numero1.value != "") {
        numero1.style.backgroundColor = "green";
        multiplicarNumero(parseFloat(numero1.value) * parseFloat(numero2.value))
    }

    if (numero2.value != "") {
        numero2.style.backgroundColor = "green";
        multiplicarNumero(parseFloat(numero1.value) * parseFloat(numero2.value))
    }

    if (numero1.value == "") {
        numero1.style.backgroundColor = "red";
        multiplicarNumero(parseFloat(0));
    }

    if (numero2.value == "") {
        numero2.style.backgroundColor = "red";
        multiplicarNumero(parseFloat(0));
    }

    if (numero1.value == "" && numero2.value == "") {
        multiplicarNumero(parseFloat(0));
    }
}

const multiplicarNumero = (produto) => {
    let resultado = document.querySelector("#resultado");
    let btn = document.querySelector("#botao");

    if (produto > 0) {
        resultado.innerHTML = `Valor: ${produto}`;
        btn.disabled = false;
    } else {
        resultado.innerHTML = "Informe números maiores do que zero.";
        btn.disabled = true;
    }
}

const acumularProduto = () => {
    let contador = document.querySelector("#acumulado");
    let numero1 = document.querySelector("#inpNumero1");
    let numero2 = document.querySelector("#inpNumero2");
    acumulado += numero1.value * numero2.value;
    numero1.value = null;
    numero2.value = null;
    contador.innerHTML = `Acumulado: ${acumulado}`;
}