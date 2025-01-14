#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "");
    int numero;

    printf("Insira um n�mero natural: ");
    scanf("%d", &numero);

    if(validarNumeroNatural(numero))
    {
        imprimirDesenho(numero);
        return 1;
    }
    printf("O n�mero n�o � natural.\n");
    return 0;
}

int validarNumeroNatural(int numero)
{
    if(numero >= 0)
    {
        return 1;
    }
    return 0;
}

void imprimirDesenho(int numero)
{
    for(int i = 0; i < numero - 1; i++)
    {
        for(int j = numero - 1; j > i; j--)
        {
            printf("*");
        }
        for(int k = 0; k <= i; k++)
        {
            printf("#");
        }
        printf("\n");
    }
}




