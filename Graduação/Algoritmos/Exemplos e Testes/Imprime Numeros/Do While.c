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

//Repeti��o com Teste no Final: Semelhante ao While, por�m � adequada quando desejar realizar pelo menos uma repeti��o.
