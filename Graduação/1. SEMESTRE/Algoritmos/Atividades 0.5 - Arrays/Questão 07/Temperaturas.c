#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

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
} Temperatura;

typedef struct
{
    int maxima;
    int minima;
    int acimaMedia;
    int abaixoMedia;
} Dias;

Temperatura calcularEstatisticasTemperatura(int quantidadeDias, int temperaturas[quantidadeDias])
Dias calcularDiasTemperatura(int quantidadeDias, int temperaturas[quantidadeDias], Temperatura temperatura)

int main()
{
    setlocale(LC_ALL, "");
    int quantidadeDias;

    printf("Insira a quantidade de dias que deseja informar: ");
    scanf("%d", &quantidadeDias);

    if (quantidadeDias <= 0)
    {
        printf("Quantidade de dias deve ser maior que zero.\n");
        return 1;
    }

    int temperaturas[quantidadeDias];

    for(int i = 0; i < quantidadeDias; i++)
    {
        printf("Insira a temperatura do %d� dia: ", i + 1);
        scanf("%d", &temperaturas[i]);
    }

    Temperatura estatisticasTemp = calcularEstatisticasTemperatura(quantidadeDias, temperaturas);
    Dias diasTemp = calcularDiasTemperatura(quantidadeDias, temperaturas, estatisticasTemp);

    printf("Temperatura M�xima: %d | Temperatura M�nima: %d | Temperatura M�dia: %d\n", estatisticasTemp.maxima, estatisticasTemp.minima, estatisticasTemp.media);
    printf("Quantidade de dias com m�xima: %d | Quantidade de dias com m�nima: %d\n", diasTemp.maxima, diasTemp.minima);
    printf("Quantidade de dias acima da m�dia: %d | Quantidade de dias abaixo da m�dia: %d\n", diasTemp.acimaMedia, diasTemp.abaixoMedia);
    return 0;
}

Temperatura calcularEstatisticasTemperatura(int quantidadeDias, int temperaturas[quantidadeDias])
{
    Temperatura temperatura = {temperaturas[0], temperaturas[0], 0};

    for(int i = 0; i < quantidadeDias; i++)
    {
        if(temperaturas[i] > temperatura.maxima)
        {
            temperatura.maxima = temperaturas[i];
        }
        if(temperaturas[i] < temperatura.minima)
        {
            temperatura.minima = temperaturas[i];
        }
        temperatura.media += temperaturas[i];
    }
    temperatura.media /= quantidadeDias;

    return temperatura;
}

Dias calcularDiasTemperatura(int quantidadeDias, int temperaturas[quantidadeDias], Temperatura temperatura)
{
    Dias dias = {0, 0, 0, 0};

    for(int i = 0; i < quantidadeDias; i++)
    {
        if(temperaturas[i] == temperatura.maxima)
        {
            dias.maxima++;
        }
        else if(temperaturas[i] == temperatura.minima)
        {
            dias.minima++;
        }

        if(temperaturas[i] > temperatura.media)
        {
            dias.acimaMedia++;
        }
        else if(temperaturas[i] < temperatura.media)
        {
            dias.abaixoMedia++;
        }
    }
    return dias;
}

