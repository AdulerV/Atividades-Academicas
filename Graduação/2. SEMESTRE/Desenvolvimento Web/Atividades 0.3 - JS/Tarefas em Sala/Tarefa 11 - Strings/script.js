function validarSenha() {
    let inputSenha = document.querySelector("#inpSenha");
    let inputConfirmacao = document.querySelector("#inpConfirmacao");
    let verificador1 = false;
    let verificador2 = false;
    const expressaoRegular = /\W|_/;

    if (inputSenha.value.length >= 8) {
        document.querySelector("#caracteres").style.color = "green";
    } else {
        document.querySelector("#caracteres").style.color = "red";
    }

    for (let i = 0; i < inputSenha.value.length; i++) {
        console.log(inputSenha.value.length);
        if (inputSenha.value.charAt(i) === inputSenha.value.charAt(i).toUpperCase()) {
            verificador1 = true;
        }

        if (inputSenha.value.charAt(i) === inputSenha.value.charAt(i).toLowerCase()) {
            verificador2 = true;
        }
    }

    if (verificador1 && verificador2) {
        document.querySelector("#letras").style.color = "green";
    } else {
        document.querySelector("#letras").style.color = "red";
    }

    if (expressaoRegular.test(inputSenha.value)) {
        document.querySelector("#especiais").style.color = "green";
    } else {
        document.querySelector("#especiais").style.color = "red";
    }

    if (inputSenha.value === inputConfirmacao.value) {
        document.querySelector("#iguais").style.color = "green";
    } else {
        document.querySelector("#iguais").style.color = "red";
    }
}