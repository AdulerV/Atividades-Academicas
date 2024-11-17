/*Inicio da Atividade 01*/

let valor1 = document.getElementById('valor1');
let valor2 = document.getElementById('valor2');
let btn = document.getElementById('botaoSoma');
let resposta = document.getElementById('resultado');

btn.addEventListener("click", () => {
    let soma = parseInt(valor1.value) + parseInt(valor2.value);
    resposta.innerHTML = `A soma é ${soma}`;
})

/*Fim da Atividade 01*/

/*Inicio da Atividade 02*/

let altura = document.getElementById('valorAlt');
let peso = document.getElementById('valorPeso');
let btnIMC = document.getElementById('botaoIMC');
let respostaIMC = document.getElementById('resultadoIMC');

btnIMC.addEventListener("click", () => {
    let calculoIMC = parseFloat(peso.value) / (parseFloat(altura.value) * parseFloat(altura.value))

    if (calculoIMC < 18.5) {
        respostaIMC.innerHTML = "Você está abaixo do peso";
    }

    else if (calculoIMC > 18.5 && calculoIMC < 24.9) {
        respostaIMC.innerHTML = "Você está com peso normal";
    }

    else if (calculoIMC > 24.9 && calculoIMC < 29.9) {
        respostaIMC.innerHTML = "Você está com sobrepeso";
    }

    else if ((calculoIMC > 29.9) && (calculoIMC < 34.5)) {
        respostaIMC.innerHTML = "Você está com obesidade nivel 1";
    }


    else if ((calculoIMC > 34.5) && (calculoIMC < 39.9)) {
        respostaIMC.innerHTML = "Você está com obesidade nivel 2";
    }

    else if (calculoIMC > 39.9) {
        respostaIMC.innerHTML = "Você está com obesidade nivel 3";
    }

    else {
        respostaIMC.innerHTML = "Valor Inválido"
    }

})

/*Fim da Atividade 02*/

/*Inicio da Atividade 03*/

let alturaGeometrica = document.getElementById('valorAltura');
let baseGeometrica = document.getElementById('valorBase');
let btnArea = document.getElementById('botaoArea');
let respostaArea = document.getElementById('resultadoArea');
let retangulo = document.getElementById('opçãoRetangulo');
let triangulo = document.getElementById('opçãoTriangulo');


btnArea.addEventListener("click", () => {

    if (retangulo.checked == true) {
        respostaArea.innerHTML = `${parseInt(baseGeometrica.value) * parseInt(alturaGeometrica.value)} cm² `;
    }
    else if (triangulo.checked == true) {
        respostaArea.innerHTML = `${(parseInt(baseGeometrica.value) * parseInt(alturaGeometrica.value)) / 2} cm²`;
    }

    else {
        respostaArea.innerHTML = "Valor Inválido"
    }
})

/*Fim da Atividade 03*/