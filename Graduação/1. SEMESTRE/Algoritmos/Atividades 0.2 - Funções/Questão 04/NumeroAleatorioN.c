#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <locale.h>

int numerosAleatorios(n);

int main() {
    setlocale(LC_ALL,"");
    int n, resultado;

    printf("Insira o n�mero limite: ");
    scanf("%d", &n);

    resultado = numerosAleatorios(n);
    printf("Um n�mero aleat�rio entre 1 e %d � %d.\n", n, resultado);
    return 0;
}

int numerosAleatorios(n) {
    srand(time(NULL));
    int numero = rand() % n + 1;
    return numero;
}
