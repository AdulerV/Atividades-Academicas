#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX 10000

/* Faça um programa que tenha como único objetivo alocar dinamicamente espaço na
memória para 10.000 números inteiros. O programa deverá informar se alocação foi
realizada como sucesso ou não. Caso a alocação de memória tenha sido bem sucedida o
programa deverá informar também o primeiro e último endereços alocados. */

int main()
{
    setlocale(LC_ALL, "");
    int *inteiros = (int*) malloc(sizeof(int) * MAX);

    if(inteiros == NULL)
    {
        printf("Memória insuficiente!");
        return 1;
    }

    printf("Primeiro Endereço alocado: %d\n", inteiros);
    printf("Último Endereço alocado: %d\n", inteiros + MAX - 1);

    free(inteiros);
    return 0;
}


