#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define PI 3.14

int main() {
    setlocale(LC_ALL, "");
    float raio, area;

    printf("Informe o raio do círculo: ");
    scanf("%f", &raio);

    area = raio * raio * PI;

    printf("Área do círculo: %.2f", area);
    return 0;
}
