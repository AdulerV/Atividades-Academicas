#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX 5

/* Codificar uma função capaz de calcular o faturamento total obtido com as vendas
realizadas. A função deve receber como parâmetro os valores de todas as vendas
realizadas. */

float calcularFaturamentoTotal(float *vendas);

int main()
{
    setlocale(LC_ALL, "");
    float *vendas = (float*) malloc(sizeof(float) * MAX);

    for(int i = 0; i < MAX; i++)
    {
        printf("Insira o valor da %d. venda: ", i + 1);
        scanf("%f", vendas + i);
    }

    printf("Faturamento total: R$ %.2f.\n", calcularFaturamentoTotal(vendas));
    return 0;
}

float calcularFaturamentoTotal(float *vendas)
{
    float faturamento = 0;
    for(int i = 0; i < MAX; i++)
    {
        faturamento += *(vendas + i);
    }
    return faturamento;
}
