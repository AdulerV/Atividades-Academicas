#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "");
    float raio, area, pi = 3.14;

    printf("Informe o raio do círculo: ");
    scanf("%f", &raio);

    area = raio * raio * pi;

    printf("Área do círculo: %.2f", area);
    return 0;
}
