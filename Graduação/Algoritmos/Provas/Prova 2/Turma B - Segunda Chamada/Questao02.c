#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

//Codificar uma função capaz de verificar se um determinado número inteiro é primo.

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
        printf("O número %d é primo.\n", numero);
    }
    else
    {
        printf("O número %d não é primo.\n", numero);
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
