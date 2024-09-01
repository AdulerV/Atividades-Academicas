#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>

#define PI 3.14159265

int main() {
    setlocale(LC_ALL, "");

    float medidaCorda, alturaEstrutura, angulo, distancia;

    printf("Insira a distância entre os pontos: ");
    scanf("%f", &distancia);

    printf("Insira o ângulo formado: ");
    scanf("%f", &angulo);

    medidaCorda = distancia / cos(angulo * PI / 180);
    alturaEstrutura = sin(angulo * PI / 180) * medidaCorda;

    printf("\nMedida da corda: %.2f\n", medidaCorda);
    printf("Altura da estrutura metálica: %.2f\n", alturaEstrutura);

    return 0;
}
