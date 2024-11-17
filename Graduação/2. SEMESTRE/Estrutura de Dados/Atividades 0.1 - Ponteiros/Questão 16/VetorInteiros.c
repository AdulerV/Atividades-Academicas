#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

/* Faça um programa que contenha um vetor de inteiros com tamanho escolhido pelo
usuário. Coloque em cada uma das posições do vetor valores que vão de 1 até o valor do
tamanho escolhido pelo usuário. Depois exiba cada um dos valores usando ponteiros. */

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
        printf("Memória inexistente!\n");
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


