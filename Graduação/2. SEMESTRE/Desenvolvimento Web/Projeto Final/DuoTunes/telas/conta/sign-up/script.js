import { validarEntradas, contornarBordaInput } from '../../scripts/validacao.js';

let inputs = document.querySelectorAll(".inputFormulario");
let email = document.querySelector("#emailInput");
let senha = document.querySelector("#senhaInput");
let confirmaSenha = document.querySelector("#confirmaSenhaInput");

senha.addEventListener("focus", inicializarValidacaoSenha);
confirmaSenha.addEventListener("focus", inicializarValidacaoConfirmaSenha);
email.addEventListener("focus", inicializarValidacaoEmail);

function inicializarValidacaoSenha() {
    let criterios = [
        { descricao: "Pelo menos 8 caracteres", valida: contarCaracteres },
        { descricao: "Letras minúsculas e maiúsculas", valida: verificarLetras },
        { descricao: "Caracteres especiais", valida: verificarCaracteresEspeciais },
        { descricao: "Senha e confirmação iguais", valida: (senha1, senha2) => (senha1 === senha2 && senha1 !== "") }
    ];

    gerarLista(criterios);

    let item = document.querySelectorAll(".item");

    senha.addEventListener("click", main);
    senha.addEventListener("keyup", main);

    function main() {
        mudarCorFonte(contarCaracteres(senha.value), item[0]);
        mudarCorFonte(verificarLetras(senha.value), item[1]);
        mudarCorFonte(verificarCaracteresEspeciais(senha.value), item[2]);
        mudarCorFonte(confirmarSenhas(senha.value, confirmaSenha.value), item[3]);
    }
}

function inicializarValidacaoConfirmaSenha() {
    let criterio = [
        { descricao: "Senha e confirmação iguais", valida: (senha1, senha2) => (senha1 === senha2 && senha1 !== "") }
    ];

    gerarLista(criterio);

    let item = document.querySelectorAll(".item");

    confirmaSenha.addEventListener("click", main);
    confirmaSenha.addEventListener("keyup", main);

    function main() {
        mudarCorFonte(confirmarSenhas(senha.value, confirmaSenha.value), item[0]);
    }
}

function inicializarValidacaoEmail() {
    let criterios = [
        { descricao: "Pelo menos um arroba", valida: verificarArroba },
        { descricao: "Ponto após o arroba", valida: verificarPontoPosArroba },
        { descricao: "Sem espaços em branco", valida: verificarEspacoEmBranco },
    ];

    gerarLista(criterios);

    let item = document.querySelectorAll(".item");

    email.addEventListener("click", main);
    email.addEventListener("keyup", main);

    function main() {
        mudarCorFonte(verificarArroba(email.value), item[0]);
        mudarCorFonte(verificarPontoPosArroba(email.value), item[1]);
        mudarCorFonte(verificarEspacoEmBranco(email.value) && !validarEntradas(email.value), item[2]);
    }
}

function gerarLista(criterios) {
    let resultado = document.querySelector("#resultado");
    resultado.innerHTML = "";

    let ul = document.createElement("ul");
    criterios.forEach(criterio => {
        let li = document.createElement("li");
        li.textContent = criterio.descricao;
        li.classList.add("item");
        li.style.color = "red";
        ul.appendChild(li);
    });
    resultado.style.padding = "0.5rem";
    resultado.appendChild(ul);
}

const mudarCorFonte = (parametro, item) => item.style.color = parametro ? "green" : "red";

const contarCaracteres = (texto) => texto.length >= 8;

const confirmarSenhas = (senha1, senha2) => senha1 === senha2 && senha1 !== "" && senha2 !== "";

const verificarArroba = (email) => email.includes("@");

const verificarPontoPosArroba = (email) => email.indexOf(".") > email.indexOf("@");

const verificarEspacoEmBranco = (email) => !(/\s/.test(email));

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

    return maiuscula && minuscula;
}

function verificarCaracteresEspeciais(texto) {
    let caracteresEspeciais = "@#$%&*()_+[]{}|;:'\",.<>/?\\";
    return [...caracteresEspeciais].some(caractere => texto.includes(caractere));
}


const form = document.querySelector("form");

for (const input of inputs) {
    input.addEventListener("blur", function () {
        contornarBordaInput(input);
    });
}

form.addEventListener("submit", function (evento) {
    let validador = true;

    for (const input of inputs) {
        if (validarEntradas(input.value)) {
            validador = false;
        }
    }

    if (!validarFormulario()) {
        validador = false;
    }

    if (!validador) {
        evento.preventDefault();
        mostrarMensagem();
        window.location.href='#resultado';
    }
});


function validarFormulario() {
    let validador = true;

    if (!(verificarArroba(email.value) && verificarPontoPosArroba(email.value) && verificarEspacoEmBranco(email.value))) {
        validador = false;
    }

    if (!(contarCaracteres(senha.value) && verificarLetras(senha.value) && verificarCaracteresEspeciais(senha.value))) {
        validador = false;
    }

    if (!confirmarSenhas(senha.value, confirmaSenha.value)) {
        validador = false;
    }

    return validador;
}

function mostrarMensagem() {
    const span = document.querySelector("#resultado");
    span.textContent = "Preencha todos os campos corretamente.";
    span.style.padding = "0.5rem";
    span.style.color = "red";
}