#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Codificar uma função para calcular a quantidade de divisores de um número inteiro.*/

int calculaDivisores(int numero);

main ()
{
    setlocale(LC_ALL, "");
    int numero;

    printf("Insira um número inteiro: ");
    scanf("%d", &numero);

    int resultado = calculaDivisores(numero);
    printf("O número %d possui %d divisores.\n", numero, resultado);
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
