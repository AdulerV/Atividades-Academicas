#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

#define MAX 50

/*Codificar uma fun��o capaz de imprimir uma frase de tr�s para frente. Veja o exemplo abaixo:
    Entrada: Bom dia
    Sa�da: aid moB*/

void imprimirFraseInvertida(char frase[MAX]);

main() {
    char frase[MAX];

    printf("Insira uma frase: ");
    gets(frase);

    imprimirFraseInvertida(frase);
}

void imprimirFraseInvertida(char frase[MAX]) {
    int ultimaPosicao = strlen(frase) - 1;

    for(int i = ultimaPosicao; i >= 0; i--) {
        printf("%c", frase[i]);
    }
}


