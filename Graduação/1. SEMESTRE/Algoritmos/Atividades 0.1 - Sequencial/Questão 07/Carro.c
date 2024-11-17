/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos
(aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 12% e os impostos de 30%, faça
um programa que leia o custo de fábrica de um carro e escreva o custo ao consumidor.*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "");
    float custoFabrica, custoTotal, porcentagem, impostos;

    printf("Insira o custo de fábrica do carro: ");
    scanf("%f", &custoFabrica);

    printf("Insira a porcentagem do distribuidor: ");
    scanf("%f", &porcentagem);

    printf("Insira os impostos: ");
    scanf("%f", &impostos);

    porcentagem *= custoFabrica / 100;
    impostos *= custoFabrica / 100;
    custoTotal = custoFabrica + porcentagem + impostos;

    printf("O custo do carro ao consumidor será de R$ %.2f.\n", custoTotal);
    return 0;
}
