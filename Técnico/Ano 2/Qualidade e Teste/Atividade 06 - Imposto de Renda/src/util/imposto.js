//Salário Base
const salarioBase = (salario) => {
    var salBase = salario;
    return parseFloat(salBase.toFixed(2))
}

//INSS
const inss = (salario) => {
    const INSS = 0.13;
    var inssSalario = salario * INSS;
    return parseFloat(inssSalario.toFixed(2))
}

//Bônus Por Filho
const bonusFilho = (numerosFilhos) => {
    const BONUS_FILHO = 50;
    const LIMITE_FILHOS = 3;
    var bonusFilhoSalario = (numerosFilhos >= LIMITE_FILHOS) ? 3 * BONUS_FILHO : numerosFilhos * BONUS_FILHO;
    return parseFloat(bonusFilhoSalario.toFixed(2))
}

//Vale Transporte
const ValeTransporte = (salario) => {
    const VALE_TRANSPORTE = 0.03;
    var ValeTransporteSalario = salario * VALE_TRANSPORTE;
    return parseFloat(ValeTransporteSalario.toFixed(2))
}

//Trabalha De Noite 
const trabalhoNoturno = (salario) => {
    const TRABALHA_NOITE = 0.05;
    var trabalhoNoturnoSalario = salario * TRABALHA_NOITE
    return parseFloat(trabalhoNoturnoSalario.toFixed(2))
}

//Calcular Salário
const calculaSalario = (salBase, inssSalario, bonusFilhoSalario, ValeTransporteSalario, trabalhoNoturnoSalario) => {
    var salarioFinal = salBase - inssSalario + bonusFilhoSalario - ValeTransporteSalario + trabalhoNoturnoSalario;
    return parseFloat(salarioFinal.toFixed(2))
}

//Imposto De Renda 
const impostoRenda = (salarioFinal) => {
    if (salarioFinal <= 1500) {
        return "Não Paga Imposto";
    }
    else {
        if (1500 < salarioFinal && salarioFinal <= 2500) {
            const IMPOSTO_RENDA = 0.08;
            var imposto = salarioFinal * IMPOSTO_RENDA;
            return (`Seu imposto de renda é de 8%, logo, Você pagará ${parseFloat(imposto.toFixed(2))} do seu salário.`)
        }
        else {
            if (2500 < salarioFinal && salarioFinal <= 4200) {
                const IMPOSTO_RENDA = 0.15;
                var imposto = salarioFinal * IMPOSTO_RENDA;
                return (`Seu imposto de renda é de 15%, logo, Você pagará ${parseFloat(imposto.toFixed(2))} do seu salário.`)
            }
            else {
                if (salarioFinal > 4200) {
                    const IMPOSTO_RENDA = 0.27;
                    var imposto = salarioFinal * IMPOSTO_RENDA;
                    return (`Seu imposto de renda é de 27%, logo, Você pagará ${parseFloat(imposto.toFixed(2))} do seu salário.`)
                }
            }
        }
    }
}

export { salarioBase, inss, bonusFilho, ValeTransporte, trabalhoNoturno, calculaSalario, impostoRenda };
// module.exports = {salarioBase, inss, bonusFilho, ValeTransporte, trabalhoNoturno, calculaSalario, impostoRenda};
