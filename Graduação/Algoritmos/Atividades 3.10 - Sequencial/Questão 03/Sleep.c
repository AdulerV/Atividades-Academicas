#include <stdio.h>
#include <windows.h>

int main() {
    int segundos;

    printf("Insira o tempo (Em segundos): ");
    scanf("%d", &segundos);

    printf("Programa em estado de espera por %d segundos.\n", segundos);
    Sleep(segundos * 1000);
}
