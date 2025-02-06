#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "");
    int numero1, numero2, resultado;

    printf("Insira o primeiro número: ");
    scanf("%d", &numero1);

    printf("Insira o segundo número: ");
    scanf("%d", &numero2);

    if(dividirNumeros(numero1, numero2, resultado))
    {
        printf("%d / %d = %d.\n", numero1, numero2, dividirNumeros(numero1, numero2, resultado));
    }
    else
    {
        printf("Impossível realizar a operação.\n");
    }
}

int dividirNumeros(int numero1, int numero2, int resultado)
{
    if(resultado == numero1 / numero2)
    {
        return resultado;
    }

    if(numero1 % numero2 == 0)
    {
        return dividirNumeros(numero1, numero2, numero1 / numero2);
    }
    else
    {
        return 0;
    }
}
