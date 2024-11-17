#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

#define NUM_CARACTERES 30

// Faça uma função para determinar a quantidade de vogais presentes em um nome.

int calcularQuantidadeVogais(char *nome);

int main()
{
    setlocale(LC_ALL, "");

    char *nome = (char*) malloc(sizeof(char) * NUM_CARACTERES);

    printf("Insira uma string: ");
    gets(nome);

    printf("Quantidade de vogais presentes no nome: %d", calcularQuantidadeVogais(nome));

    free(nome);
    return 0;
}

int calcularQuantidadeVogais(char *nome)
{
    int quantidade = 0;

    for(int i = 0; *(nome + i) != '\0'; i++)
    {
        switch(*(nome + i))
        {
        case 'a':
            quantidade++;
            break;
        case 'e':
            quantidade++;
            break;
        case 'i':
            quantidade++;
            break;
        case 'o':
            quantidade++;
            break;
        case 'u':
            quantidade++;
            break;
        default:
            break;
        }
    }
    return quantidade;
}
