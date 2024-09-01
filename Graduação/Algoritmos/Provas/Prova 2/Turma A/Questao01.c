#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX 10

//Codificar uma fun��o que seja capaz de verificar se os elementos em uma determinada rela��o de valores inteiros est�o armazenados em ordem crescente.

int verificarOrdemCrescente(int inteiros[MAX]);

main()
{
    setlocale(LC_ALL, "");
    int inteiros[MAX] = {1, 1, 5, 6, 9, 12, 12, 24, 26, 30};

    int resultado = verificarOrdemCrescente(inteiros);

    if(resultado)
    {
        printf("O vetor est� em ordem crescente.");
    }
    else
    {
        printf("O vetor n�o est� em ordem crescente.");
    }
}

int verificarOrdemCrescente(int inteiros[MAX])
{
    for(int i = 0; i < MAX - 1; i++)
    {
        if(inteiros[i] > inteiros[i + 1])
        {
            return 0;
        }
    }
    return 1;
}
