const btnSalvaContato = document.querySelector("#btn-salvar-contato");
const btnEditaContato = document.querySelector("#btn-editar-contato");
const btnAdicionaTelefone = document.querySelector("#btn-adicionar-telefone");
const btnRemoveTelefone = document.querySelector("#btn-remover-telefone");

btnSalvaContato.addEventListener("click", () => {
    const inputs = document.querySelectorAll("input");
    console.log(inputs.length);

    if (validarInputs(inputs)) {
        window.alert("Contato alterado com sucesso!");
        fecharModal();
    } else {
        window.alert("Insira os dados corretamente.");
        event.preventDefault();
    }
});

function validarInputs(inputs) {
    for (const input of inputs) {
        if (input.value === "" || !input.checkValidity()) {
            return false;
        }
    }
    return true;
}

btnAdicionaTelefone.addEventListener("click", () => {
    const fieldset = document.querySelectorAll("fieldset");
    const container = document.querySelector("#container-btns-telefone");
    const novoTelefone = document.createElement("input");

    novoTelefone.type = "tel";
    novoTelefone.name = "telefone-contato[]"
    novoTelefone.className = `telefones-contato`;
    novoTelefone.placeholder = `55-21-99999-9999`;
    novoTelefone.pattern = "[0-9]{2}-[0-9]{2}-[0-9]{5}-[0-9]{4}";

    fieldset[1].insertBefore(novoTelefone, container);
})

btnRemoveTelefone.addEventListener("click", () => {
    const telefones = document.querySelectorAll(".telefones-contato");

    if (telefones.length > 1) {
        telefones[telefones.length - 1].remove();
        return;
    } else {
        window.alert("Necessário no mínimo um telefone.");
    }
})