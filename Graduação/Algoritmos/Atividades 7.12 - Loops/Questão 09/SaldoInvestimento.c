#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Sabe-se que um investimento financeiro rende determinado juros mensais.
Codificar uma fun��o para calcular o saldo final ap�s decorrer alguns meses.
Considere um aporte mensal e constante durante todo o per�odo do investimento.*/

float calculaPeriodo(float aporte, float juros, int meses);

main ()
{
    setlocale(LC_ALL, "");
    float aporte, juros;
    int meses;

    printf("Insira o dep�sito inicial: ");
    scanf("%f", &aporte);

    printf("Insira a taxa de juros: ");
    scanf("%f", &juros);

    printf("Insira os meses: ");
    scanf("%d", &meses);

    float resultado = calculaPeriodo(aporte, juros, meses);
    printf("O resultado final do investimento ser� de R$%.2f.\n", resultado);
}

float calculaPeriodo(float aporte, float juros, int meses)
{
    float rendimento = aporte;
    int contador = 0;

    while (contador <= meses)
    {
        rendimento += (rendimento * juros / 100) + aporte;
        contador++;
    }
    return rendimento;
}
