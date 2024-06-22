
import { somar, mdc, potencia, raiz } from "./util/matematica.js"

let btns = document.querySelectorAll(".container button")
let resultado = document.querySelector(".container span")

console.log(btns)

btns[0].onclick = () => {
    var valor1 = parseFloat(document.querySelector("#valor1").value)
    var valor2 = parseFloat(document.querySelector("#valor2").value)

    if (isNaN(valor1) || isNaN(valor2)) {
        resultado.innerHTML = "Informar um valor correto";
    } else {
        resultado.innerHTML = somar(valor1, valor2);
    }

}

btns[1].onclick = () => {
    var valor1 = parseFloat(document.querySelector("#valor1").value)
    var valor2 = parseFloat(document.querySelector("#valor2").value)

    if (isNaN(valor1) || isNaN(valor2)) {
        resultado.innerHTML = "Informar um valor correto";
    } else {
        resultado.innerHTML = mdc(valor1, valor2)
    }
}

btns[2].onclick = () => {
    var valor1 = parseFloat(document.querySelector("#valor1").value)
    var valor2 = parseFloat(document.querySelector("#valor2").value)

    if (isNaN(valor1) || isNaN(valor2)) {
        resultado.innerHTML = "Informar um valor correto";
    } else {
        resultado.innerHTML = potencia(valor1, valor2)
    }
}

btns[3].onclick = () => {
    var valor1 = parseFloat(document.querySelector("#valor1").value)

    if (isNaN(valor1)) {
        resultado.innerHTML = "Informar um valor correto";
    } else {
        resultado.innerHTML = raiz(valor1)
    }
}


