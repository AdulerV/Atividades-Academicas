function funcaoImpar()
{
var texto = "Olá, Bem Vindo"; 
var resultado = texto.substr(5,9);

document.getElementById("mensagem").innerHTML = resultado;
}