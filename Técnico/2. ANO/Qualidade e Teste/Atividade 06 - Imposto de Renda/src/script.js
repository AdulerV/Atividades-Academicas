import { salarioBase, inss, bonusFilho, ValeTransporte, trabalhoNoturno, calculaSalario, impostoRenda } from "./util/imposto.js"
let btns = document.querySelectorAll(".container button");
let resultado = document.querySelector(".container span");

btns[0].onclick = () => {
    let salario = parseFloat(document.querySelector("#SalarioBase").value);
    let numFilhos = parseInt(document.querySelector("#numFilhos").value);
    let valeT = document.getElementsByName("valeT");
    let tNoite = document.getElementsByName("tNoite");
    let salario_base = salarioBase(salario);
    let inss_salario = inss(salario);
    let bonusFilho_salario = bonusFilho(numFilhos);
    let ValeTransporte_salario = ValeTrans();
    let trabalhoNoturno_salario = TrabNoite();

    function ValeTrans() {
        if (valeT[0].checked == true) {
            return ValeTransporte(salario);
        } else if (valeT[1].checked == true) {
            return ValeTransporte(0);
        }
    }

    function TrabNoite() {
        if (tNoite[0].checked == true) {
            return trabalhoNoturno(salario);
        } else if (tNoite[1].checked == true) {
            return trabalhoNoturno(0);
        }
    }

    if ((isNaN(salario) || isNaN(numFilhos)) || (salario < 0 || numFilhos < 0)) {
        resultado.innerHTML = "Insira valores válidos"
    } else if ((valeT[0].checked == false && valeT[1].checked == false) || (tNoite[0].checked == false && tNoite[1].checked == false)) {
        resultado.innerHTML = "Selecione as opções"
    } else {
        let salarioFinal = calculaSalario(salario_base, inss_salario, bonusFilho_salario, ValeTransporte_salario, trabalhoNoturno_salario);
        let imposto = impostoRenda(salarioFinal);
        resultado.innerHTML = `Seu Salário Completo é de R$${salarioFinal}  e  ${imposto}`;
    }
}



