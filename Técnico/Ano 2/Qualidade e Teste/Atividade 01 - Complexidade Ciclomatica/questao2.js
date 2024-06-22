
function bubbleSort(valor1, valor2) {
    let ordemCrescente = valor1 - valor2;

    return ordemCrescente;
}

var arr = [8, 9, 13, 5, 4, 3, 2, 7, 1];

console.log(arr);

arr.sort(bubbleSort);

console.log(arr);


/*
function bubbleSort(a, b) {
    
    return a - b;
}

var array = [8, 9, 13, 5, 4, 3, 2, 7, 1];

console.log(array);

array.sort(bubbleSort);

console.log(array);




function bubbleSort(valores) {
    let length = valores.length;
    let tmp;

    for (var i = 0; i < length; i++) {
        for (let j = 0; j < (length - i - 1); j++) {
            if (valores[j] > valores[j + 1]) {
                tmp = valores[j];
                valores[j] = valores[j + 1];
                valores[j + 1] = tmp;
            }
        }
    }
}

var arr = [8, 9, 13, 5, 4, 3, 2, 7, 1];

console.log(arr);

bubbleSort(arr);

console.log(arr);
*/

