#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX 3


int main() {
    setlocale(LC_ALL, "");
    float soma = 0, media;
    float notas[MAX];

    for(int i = 1; i <= MAX; i++) {
        printf("Insira a %dº nota: ", i);
        scanf("%f", &notas[i]);
        soma += notas[i];
    }
    media = soma / MAX;
    printf("Média das Notas: %.2f", media);
}


