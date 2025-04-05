import { validarEntradas, contornarBordaInput } from '../scripts/validacao.js';

let inputs = document.querySelectorAll(".inpFormulario");
const form = document.querySelector("form");

for (const input of inputs) {
    input.addEventListener("blur", function () {
        contornarBordaInput(input);
    })
}

form.addEventListener("submit", function (evento) {
    for (const input of inputs) {
        if (validarEntradas(input.value)) {
            evento.preventDefault();
            mostrarMensagem();
            window.location.href='#resultado';
        }
    }
});

const section = document.querySelector("section");
const div = document.createElement('div');
div.setAttribute('class', 'helper');
const span = document.createElement('span');
span.setAttribute('id', 'resultado');

function mostrarMensagem() {
    section.appendChild(div);
    div.appendChild(span);

    span.textContent = "Preencha todos os campos obrigatórios.";
    span.style.padding = "0.5rem";
    span.style.color = "red";
}