#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

//Codificar uma função para imprimir a tabuada de multiplicação de um número entre 1 e 10.

void imprimeFaixaValores(int numInicial, int numFinal);

main () {
    setlocale(LC_ALL, "");
    int numero;

    printf("Insira um número entre 1 e 10: ");
    scanf("%d", &numero);

    if(numero >= 1 && numero <= 10) {
        imprimeTabuada(numero);
    } else {
        printf("Insira um número válido!\n");
    }
}

void imprimeTabuada(int numero) {
    int contador = 1;
    while(contador <= 10) {
        printf("%d x %d = %d\n", numero, contador, numero * contador);
        contador++;
    }
}
