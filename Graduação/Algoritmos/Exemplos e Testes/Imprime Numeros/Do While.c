#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

main () {
    int numero = 1;

    do {
        printf("\n %d", numero);
        numero++;
    } while(numero <= 100);
}

//Repetição com Teste no Final: Semelhante ao While, porém é adequada quando desejar realizar pelo menos uma repetição.
