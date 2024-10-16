#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

#define MAX 20

/* Escreva uma função strConcat que recebe como parâmetro 2 strings: s1 e s2. A função deve
retornar uma string resultante da concatenação de s1 e s2. Cuidado: a string resultante deve
ser de tamanho suficiente para armazenar s1 e s2. */

char* strConcat(char s1[MAX], char s2[MAX]);


int main()
{
    setlocale(LC_ALL, "");
    char s1[MAX], s2[MAX];

    printf("Insira o conteúdo da primeira string: ");
    gets(s1);

    printf("Insira o conteúdo da segunda string: ");
    gets(s2);

    char *resultado = strConcat(s1, s2);
    printf("String resultante: %s.\n", resultado);

    free(resultado);
    return 0;
}

char* strConcat(char s1[MAX], char s2[MAX])
{
    int tamanho = strlen(s1) + strlen(s2) + 1;
    char* string = (char*) malloc(sizeof(char) * tamanho);

    for(int i = 0; i < strlen(s1); i++)
    {
        *(string + i) = s1[i];
    }

    for(int i = strlen(s1); i <= tamanho; i++)
    {
        *(string + i) = s2[i - strlen(s1)];
    }
    return string;
}


