let senha = document.querySelector("#senhaInput");
let senhaConfirmada = document.querySelector("#confirmaInput");

senha.addEventListener("keyup", function () {
    principal(senha, senhaConfirmada);
})

senhaConfirmada.addEventListener("keyup", function () {
    principal(senha, senhaConfirmada);
})

function principal(senha1, senha2) {
    let item = document.querySelectorAll(".item");

    mudarCorFonte(contarCaracteres(senha1.value), item[0]);
    mudarCorFonte(verificarLetras(senha1.value), item[1]);
    mudarCorFonte(verificarCaracteresEspeciais(senha1.value), item[2]);
    mudarCorFonte(confirmarSenhas(senha1.value, senha2.value), item[3]);
}

const mudarCorFonte = (parametro, item) => item.style.color = (parametro) ? "green" : "red";

const contarCaracteres = (texto) => (texto.length >= 8);

const confirmarSenhas = (senha1, senha2) => (senha1 === senha2 && senha1 != "" && senha1 != "");

function verificarLetras(texto) {
    let maiuscula = false, minuscula = false;

    for (let letra of texto) {
        if (/[a-zA-Z]/.test(letra)) {
            if (letra === letra.toUpperCase()) {
                maiuscula = true;
            }
            if (letra === letra.toLowerCase()) {
                minuscula = true;
            }
        }
    }

    return (maiuscula && minuscula);
}

function verificarCaracteresEspeciais(texto) {
    let caracteresEspeciais = new String("@#$%&*()_+[]{}|;:'\",.<>/?\\");

    for (let caractere of caracteresEspeciais) {
        if (texto.includes(caractere)) {
            return true;
        }
    }

    return false;
}