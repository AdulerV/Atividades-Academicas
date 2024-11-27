#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX 20

/* Codificar uma função de nome 'tamanhoString' que seja capaz de calcular o tamanho de uma
string. Use aritmética de ponteiros para percorrer a string. Sugestão de protótipo:

int tamanhoString(char *s);

Codificar também a função main para que seja possível testar o funcionamento da função
tamanhoString. */

int tamanhoString(char *string);

int main()
{
    setlocale(LC_ALL, "");
    char *string = (char*) malloc(sizeof(char) * MAX);

    printf("Insira uma string: ");
    gets(string);

    printf("Tamanho da string: %d\n", tamanhoString(string));
    free(string);
    return 0;
}

int tamanhoString(char *string) {
    int contador = 0;

    while(*(string + contador) != '\0') {
        contador++;
    }
    return contador;
}

