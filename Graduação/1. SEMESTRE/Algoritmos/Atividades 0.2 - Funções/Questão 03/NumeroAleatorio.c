#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <locale.h>

int numerosAleatorios();

int main() {
    setlocale(LC_ALL,"");
    int resultado = numerosAleatorios();
    printf("Um número aleatório entre 1 e 6 é %d.\n", resultado);
    return 0;
}

int numerosAleatorios() {
    srand(time(NULL));
    int numero = rand() % 6 + 1;
    return numero;
}
