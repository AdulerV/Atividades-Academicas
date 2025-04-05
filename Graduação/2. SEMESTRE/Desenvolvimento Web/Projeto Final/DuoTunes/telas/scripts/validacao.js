export const validarEntradas = (valor) => (valor == "" || valor == "placeholder");

export function contornarBordaInput(input) {
    if(validarEntradas(input.value)) {
        input.style.borderColor = "red";
    } else {
        input.style.borderColor = "";
    }
}