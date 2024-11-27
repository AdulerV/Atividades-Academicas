#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

#define MAX 255

/* Codificar uma função que retorne o sobrenome de uma pessoa. Entenda como
sobrenome todos os nomes após o primeiro nome. */

char* encontrarSobrenome(char *nome);

int main()
{
    setlocale(LC_ALL, "");
    char *nome = (char*) malloc(sizeof(char) * MAX);

    printf("Insira o nome completo: ");
    gets(nome);

    char *sobrenome = encontrarSobrenome(nome);

    if(sobrenome == NULL)
    {
        printf("Sobrenome não encontrado.\n");
        return 1;
    }
    printf("Sobrenome encontrado: %s.\n", sobrenome);

    free(nome);
    free(sobrenome);
    return 0;
}

char* encontrarSobrenome(char *nome)
{
    for(int i = 0; *(nome + i) != '\0'; i++)
    {
        if(*(nome + i) == ' ')
        {
            return (nome + i) + 1;
        }
    }
    return NULL;
}





