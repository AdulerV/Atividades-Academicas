#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX 30

/* Codificar um programa para armazenar as temperaturas di�rias de um determinado
m�s (considere o m�s com 30 dias) e produzir o seguinte relat�rio:
a. A temperatura m�nima no m�s.
b. A temperatura m�xima no m�s.
c. A temperatura m�dia do m�s. */

int calcularTemperaturaMinima(int *temperatura);
int calcularTemperaturaMaxima(int *temperatura);
float calcularTemperaturaMedia(int *temperatura);

int main()
{
    setlocale(LC_ALL, "");
    int *temperatura = (int*) malloc(sizeof(int) * MAX);

    for(int i = 0; i < MAX; i++)
    {
        printf("Insira o temperatura do %d. dia: ", i + 1);
        scanf("%d", temperatura + i);
    }

    printf("Temperatura M�nima: %d.\n", calcularTemperaturaMinima(temperatura));
    printf("Temperatura M�xima: %d.\n", calcularTemperaturaMaxima(temperatura));
    printf("Temperatura M�dia: %.2f.\n", calcularTemperaturaMedia(temperatura));
    return 0;
}

int calcularTemperaturaMinima(int *temperatura)
{
    int minima = *temperatura;

    for(int i = 0; i < MAX; i++)
    {
        if(*(temperatura + i) < minima)
        {
            minima = *(temperatura + i);
        }
    }
    return minima;
}

int calcularTemperaturaMaxima(int *temperatura)
{
    int maxima = *temperatura;

    for(int i = 0; i < MAX; i++)
    {
        if(*(temperatura + i) > maxima)
        {
            maxima = *(temperatura + i);
        }
    }
    return maxima;
}

float calcularTemperaturaMedia(int *temperatura)
{
    float media = 0;

    for(int i = 0; i < MAX; i++)
    {
        media += *(temperatura + i);
    }
    return media / MAX;
}





