#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Codificar uma função capaz de verificar se um determinado número é primo.*/

main () {
    setlocale(LC_ALL, "");

    int numero;

    printf("Insira um número inteiro: ");
    scanf("%d", &numero);

    int resultado = verificaNumPrimo(numero);

    if(resultado == 2) {
        printf("O número %d é primo.\n", numero);
    } else {
        printf("O número %d não é primo.\n", numero);
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
