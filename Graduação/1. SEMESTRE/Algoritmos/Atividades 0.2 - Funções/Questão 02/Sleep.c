#include <stdio.h>
#include <windows.h>

void estadoEspera(int segundos);

int main() {
    int segundos;

    printf("Insira o tempo (Em segundos): ");
    scanf("%d", &segundos);

    estadoEspera(segundos);
}

void estadoEspera(int segundos) {
    printf("Programa em estado de espera por %d segundos.\n", segundos);
    return Sleep(segundos * 1000);
}
