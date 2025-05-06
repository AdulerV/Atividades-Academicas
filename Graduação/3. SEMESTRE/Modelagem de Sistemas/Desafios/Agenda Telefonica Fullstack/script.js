const btnsExcluiContato = document.querySelectorAll(".btn-excluir-contato");

for (const btnExcluiContato of btnsExcluiContato) {
    btnExcluiContato.addEventListener("click", () => {
        if (!window.confirm("Tem certeza que deseja excluir?")) {
            event.preventDefault();
        }
    })
}