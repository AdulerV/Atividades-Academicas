#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MES 30

/*Codificar fun��es respons�veis pelos seguintes c�lculos:
a) A temperatura m�nima no m�s.
b) A temperatura m�xima no m�s.
c) A temperatura m�dia do m�s.
d) Quantidade de dias com temperatura igual � m�nima do m�s.
e) Quantidade de dias com temperatura igual � m�xima do m�s.
f) Quantidade de dias com temperatura acima da m�dia do m�s.
g) Quantidade de dias com temperatura abaixo da m�dia do m�s.
Observa��o: considere o m�s com 30 dias.*/

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
        printf("Insira a temperatura do %d� dia: ", i + 1);
        scanf("%d", &temperaturas[i]);
    }

    Estatistica estatisticas = calcularEstatisticasTemperatura(temperaturas);
    Dias dias = calcularDiasTemperatura(temperaturas, estatisticas);

    printf("Temperatura M�xima: %d | Temperatura M�nima: %d | Temperatura M�dia: %d\n", estatisticas.maxima, estatisticas.minima, estatisticas.media);
    printf("Quantidade de dias com m�xima: %d | Quantidade de dias com m�nima: %d\n", dias.maxima, dias.minima);
    printf("Quantidade de dias acima da m�dia: %d | Quantidade de dias abaixo da m�dia: %d\n", dias.acimaMedia, dias.abaixoMedia);
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
