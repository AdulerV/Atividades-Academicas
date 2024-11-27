#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

#define NUM_CARACTERES 255

/* Codificar um programa que seja capaz de criar uma sigla para cada nome fornecido.
A sigla deve ser composta da letra inicial de cada parte do nome. Veja exemplos
abaixo:
    Jose da Silva => JdS
    José Pedro Nogueira => JPN
    Minas Gerais => MG
    Goiás => G */

char* criarSiglaNome(char *nome, char* sigla);

int main()
{
    char *nome = (char*) (malloc(sizeof(char) * NUM_CARACTERES));
    char* sigla = (char*) (malloc(sizeof(char) * NUM_CARACTERES));

    printf("Insira o nome: ");
    gets(nome);

    printf("%s => %s.\n", nome, criarSiglaNome(nome, sigla));

    free(nome);
    free(sigla);
    return 0;
}

char* criarSiglaNome(char *nome, char* sigla)
{
    int contador = 0;
    *(sigla + contador) = *(nome);

    for(int i = 0; *(nome + i) != '\0'; i++)
    {
        if(*(nome + i) == ' ')
        {
            contador++;
            *(sigla + contador) = *(nome + i + 1);
        }
    }
    *(sigla + ++contador) = '\0';
    return sigla;
}


