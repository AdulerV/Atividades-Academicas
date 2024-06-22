function minhaFuncao() {

    var input = [];
    input = document.getElementsByTagName('input');

    for (let i = 0; i < 6; i++) {
        if (input[i].value == "") {
            alert("Preencha os campos");
            return false
        }
    }
}

/* if (document.getElementById("inputEmail").value == "") {
    alert("Não deixe os campos em branco");
    return false
}
if (document.getElementById("inputEmail2").value == "") {
    alert("Não deixe os campos em branco");
    return false
}
if (document.getElementById("inputSenha").value == "") {
    alert("Não deixe os campos em branco");
    return false
}
if (document.getElementById("inputTel").value == "") {
    alert("Não deixe os campos em branco");
    return false
}
if (document.getElementById("inputCPF").value == "") {
    alert("Não deixe os campos em branco");
    return false
}
if (document.getElementById("inputDate").value == "") {
    alert("Não deixe os campos em branco");
    return false
} */

