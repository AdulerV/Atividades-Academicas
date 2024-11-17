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

int main()
{
    setlocale(LC_ALL, "");
    int temperaturas[MES];

    for(int i = 0; i < MES; i++)
    {
        printf("Insira a temperatura do %d� dia: ", i + 1);
        scanf("%d", &temperaturas[i]);
    }

    printf("\nTemperatura M�nima: %d\n", calcularTemperaturaMinima(temperaturas));
    printf("Temperatura M�xima: %d\n", calcularTemperaturaMaxima(temperaturas));
    printf("Temperatura M�dia: %d\n", calcularTemperaturaMedia(temperaturas));
    printf("Quantidade de dias com m�nima: %d\n", calcularDiasComMinima(temperaturas));
    printf("Quantidade de dias com m�xima: %d\n", calcularDiasComMaxima(temperaturas));
    printf("Quantidade de dias abaixo da m�dia: %d\n", calcularDiasAbaixoMedia(temperaturas));
    printf("Quantidade de dias acima da m�dia: %d\n", calcularDiasAcimaMedia(temperaturas));
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
