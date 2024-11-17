#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

main () {
    for(int numero = 1; numero <= 100; numero++) {
        printf("\n%d", numero);
    }
}

//Repetição com Variável de Controle: Muito eficiente em situações que se conhece a quantidade de repetições a serem executadas, ou seja, o limite de repetições.
