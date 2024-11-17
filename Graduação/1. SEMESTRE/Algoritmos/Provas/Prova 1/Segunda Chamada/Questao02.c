#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Um funcionário de uma empresa recebe aumento salarial anualmente.
Sabe-se que esse funcionário foi contratado em 2005, com salário inicial de R$ 1.000,00. Em 2006 recebeu aumento de 1,5% sobre seu salário inicial.
A partir de 2007 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior.
Codificar uma função que determine o salário atual (2024) desse funcionário. */

float calcularAumentoSalarial(float salario, float percentual, int ano);

main() {
    setlocale(LC_ALL, "");
    float resultado = calcularAumentoSalarial(1000, 1.5, 2005);
    printf("Salário Atual: R$ %.2f.\n", resultado);
}

float calcularAumentoSalarial(float salarioInicial, float aumentoInicial, int anoInicial) {
    float percentual = aumentoInicial / 100;
    float salario = salarioInicial;

    for(int ano = anoInicial + 1; ano <= 2024; ano++) {
        salario += (salario * percentual);
        percentual *= 2;
    }
    return salario;
}

