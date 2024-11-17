#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX 5

int main()
{
    setlocale(LC_ALL, "");
    float menorValor, maiorValor;
    float valores[MAX];

    for(int i = 0; i < MAX; i++)
    {
        printf("Insira o %d° valor: ", i + 1);
        scanf("%f", &valores[i]);

        if(i == 0)
        {
            menorValor = valores[i];
            maiorValor = valores[i];
        }

        if(valores[i] < menorValor)
        {
            menorValor = valores[i];
        }
        else if(valores[i] > maiorValor)
        {
            maiorValor = valores[i];
        }
    }
    printf("Menor Valor: %.2f\n", menorValor);
    printf("Maior Valor: %.2f\n", maiorValor);
    return 0;
}
