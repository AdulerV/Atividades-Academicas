#include <stdlib.h>
#include <stdio.h>
#include <locale.h>
#include <time.h>

#define TAMANHO 10

/* Respostas:

3. Qual a complexidade do algoritmo de ordenação?
R: A complexidade do algoritmo é dada por O(n^2).*/

int main()
{
    srand(time(NULL));
    int *vetor = (int*) malloc(sizeof(int) * TAMANHO);

    preencherVetores(vetor);
    imprimirVetor(vetor);

    int resultado = ordenarBubbleSort(vetor);
    imprimirVetor(vetor);
    printf("\nContador: %d", resultado);

    free(vetor);
    return 0;
}

void imprimirVetor(int *vetor)
{
    for(int i = 0; i < TAMANHO; i++)
    {
        printf("vetor[%d] = %d.\n", i, *(vetor + i));
    }
    printf("\n");
}

void preencherVetores(int *vetor)
{
    for(int i = 0; i < TAMANHO; i++)
    {
        *(vetor + i) = rand() % TAMANHO;
    }
}

int ordenarBubbleSort(int *vetor)
{
    int auxiliar, contador = 0;

    for(int i = 0; i < TAMANHO; i++)
    {
        for(int j = 0; j < TAMANHO - 1 - i; j++)
        {
            contador++;
            if(vetor[j] > vetor[j + 1])
            {
                auxiliar = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = auxiliar;
            }
        }
    }
    return contador;
}












