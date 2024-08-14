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

typedef struct
{
    int maxima;
    int minima;
    int media;
} Estatistica;

typedef struct
{
    int maxima;
    int minima;
    int acimaMedia;
    int abaixoMedia;
} Dias;

Estatistica calcularEstatisticasTemperatura(int temperaturas[MES]);
Dias calcularDiasTemperatura(int temperaturas[MES], Estatistica estatistica);

int main()
{
    setlocale(LC_ALL, "");

    int temperaturas[MES];

    for(int i = 0; i < MES; i++)
    {
        printf("Insira a temperatura do %dº dia: ", i + 1);
        scanf("%d", &temperaturas[i]);
    }

    Estatistica estatisticas = calcularEstatisticasTemperatura(temperaturas);
    Dias dias = calcularDiasTemperatura(temperaturas, estatisticas);

    printf("Temperatura Máxima: %d | Temperatura Mínima: %d | Temperatura Média: %d\n", estatisticas.maxima, estatisticas.minima, estatisticas.media);
    printf("Quantidade de dias com máxima: %d | Quantidade de dias com mínima: %d\n", dias.maxima, dias.minima);
    printf("Quantidade de dias acima da média: %d | Quantidade de dias abaixo da média: %d\n", dias.acimaMedia, dias.abaixoMedia);
    return 0;
}

Estatistica calcularEstatisticasTemperatura(int temperaturas[MES])
{
    Estatistica estatistica = {temperaturas[0], temperaturas[0], 0};

    for(int i = 0; i < MES; i++)
    {
        if(temperaturas[i] > estatistica.maxima)
        {
            estatistica.maxima = temperaturas[i];
        }
        if(temperaturas[i] < estatistica.minima)
        {
            estatistica.minima = temperaturas[i];
        }
        estatistica.media += temperaturas[i];
    }
    estatistica.media /= MES;

    return estatistica;
}

Dias calcularDiasTemperatura(int temperaturas[MES], Estatistica estatistica)
{
    Dias dias = {0, 0, 0, 0};

    for(int i = 0; i < MES; i++)
    {
        if(temperaturas[i] == estatistica.maxima)
        {
            dias.maxima++;
        }
        else if(temperaturas[i] == estatistica.minima)
        {
            dias.minima++;
        }

        if(temperaturas[i] > estatistica.media)
        {
            dias.acimaMedia++;
        }
        else if(temperaturas[i] < estatistica.media)
        {
            dias.abaixoMedia++;
        }
    }
    return dias;
}
