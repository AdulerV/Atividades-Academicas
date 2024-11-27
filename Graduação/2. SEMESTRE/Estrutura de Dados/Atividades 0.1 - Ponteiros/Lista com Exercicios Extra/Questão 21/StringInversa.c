#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

#define NUM_CARACTERES 30

// Fa�a uma fun��o para imprimir uma string de tr�s para frente.

void imprimirInversoString(char *string);

int main() {
    setlocale(LC_ALL, "");

    char *string = (char*) malloc(sizeof(char) * NUM_CARACTERES);

    printf("Insira uma string: ");
    gets(string);

    imprimirInversoString(string);

    free(string);
    return 0;
}

void imprimirInversoString(char *string) {
    for(int i = strlen(string); i >= 0; i--) {
        printf("%c", *(string + i));
    }
}



