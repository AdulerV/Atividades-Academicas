#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

#define NUM_CARACTERES 20

// Codificar uma função capaz de concatenar uma string ao final de outra string.

char* concatenarStrings(char* string1, char* string2);

int main()
{
    setlocale(LC_ALL, "");

    char* string1 = (char*) malloc(sizeof(char) * NUM_CARACTERES);
    char* string2 = (char*) malloc(sizeof(char) * NUM_CARACTERES);

    printf("Insira o conteúdo da 1. string: ");
    gets(string1);

    printf("Insira o conteúdo da 2. string: ");
    gets(string2);

    string1 = concatenarStrings(string1, string2);
    printf("String concatenada: %s.\n", string1);

    free(string1);
    free(string2);
    return 0;
}

char* concatenarStrings(char* string1, char* string2)
{
    int contador = strlen(string1);

    for(int i = 0; *(string2 + i) != '\0'; i++)
    {
        *(string1 + contador) = *(string2 + i);
        contador++;
    }

    *(string1 + contador) = '\0';
    return string1;
}
