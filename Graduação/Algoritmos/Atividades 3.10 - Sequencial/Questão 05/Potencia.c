#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main() {
    setlocale(LC_ALL, "");
    int numero, potencia;

    printf("Insira o n�mero desejado: ");
    scanf("%d", &numero);

    printf("Insira a pot�ncia desejada: ");
    scanf("%d", &potencia);

    printf("%d^%d = %.0f", numero, potencia, pow(numero, potencia));
    return 0;
}
