#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Sabe-se que um investimento financeiro rende determinado juros mensais.
Codificar uma fun��o para calcular a quantidade de meses necess�rios para que um
determinado aporte mensal e constante durante todo o per�odo do investimento,
alcance o valor final desejado.*/

int calculaPeriodo(float aporte, float juros, float valorFinal);

main () {
    setlocale(LC_ALL, "");
    float aporte, juros, valorFinal;

    printf("Insira o dep�sito inicial: ");
    scanf("%f", &aporte);

    printf("Insira a taxa de juros: ");
    scanf("%f", &juros);

    printf("Insira o valor final desejado: ");
    scanf("%f", &valorFinal);

    int resultado = calculaPeriodo(aporte, juros, valorFinal);
    printf("Ser�o necess�rios %d meses.\n", resultado);
}

int calculaPeriodo(float aporte, float juros, float valorFinal) {
    float rendimento = aporte;
    int meses = 0;

    while (rendimento < valorFinal) {
        rendimento += (rendimento * juros / 100) + aporte;
        meses++;
    }
    return meses;
}
