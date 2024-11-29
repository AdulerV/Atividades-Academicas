#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

#define NUM_ELEMENTOS 20

/* Fa¸ca um programa que tenha uma fun¸c˜ao que retorna void e que preenche um vetor com 20 n´umeros inteiros; outra
fun¸c˜ao que tamb´em retorna void e que dobra os valores armazenados neste vetor; e uma ´ultima fun¸c˜ao que imprime este
vetor. A fun¸c˜ao main deve alocar mem´oria para este vetor, chamar a fun¸c˜ao que preenche o vetor, chamar a fun¸c˜ao que
imprime o vetor, chamar a fun¸c˜ao que dobra os elementos do vetor, chamar novamente a fun¸c˜ao que imprime o vetor,
liberar a mem´oria alocada. N˜ao use colchetes para indexar o vetor */

int main()
{
    setlocale(LC_ALL, "");
    srand(time(NULL));

    int *vetor = (int*) malloc(sizeof(int) * NUM_ELEMENTOS);

    preencherVetor(vetor);
    imprimirVetor(vetor);

    dobrarValoresVetor(vetor);
    imprimirVetor(vetor);

    free(vetor);
    return 0;
}

void preencherVetor(int *vetor)
{
    for(int i = 0; i < NUM_ELEMENTOS; i++)
    {
        *(vetor + i) = rand() % NUM_ELEMENTOS;
    }
}

void dobrarValoresVetor(int *vetor)
{
    for(int i = 0; i < NUM_ELEMENTOS; i++)
    {
        *(vetor + i) *= 2;
    }
}

void imprimirVetor(int *vetor)
{
    for(int i = 0; i < NUM_ELEMENTOS; i++)
    {
        printf("vetor[%d] = %d.\n", i, *(vetor + i));
    }
    printf("\n");
}
