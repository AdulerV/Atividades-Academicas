#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MES 30

/*Codificar funções responsáveis pelos seguintes cálculos:
a) A temperatura mínima no mês.
b) A temperatura máxima no mês.
c) A temperatura média do mês.
d) Quantidade de dias com temperatura igual à mínima do mês.
e) Quantidade de dias com temperatura igual à máxima do mês.
f) Quantidade de dias com temperatura acima da média do mês.
g) Quantidade de dias com temperatura abaixo da média do mês.
Observação: considere o mês com 30 dias.*/

int main()
{
    setlocale(LC_ALL, "");
    int temperaturas[MES];

    for(int i = 0; i < MES; i++)
    {
        printf("Insira a temperatura do %d° dia: ", i + 1);
        scanf("%d", &temperaturas[i]);
    }

    printf("\nTemperatura Mínima: %d\n", calcularTemperaturaMinima(temperaturas));
    printf("Temperatura Máxima: %d\n", calcularTemperaturaMaxima(temperaturas));
    printf("Temperatura Média: %d\n", calcularTemperaturaMedia(temperaturas));
    printf("Quantidade de dias com mínima: %d\n", calcularDiasComMinima(temperaturas));
    printf("Quantidade de dias com máxima: %d\n", calcularDiasComMaxima(temperaturas));
    printf("Quantidade de dias abaixo da média: %d\n", calcularDiasAbaixoMedia(temperaturas));
    printf("Quantidade de dias acima da média: %d\n", calcularDiasAcimaMedia(temperaturas));
    return 0;
}

int calcularTemperaturaMinima(int temperaturas[MES])
{
    int temperaturaMinima = temperaturas[0];

    for(int i = 0; i < MES; i++)
    {
        if(temperaturas[i] < temperaturaMinima)
        {
            temperaturaMinima = temperaturas[i];
        }
    }
    return temperaturaMinima;
}

int calcularTemperaturaMaxima(int temperaturas[MES])
{
    int temperaturaMaxima = temperaturas[0];

    for(int i = 0; i < MES; i++)
    {
        if(temperaturas[i] > temperaturaMaxima)
        {
            temperaturaMaxima = temperaturas[i];
        }
    }
    return temperaturaMaxima;
}

int calcularTemperaturaMedia(int temperaturas[MES])
{
    int media = 0;

    for(int i = 0; i < MES; i++) {
        media += temperaturas[i];
    }
    return media / MES;
}

int calcularDiasComMinima(int temperaturas[MES])
{
    int temperaturaMinima = calcularTemperaturaMinima(temperaturas);
    int quantidade = 0;

    for(int i = 0; i < MES; i++)
    {
        if(temperaturas[i] == temperaturaMinima)
        {
            quantidade++;
        }
    }
    return quantidade;
}

int calcularDiasComMaxima(int temperaturas[MES])
{
    int temperaturaMaxima = calcularTemperaturaMaxima(temperaturas);
    int quantidade = 0;

    for(int i = 0; i < MES; i++)
    {
        if(temperaturas[i] == temperaturaMaxima)
        {
            quantidade++;
        }
    }
    return quantidade;
}

int calcularDiasAbaixoMedia(int temperaturas[MES])
{
    int temperaturaMedia = calcularTemperaturaMedia(temperaturas);
    int quantidade = 0;

    for(int i = 0; i < MES; i++)
    {
        if(temperaturas[i] < temperaturaMedia)
        {
            quantidade++;
        }
    }
    return quantidade;
}

int calcularDiasAcimaMedia(int temperaturas[MES])
{
    int temperaturaMedia = calcularTemperaturaMedia(temperaturas);
    int quantidade = 0;

    for(int i = 0; i < MES; i++)
    {
        if(temperaturas[i] > temperaturaMedia)
        {
            quantidade++;
        }
    }
    return quantidade;
}
