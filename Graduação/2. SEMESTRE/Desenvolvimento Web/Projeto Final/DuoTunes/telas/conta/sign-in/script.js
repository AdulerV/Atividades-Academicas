import { validarEntradas, contornarBordaInput } from '../../scripts/validacao.js';

let email = document.querySelector("#emailInput");
let senha = document.querySelector("#senhaInput");
const form = document.querySelector("form");

email.addEventListener("blur", function () {
    contornarBordaInput(email);
})

senha.addEventListener("blur", function () {
    contornarBordaInput(senha);
})

form.addEventListener("submit", function (evento) {
    let emailInvalido = validarEntradas(email.value);
    let senhaInvalida = validarEntradas(senha.value);

    if (emailInvalido || senhaInvalida) {
        evento.preventDefault();
        mostrarMensagem();
        window.location.href='#resultado';
    }
});

function mostrarMensagem() {
    const span = document.querySelector("#resultado");
    span.textContent = "Usuário ou senha incorretos.";
    span.style.padding = "0.5rem";
    span.style.color = "red";
}

