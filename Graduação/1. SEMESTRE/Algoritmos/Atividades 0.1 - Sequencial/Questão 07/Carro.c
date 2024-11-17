/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos impostos
(aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 12% e os impostos de 30%, fa�a
um programa que leia o custo de f�brica de um carro e escreva o custo ao consumidor.*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "");
    float custoFabrica, custoTotal, porcentagem, impostos;

    printf("Insira o custo de f�brica do carro: ");
    scanf("%f", &custoFabrica);

    printf("Insira a porcentagem do distribuidor: ");
    scanf("%f", &porcentagem);

    printf("Insira os impostos: ");
    scanf("%f", &impostos);

    porcentagem *= custoFabrica / 100;
    impostos *= custoFabrica / 100;
    custoTotal = custoFabrica + porcentagem + impostos;

    printf("O custo do carro ao consumidor ser� de R$ %.2f.\n", custoTotal);
    return 0;
}
