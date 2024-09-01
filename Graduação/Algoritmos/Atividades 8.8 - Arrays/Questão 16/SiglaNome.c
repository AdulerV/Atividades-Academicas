#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

#define MAX 50

/*Codificar uma função capaz de criar uma sigla para cada nome fornecido.
A sigla deve ser composta da letra inicial de cada parte do nome.
Veja exemplos abaixo: Jose da Silva => JdS; José Pedro Nogueira => JPN; Minas Gerais => MG; Goiás => G*/

char criarSigla(char nome[MAX], char sigla[MAX]);

main() {
    setlocale(LC_ALL, "");
    char nome[MAX];
    char sigla[MAX];

    printf("Insira um nome: ");
    gets(nome);

    criarSigla(nome, sigla);

    printf("%s => %s\n", nome, sigla);
}

char criarSigla(char nome[MAX], char sigla[MAX]) {
    int j = 0;
    sigla[j] = nome[j];

    for(int i = 0; i < strlen(nome); i++) {
        if(nome[i] == ' ') {
            j++;
            sigla[j] = nome[i + 1];
        }
    }
}
