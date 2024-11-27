#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/* Faça um programa em C para calcular o fatorial de n. Qual a complexidade de tempo?
Conte as instruções que são função de n e compare os resultados. */

int main()
{
    setlocale(LC_ALL, "");

    int *numero = (int*) malloc(sizeof(int));
    lerNumero(numero);

    printf("Fatorial de %d: %d.\n", *numero, calcularFatorial(numero));
    printf("Quantidade de passos realizados: %d.\n", contarPassosFatorial(numero));

    free(numero);
    return 0;
}

void lerNumero(int *numero)
{
    printf("Insira o número desejado: ");
    scanf("%d", numero);
}

int calcularFatorial(int *numero)
{
    int fatorial = 1; // 1

    for(int contador = 1; contador <= *numero; contador++) // n + 1
    {
        fatorial *= contador;
    }
    return fatorial; // O(n)
}

int contarPassosFatorial(int *numero)
{
    int fatorial = 1, contador = 0; // 1

    for(int i = 1; i <= *numero; i++) // n + 1
    {
        fatorial *= i;
        contador++;
    }
    return contador; // O(n)
}
