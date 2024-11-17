#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Considere a seguinte declaração:
int vet[5][5] = {1,2,2,2,2,3,1,2,2,2,3,3,1,2,2,3,3,3,1,2,3,3,3,3,1}
Codificar as seguintes funções:
a) Calcule a soma dos elementos da diagonal principal
b) Calcule a soma dos elementos localizados acima da diagonal principal
c) Calcule a soma dos elementos localizados abaixo da diagonal principal*/

main()
{
    int vet[5][5] = {1,2,2,2,2,3,1,2,2,2,3,3,1,2,2,3,3,3,1,2,3,3,3,3,1};

    printf("Soma dos elementos da diagonal principal: %d\n", calcularSomaDiagonal(vet));
    printf("Soma dos elementos localizados acima da diagonal: %d\n", calcularSomaAcimaDiagonal(vet));
    printf("Soma dos elementos localizados abaixo da diagonal: %d\n", calcularSomaAbaixoDiagonal(vet));
}

int calcularSomaDiagonal(int vet[5][5])
{
    int soma = 0;

    for(int i = 0; i < 5; i++)
    {
        for(int j = 0; j < 5; j++)
        {
            if(i == j)
            {
                soma += vet[i][j];
            }
        }
    }
    return soma;
}

int calcularSomaAcimaDiagonal(int vet[5][5])
{
    int soma = 0;

    for(int i = 0; i < 4; i++)
    {
        for(int j = i + 1; j < 5; j++)
        {
            soma += vet[i][j];
        }
    }
    return soma;
}

int calcularSomaAbaixoDiagonal(int vet[5][5])
{
    int soma = 0;

    for(int i = 0; i < 4; i++)
    {
        for(int j = i + 1; j < 5; j++)
        {
            soma += vet[j][i];
        }
    }
    return soma;
}
