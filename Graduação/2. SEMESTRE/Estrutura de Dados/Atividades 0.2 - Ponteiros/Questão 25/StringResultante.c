#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

#define NUM_CARACTERES 20

// Escreva uma função capaz de concatenar 2 strings. A função deve retornar uma string resultante da concatenação.

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

    printf("String resultante: %s.\n", concatenarStrings(string1, string2));

    free(string1);
    free(string2);
    return 0;
}

char* concatenarStrings(char* string1, char* string2)
{
    char* resultante = (char*) malloc(sizeof(char) * (strlen(string1) + strlen(string2)));
    int contador = 0;

    for(int i = 0; *(string1 + i) != '\0'; i++)
    {
        *(resultante + contador) = *(string1 + i);
        contador++;
    }

    for(int i = 0; *(string2 + i) != '\0'; i++)
    {
        *(resultante + contador) = *(string2 + i);
        contador++;
    }

    *(resultante + contador) = '\0';
    return resultante;
}

