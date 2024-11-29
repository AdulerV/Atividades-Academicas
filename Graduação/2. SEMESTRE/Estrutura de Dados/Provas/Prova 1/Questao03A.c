#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "");

    int *base = (int*) malloc(sizeof(int));
    int *expoente = (int*) malloc(sizeof(int));

    inserirValores(base, expoente);

    printf("Resultado de %d elevado a %d: %d.\n", *base, *expoente, calcularPotencia(base, expoente));
    printf("Quantidade de passos realizados: %d.\n", contarPassosPotencia(base, expoente));

    free(base);
    free(expoente);
    return 0;
}

void inserirValores(int *base, int *expoente)
{
    printf("Insira um número inteiro para a base (a): ");
    scanf("%d", base);

    printf("Insira um número inteiro para o expoente (a^n): ");
    scanf("%d", expoente);
}

int calcularPotencia(int *base, int *expoente) {
    int potencia = 1; // 1

    for(int i = 0; i < *expoente; i++) { // n + 1
        potencia *= *base; // n
    }
    return potencia; // 1
}

/*  t(n) = 1 + (n + 1) + n + 1 (retirando termos de menor grau)
    t(n) = 1 + (n + 1) + 1 (retirando contantes)
    t(n) = n
    O(n) */

int contarPassosPotencia(int *base, int *expoente) {
    int potencia = 1, contador = 0;

    for(int i = 0; i < *expoente; i++) {
        contador++;
        potencia *= *base;
    }
    return contador;
}

