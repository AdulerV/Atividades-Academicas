#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define TOTAL_VENDAS 5

/* Codificar uma função capaz de calcular o faturamento total obtido com as vendas
realizadas. A função deve receber como parâmetro os valores de todas as vendas
realizadas. */

float calcularFaturamentoTotal(float *vendas);

int main()
{
    setlocale(LC_ALL, "");
    float *vendas = (float*) malloc(sizeof(float) * TOTAL_VENDAS);

    for(int i = 0; i < TOTAL_VENDAS; i++)
    {
        printf("Insira o valor da %d. venda: ", i + 1);
        scanf("%f", vendas + i);
    }

    printf("Faturamento total: R$ %.2f.\n", calcularFaturamentoTotal(vendas));

    free(vendas);
    return 0;
}

float calcularFaturamentoTotal(float *vendas)
{
    float faturamento = 0;
    for(int i = 0; i < TOTAL_VENDAS; i++)
    {
        faturamento += *(vendas + i);
    }
    return faturamento;
}
