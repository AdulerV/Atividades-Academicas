function funcaoCalcular(numberOne, numberTwo, numberThree, numberFour, numberFive) {
    let numeroUm = numberOne.value;
    let numeroDois = numberTwo.value;
    let numeroTres = numberThree.value;
    let numeroQuatro = numberFour.value;
    let numeroCinco = numberFive.value;
    let ResultadoMaior = document.getElementById('ResultadoMaior');
    let ResultadoMenor = document.getElementById('ResultadoMenor');

    ResultadoMaior.innerHTML = Math.max(numeroUm, numeroDois, numeroTres, numeroQuatro, numeroCinco)
    ResultadoMenor.innerHTML = Math.min(numeroUm, numeroDois, numeroTres, numeroQuatro, numeroCinco)
}