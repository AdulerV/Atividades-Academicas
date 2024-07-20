#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main() {
    setlocale(LC_ALL, "");
    float nota1, nota2, nota3, media;

    printf("Insira a primeira nota: ");
    scanf("%f", &nota1);

    printf("Insira a segunda nota: ");
    scanf("%f", &nota2);

    printf("Insira a terceira nota: ");
    scanf("%f", &nota3);

    media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);
    printf("A média ponderada é %.2f .", media);

    return 0;
}
