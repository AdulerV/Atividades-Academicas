#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Codificar uma fun��o capaz de verificar se um determinado n�mero � primo.*/

main () {
    setlocale(LC_ALL, "");

    int numero;

    printf("Insira um n�mero inteiro: ");
    scanf("%d", &numero);

    int resultado = verificaNumPrimo(numero);

    if(resultado == 2) {
        printf("O n�mero %d � primo.\n", numero);
    } else {
        printf("O n�mero %d n�o � primo.\n", numero);
    }
}

int verificaNumPrimo(int numero) {
    int contador = 1, divisores = 0;
    while(contador <= numero) {
        if(numero % contador == 0) {
            divisores++;
        }
        contador++;
    }
    return divisores;
}
