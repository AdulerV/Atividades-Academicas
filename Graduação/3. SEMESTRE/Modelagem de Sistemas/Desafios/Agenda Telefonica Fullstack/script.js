const btnAdicionaContato = document.querySelector("#btn-adicionar-contato");
const btnSalvaContato = document.querySelector("#btn-salvar-contato");
const btnFechaPopup = document.querySelector("#btn-fechar-popup");
const popup = document.querySelector("dialog");

btnAdicionaContato.addEventListener("click", () => {
    mostrarModal();
});

btnSalvaContato.addEventListener("click", () => {
    const inputs = document.querySelectorAll("input");

    if (validarInputs(inputs)) {
        window.alert("Contato enviado com sucesso!");
        fecharModal();
    } else {
        window.alert("Insira os dados corretamente.");
        event.preventDefault();
    }
});

btnFechaPopup.addEventListener("click", () => fecharModal());

function validarInputs(inputs) {
    for (const input of inputs) {
        if (input.value === "" || !input.checkValidity()) {
            return false;
        }
    }
    return true;
}

const fecharModal = () => popup.close();
const mostrarModal = () => popup.showModal();