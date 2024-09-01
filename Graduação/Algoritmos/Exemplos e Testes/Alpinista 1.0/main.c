#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>


int main() {
    setlocale(LC_ALL, "");

    double medidaCorda, alturaEstrutura;
    int catetoAdjacente = 100;

    medidaCorda = catetoAdjacente / cos(30 * M_PI / 180.0);
    alturaEstrutura = sin(30 * M_PI / 180.0) * medidaCorda;

    printf("Medida da corda %.2f\n", medidaCorda);
    printf("Altura da estrutura metálica %.2f\n", alturaEstrutura);

    return 0;
}
