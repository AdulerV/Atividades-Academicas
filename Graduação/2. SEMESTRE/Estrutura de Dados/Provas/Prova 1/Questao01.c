#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

void calcularMedia(float *numero1, float *numero2, float *media)
{
    *media = *numero1 + *numero2;
    *media /= 2;
}

int main()
{
    setlocale(LC_ALL, "");

    float *numero1 = (float*) malloc(sizeof(float));
    float *numero2 = (float*) malloc(sizeof(float));
    float *media = (float*) malloc(sizeof(float));

    printf("Insira o valor do primeiro número: ");
    scanf("%f", numero1);

    printf("Insira o valor do segundo número: ");
    scanf("%f", numero2);

    calcularMedia(numero1, numero2, media); // Parâmetro por referência

    printf("Média entre %.2f e %.2f: %.2f.\n", *numero1, *numero2, *media);

    free(numero1);
    free(numero2);
    free(media);
    return 0;
}
