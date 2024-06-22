function minhaFuncao() {
    let Name = document.getElementById("inputNome").value;
    let Email1 = document.getElementById("inputEmail").value;
    let Email2 = document.getElementById("inputEmail2").value;
    let Tel = document.getElementById("inputTel").value;
    let Date = document.getElementById("inputDate").value;
    let Senha = document.getElementById("inputSenha").value;


    if (Tel.length < 1) {
        alert("Não deixe os campos em branco");
        return false
    }
    if (Date.length < 1) {
        alert("Não deixe os campos em branco");
        return false
    }
    if (Senha.length < 1) {
        alert("Não deixe os campos em branco");
        return false
    }
    /*falso caso algum campo tenha sido deixado em branco*/



    if (Name.length < 21) {
        alert("O nome precisa ter mais de 20 caracteres")
        return false
    }

    if (Name.indexOf(" ") == -1) {
        alert("O nome precisa ter pelo menos um espaço em branco")
        return false
    }
    /*o nome deve ter mais de 20 caracteres e pelo menos um espaço em branco*/



    if (Email1.length < 11) {
        alert("O Email precisa ter mais de 10 caracteres")
        return false
    }
    /*o e-mail deverá ter mais de 10 caracteres;*/

    if (Email1.indexOf('@') == -1) {
        alert("Insira pelo menos uma arroba no email")
        return false
    }
    /*pelo menos uma arroba;*/

    if (Email1.indexOf('@') < 3) {
        alert("Email com pelo menos 3 caracteres antes do arroba")
        return false
    }
    /*pelo menos 3 caracteres antes da arroba;*/

    if (Email1.split('@')[1].length < 7) {
        alert("Email com pelo menos 7 caracteres depois do arroba")
        return false
    }
    /*pelo menos 7 caracteres depois da arroba;*/

    if (Email1.lastIndexOf('.') < Email1.indexOf('@')) {
        alert("Email com pelo menos um ponto depois do arroba")
        return false
    }
    /*pelo menos um ponto depois da arroba;*/

    if (Email1 != Email2) {
        alert("Insira o mesmo email em ambos")
        return false
    }
    /*A segunda digitação do e-mail deverá ser idêntica à primeira;*/

    else {
        alert("Parece certo. Vou tentar enviar!")
        return true
    }

}