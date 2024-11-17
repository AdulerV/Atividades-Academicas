#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX 3

/*O supermercado Excelente Preço deseja um programa para registrar todas as vendas realizadas para um cliente.
Codificar uma função para calcular o valor a ser pago pelo cliente, considerando:
a) Pagamento a vista – 5% de desconto do valor total da venda dividido em 2 parcelas.
b) Pagamento com cartão de crédito – 5% de acréscimo ao valor total da venda.*/

void imprimirPagamento(float valorTotal, char tipoPagamento);
float calcularPagamento(float vendas[MAX], char tipoPagamento);

main() {
    setlocale(LC_ALL, "");
    float vendas[MAX];

    for(int i = 0; i < MAX; i++) {
        printf("Insira o valor da %dº venda: ", i + 1);
        scanf("%f", &vendas[i]);
    }

    printf("Insira o tipo de pagamento [V ou C]: ");
    char tipoPagamento = getche();

    float resultado = calcularPagamento(vendas, tipoPagamento);
    imprimirPagamento(resultado, tipoPagamento);
}

void imprimirPagamento(float valorTotal, char tipoPagamento) {
    switch(tipoPagamento) {
    case 'V':
    case 'v':
        printf("\nDuas parcelas de R$ %.2f.", valorTotal);
        break;
    case 'C':
    case 'c':
        printf("\nValor total de R$ %.2f ", valorTotal);
        break;
    default:
        printf("\nValores inválidos.");
        break;
    }
}

float calcularPagamento(float vendas[MAX], char tipoPagamento) {
    float valorTotal = 0;
    float percentual = 0.05;

    for(int i = 0; i < MAX; i++) {
        valorTotal += vendas[i];
    }

    if(tipoPagamento == 'V' || tipoPagamento == 'v') {
        valorTotal = (valorTotal - (valorTotal * percentual)) / 2;
    } else if(tipoPagamento == 'C' || tipoPagamento == 'c') {
        valorTotal += (valorTotal * percentual);
    }
    return valorTotal;
}
