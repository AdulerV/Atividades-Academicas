#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

//Codificar uma função capaz de imprimir na tela um determinado caractere diversas vezes.

void imprimeCaractere(char caractere, int quantidade);

main () {
    char caractere;
    int quantidade;

    printf("Insira o caractere: ");
    caractere = getche();

    printf("\nInsira a quantidade de vezes: ");
    scanf("%d", &quantidade);

    imprimeCaractere(caractere, quantidade);
}

void imprimeCaractere(char caractere, int quantidade) {
    int contador = 1;

    while(contador <= quantidade) {
        printf("%d. %c\n", contador, caractere);
        contador++;
    }
}
