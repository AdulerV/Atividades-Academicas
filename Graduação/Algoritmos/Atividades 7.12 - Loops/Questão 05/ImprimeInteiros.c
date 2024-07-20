#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

//Codificar uma função capaz de imprimir na tela um determinado caractere diversas vezes.

void imprimeFaixaValores(int numInicial, int numFinal);

main () {
    int numInicial, numFinal;

    printf("Insira o valor inicial: ");
    scanf("%d", &numInicial);

    printf("Insira o valor final: ");
    scanf("%d", &numFinal);

    imprimeFaixaValores(numInicial, numFinal);
}

void imprimeFaixaValores(int numInicial, int numFinal) {
    while(numInicial <= numFinal) {
        printf("%d\n", numInicial);
        numInicial++;
    }
}
