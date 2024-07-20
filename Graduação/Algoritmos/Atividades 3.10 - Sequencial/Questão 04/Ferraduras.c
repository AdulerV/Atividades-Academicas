#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "");
    int cavalos, ferraduras;

    printf("Insira a quantidade de cavalos hospedados: ");
    scanf("%d", &cavalos);

    ferraduras = cavalos * 4;
    printf("Serão necessárias %d ferraduras.\n", ferraduras);
    return 0;
}
