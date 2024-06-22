function funcaoLogin() {

    let Name = document.querySelector('#inputID').value;
    let Email = document.querySelector('#inputEmail').value;
    let Senha = document.querySelector('#inputPass').value;

    if (((Name.length < 1) || (Email.length < 1) || (Senha.length < 1))) {

        document.querySelector('#inputID').style.borderColor = "red"
        document.querySelector('#inputEmail').style.borderColor = "red"
        document.querySelector('#inputPass').style.borderColor = "red"

        alert('Campos em branco')
        return false
    }
    /*Não é permito espaços em branco nos inputs*/

    if (Name.indexOf(' ') > 0) {

        document.querySelector('#inputID').style.borderColor = "red"
        alert('Espaços em branco no ID')
        return false
    }
    /*Espaços em branco no ID*/

    if (Email.length < 10) {

        document.querySelector('#inputEmail').style.borderColor = "red"
        alert('Email Inválido (Menos de 10 caracteres)')
        return false
    }
    /*Email com menos de 10 caracteres*/

    if (Email.indexOf('.com') == -1) {

        document.querySelector('#inputEmail').style.borderColor = "red"
        alert('Email Inválido (Falta da extensão ".com" )')
        return false
    }
    /*Falta da extensão ".com"*/

    if (Senha.length < 4) {
        document.querySelector('#inputPass').style.borderColor = "red"
        alert('Senha inválida (menos de 4 caracteres)')
        return false
    }
}
