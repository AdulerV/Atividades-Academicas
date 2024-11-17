function buscaBinaria(valor, valores) {
    let prim = 0;
    let length = valores.length - 1;
    let achou = false;

    while (prim <= length && !achou) {
        meioLista = Math.ceil((prim + length) / 2);

        if (valores[meioLista] == valor) {
            achou = true;
        }
        else {

            (valor < valores[meioLista]) ? length = meioLista - 1 : prim = meioLista + 1;

        }
    }
    return achou
}


var arr = [8, 9, 13, 5, 4, 3, 2, 7, 1];

console.log(arr);

console.log(buscaBinaria(7, arr))





/*function buscaBinaria(valor, valores) {
    let prim = 0;
    let length = valores.length - 1;
    let achou = false;

    while (prim <= length && !achou) {
        meioLista = Math.ceil((prim + length) / 2);

        if (valores[meioLista] == valor) {
            achou = true;
        }
        else {
            if (valor < valores[meioLista]) {
                length = meioLista - 1;
            }
            else {
                prim = meioLista + 1;
            }
        }
    }
    return achou
}


var arr = [8, 9, 13, 5, 4, 3, 2, 7, 1];

console.log(arr);

console.log(buscaBinaria(7, arr))*/
