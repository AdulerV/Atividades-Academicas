#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

#define MAX 10

//Codificar uma função capaz de validar a senha do usuário. Considere que a senha correta seja ALGORITMO.

int validarSenha(char senhaUsuario[MAX]);

main() {
    setlocale(LC_ALL, "");
    char senhaUsuario[MAX];

    printf("Insira a senha do usuário: ");
    gets(senhaUsuario);

    int resultado = validarSenha(senhaUsuario);

    if(resultado != 0) {
        printf("Bem-vindo!");
    } else {
        printf("Senha incorreta.");
    }
}

int validarSenha(char senhaUsuario[MAX]) {
    char senhaOriginal[MAX] = "ALGORITMO";
    return strcmp(senhaUsuario, senhaOriginal) == 0;
}
