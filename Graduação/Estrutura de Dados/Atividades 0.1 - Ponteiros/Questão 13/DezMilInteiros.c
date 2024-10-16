#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX 10000

/* Fa�a um programa que tenha como �nico objetivo alocar dinamicamente espa�o na
mem�ria para 10.000 n�meros inteiros. O programa dever� informar se aloca��o foi
realizada como sucesso ou n�o. Caso a aloca��o de mem�ria tenha sido bem sucedida o
programa dever� informar tamb�m o primeiro e �ltimo endere�os alocados. */

int main()
{
    setlocale(LC_ALL, "");
    int *inteiros = (int*) malloc(sizeof(int) * MAX);

    if(inteiros == NULL)
    {
        printf("Mem�ria insuficiente!");
        return 1;
    }

    printf("Primeiro Endere�o alocado: %d\n", inteiros);
    printf("�ltimo Endere�o alocado: %d\n", inteiros + MAX - 1);

    free(inteiros);
    return 0;
}


