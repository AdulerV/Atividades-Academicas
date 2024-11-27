#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX 255

/* Codificar a função char *acheSobrenome(char *nome) que recebe como parâmetro um
nome e retorne um ponteiro para o primeiro caractere do primeiro sobrenome. Codifique
também a função main() capaz de imprimir somente o sobrenome de um determinado
nome completo. */

char *acheSobrenome(char *nome);

int main()
{
    setlocale(LC_ALL, "");
    char *nome = (char*) malloc(sizeof(char) * MAX);

    if(nome == NULL)
    {
        printf("Memória inexistente!\n");
        return 1;
    }

    printf("Insira o nome completo: ");
    gets(nome);

    nome = acheSobrenome(nome);

    if(nome != NULL)
    {
        printf("Sobrenome do nome inserido: %s\n", nome);
        return 0;
    }

    printf("O nome inserido não está completo.\n");
    free(nome);
    return 1;
}

char *acheSobrenome(char *nome)
{
    for(int i = 0; *(nome + i) != '\0'; i++)
    {
        if(*(nome + i) == ' ')
        {
            return (nome + (i + 1));
        }
    }
    return NULL;
}

