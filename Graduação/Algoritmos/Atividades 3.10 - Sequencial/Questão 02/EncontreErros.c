#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "");
    float nota1, nota2, media;

    printf("Informe a Nota 1: ");
    scanf("%f", &nota1);

    printf("Informe a Nota 2: ");
    scanf("%f", &nota2);

    media = (nota1 + nota2) /2;

    printf("Média: %.2f", media);
    return 0;
}
