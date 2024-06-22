function maximoDivisorComum(valor1, valor2) {
    const valorA = Math.abs(valor1);
    const valorB = Math.abs(valor2);
    let restoDivisão = valorA % valorB;

    return (valorB === 0) ? valorA : maximoDivisorComum(valorB, restoDivisão)
}

console.log(maximoDivisorComum(252, 105))