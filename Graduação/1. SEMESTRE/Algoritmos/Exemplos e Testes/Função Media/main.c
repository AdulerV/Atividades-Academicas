#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

float calculaMedia(float priNota, float segNota);

int main() {
    setlocale(LC_ALL, "");
    float nota1, nota2;

    printf("Insira a primeira nota: ");
    scanf("%f", &nota1);

    printf("Insira a segunda nota: ");
    scanf("%f", &nota2);

    printf("A média entre as notas é %.2f\n", calculaMedia(nota1, nota2));
    return 0;
}

float calculaMedia(float priNota, float segNota) {
    float media;
    media = (priNota + segNota) / 2;
    return media;
}

