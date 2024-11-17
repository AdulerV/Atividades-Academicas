function buscaSequencial(valor, valores) {

    let pos = 0; achou = false;

    while (pos < valores.length && !achou) {

        (valores[pos] === valor) ? achou = true : pos++;
    }

    return achou;
}

var array = [8, 9, 13, 5, 4, 3, 2, 7, 1];

console.log(array);

console.log(buscaSequencial(7, array));

/* const buscaSequencial = (valor, valores) => {
    let pos = 0;
    let achou = false;
    while (pos < valores.length && !achou) {
        if (valores[pos] === valor) {
            achou = true;
        }
        else {
            pos = pos + 1;
        }
    }
    return achou;
}
var arr = [8, 9, 13, 5, 4, 3, 2, 7, 1];

console.log(arr);

console.log(buscaSequencial(7, arr)) */
