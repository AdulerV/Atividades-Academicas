#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>

#define PI 3.14159265

int main() {
    setlocale(LC_ALL, "");

    float medidaCorda, alturaEstrutura, angulo, distancia;

    printf("Insira a dist�ncia entre os pontos: ");
    scanf("%f", &distancia);

    printf("Insira o �ngulo formado: ");
    scanf("%f", &angulo);

    medidaCorda = distancia / cos(angulo * PI / 180);
    alturaEstrutura = sin(angulo * PI / 180) * medidaCorda;

    printf("\nMedida da corda: %.2f\n", medidaCorda);
    printf("Altura da estrutura met�lica: %.2f\n", alturaEstrutura);

    return 0;
}
