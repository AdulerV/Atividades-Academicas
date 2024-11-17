#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

/* Fa�a um programa que contenha um vetor de inteiros com tamanho escolhido pelo
usu�rio. Coloque em cada uma das posi��es do vetor valores que v�o de 1 at� o valor do
tamanho escolhido pelo usu�rio. Depois exiba cada um dos valores usando ponteiros. */

void preencherVetor(int *inteiros, int tamanho);

int main()
{
    setlocale(LC_ALL, "");
    int *inteiros, tamanho;

    printf("Insira o tamanho do vetor de inteiros: ");
    scanf("%d", &tamanho);

    inteiros = (int*) malloc(sizeof(int) * tamanho);

    if(inteiros == NULL)
    {
        printf("Mem�ria inexistente!\n");
        return 1;
    }

    preencherVetor(inteiros, tamanho);

    for(int i = 0; i < tamanho; i++)
    {
        printf("%d. valor: %d\n", i + 1, *(inteiros + i));
    }

    free(inteiros);
    return 0;
}

void preencherVetor(int *inteiros, int tamanho)
{
    for(int i = 0; i < tamanho; i++)
    {
        *(inteiros + i) = i + 1;
    }
}


