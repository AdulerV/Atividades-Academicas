#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

#define MAX_CARACTERES 20

/* Codificar uma função de nome tamanhoString que seja capaz de calcular o tamanho de
uma string. Sugestão de protótipo:

int tamanhoString(char *s); */

int tamanhoString(char *string);

int main()
{
    char *string = (char*) malloc(sizeof(char) * MAX_CARACTERES);

    printf("Insira uma string: ");
    gets(string);

    printf("Tamanho da String: %d.\n", tamanhoString(string));

    free(string);
    return 0;
}

int tamanhoString(char *string)
{
    int tamanho = 0;

    while(*(string + tamanho) != '\0')
    {
        tamanho++;
    }
    return tamanho;
}
