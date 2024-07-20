#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Codificar uma fun��o para calcular a quantidade de divisores de um n�mero inteiro.*/

int calculaDivisores(int numero);

main ()
{
    setlocale(LC_ALL, "");
    int numero;

    printf("Insira um n�mero inteiro: ");
    scanf("%d", &numero);

    int resultado = calculaDivisores(numero);
    printf("O n�mero %d possui %d divisores.\n", numero, resultado);
}

int calculaDivisores(int numero)
{
    int contador = 1, divisores = 0;

    while(contador <= numero)
    {
        if(numero % contador == 0)
        {
            divisores++;
        }
        contador++;
    }
    return divisores;
}
