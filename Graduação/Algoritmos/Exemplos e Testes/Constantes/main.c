#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define PI 3.14

int main() {
    setlocale(LC_ALL, "");
    float raio, area;

    printf("Informe o raio do c�rculo: ");
    scanf("%f", &raio);

    area = raio * raio * PI;

    printf("�rea do c�rculo: %.2f", area);
    return 0;
}
