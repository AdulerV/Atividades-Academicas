#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int calculaFerraduras(int cavalos);

int main() {
    setlocale(LC_ALL, "");
    int cavalos, resultado;

    printf("Insira a quantidade de cavalos hospedados: ");
    scanf("%d", &cavalos);

    resultado = calculaFerraduras(cavalos);
    printf("Serão necessárias %d ferraduras.\n", resultado);
    return 0;
}

int calculaFerraduras(int cavalos) {
    int ferraduras = cavalos * 4;
    return ferraduras;
}
