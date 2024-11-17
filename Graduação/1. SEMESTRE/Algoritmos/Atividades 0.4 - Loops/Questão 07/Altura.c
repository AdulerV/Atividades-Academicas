#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/* Chico tem 1,50 metro de altura e cresce 2 cent�metros por ano, enquanto Z� tem 1,10 metro e cresce 3 cent�metros por ano.
Codificar uma fun��o para calcular quantos anos ser�o necess�rios para que Z� alcance uma altura maior que a do Chico. */

int calculaAltura(float alturaChico, float alturaZe);

main () {
    setlocale(LC_ALL, "");
    int resultado = calculaAltura(1.50, 1.10);
    printf("Ser�o necess�rios %d anos para que Z� seja maior que Chico.\n", resultado);
}

int calculaAltura(float alturaChico, float alturaZe) {
    int anos = 0;
    while(alturaZe <= alturaChico) {
        alturaChico += 0.02;
        alturaZe += 0.03;
        anos++;
    }
    return anos;
}
