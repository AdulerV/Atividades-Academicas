#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

//Codificar uma fun��o capaz de verificar se um determinado n�mero inteiro � primo.

main()
{
    setlocale(LC_ALL, "");

    verificarNumeroPrimo(calcularQuantidadeDivisores(10), 10);
    verificarNumeroPrimo(calcularQuantidadeDivisores(7), 7);
    verificarNumeroPrimo(calcularQuantidadeDivisores(3), 3);
}

void verificarNumeroPrimo(int divisores, int numero)
{
    if(divisores == 2)
    {
        printf("O n�mero %d � primo.\n", numero);
    }
    else
    {
        printf("O n�mero %d n�o � primo.\n", numero);
    }
}

int calcularQuantidadeDivisores(int numero)
{
    int divisores = 0;

    for(int i = 1; i <= numero; i++)
    {
        if(numero % i == 0)
        {
            divisores++;
        }
    }
    return divisores;
}
