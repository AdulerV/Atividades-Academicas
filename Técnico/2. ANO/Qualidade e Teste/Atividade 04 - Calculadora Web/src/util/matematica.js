const somar = (a, b) => {
    return a + b;
}

const mdc = (num1, num2) => {

    let resto;
    let numero1 = Math.abs(num1);
    let numero2 = Math.abs(num2);

    do {
        resto = numero1 % numero2;
        numero1 = numero2;
        numero2 = resto;
    } while (resto != 0);

    return numero1;

    //É extraído os módulos dos números, devido a inserção de números negativos
}

const potencia = (num1, num2) => {

    let soma = 1;

    if (num2 == 0) {
        return 1
    }

    for (let i = 0; i < num2; i++) {
        soma *= num1;
    }
    return soma;

    //Esta função não é útil para cálculos com expoentes negativos (num2 < 0)
}

const raiz = (numero) => {

    if (numero == 0) {
        return 0;
    } else {

        let divisorRaiz = 1, calcDiv = 0;

        for (var i = 0; i <= numero; i++) {
            calcDiv = numero / divisorRaiz;
            divisorRaiz = (calcDiv + divisorRaiz) / 2;
        }
        return divisorRaiz;
    }
    //OBS: Na matemática não é possível extrair raizes quadradas para numeros negativos
}

export { somar, mdc, potencia, raiz };
//module.exports = { somar, mdc, potencia, raiz };