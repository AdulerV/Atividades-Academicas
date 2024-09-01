#include <stdio.h>
#include <stdlib.h>

int main() {
    float nota1, nota2, media;

    printf("Informe a primeira nota:");
    scanf("%f", &nota1);

    printf("Informe a primeira nota:");
    scanf("%f", &nota2);

    media = (nota1 + nota2) / 2;

    if(media >= 6) {
        printf("Aprovado!");
    } else {
        printf("Reprovado!");
    }

    return 0;
}
