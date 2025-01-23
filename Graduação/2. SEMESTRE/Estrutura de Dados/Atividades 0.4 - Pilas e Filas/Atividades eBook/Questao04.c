#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

#define QTD_CARACTERES 255

typedef struct EstruturaSenha {
    char *senha;
    struct EstruturaSenha *proxima;
} Senha;

void imprimirMenu();
char *gerarSenha(Senha *senhas);
Senha *push(Senha *senhas, char *texto);
Senha *pop(Senha *senha);
void imprimirSenhas(Senha *senhas);

int main() {
    setlocale(LC_ALL, "");

    Senha *senhas = NULL;
    int opcao;
    char *texto;

    do {
        imprimirMenu();
        printf("Escolha uma opção: ");
        scanf("%d", &opcao);

        switch (opcao) {
            case 1:
                texto = gerarSenha(senhas);
                senhas = push(senhas, texto);
                break;
            case 2:
                senhas = pop(senhas);
                break;
            case 3:
                imprimirSenhas(senhas);
                break;
            case 4:
                printf("\nSaindo...\n");
                break;
            default:
                printf("\nOpção inválida!\n");
                break;
        }
    } while (opcao != 4);

    return 0;
}

void imprimirMenu() {
    printf("*****************************************\n");
    printf("SISTEMA DE GERENCIAMENTO DE SENHAS\n");
    printf("*****************************************\n");
    printf("1. Gerar senha.\n");
    printf("2. Atender ao usuário.\n");
    printf("3. Imprimir senhas.\n");
    printf("4. Sair do sistema.\n");
    printf("*****************************************\n");
}

void imprimirSenhas(Senha *senhas) {
    int indice = 0;

    if (senhas == NULL) {
        printf("Nenhuma senha na fila.\n");
        return;
    }

    while (senhas != NULL) {
        printf("%d: %s\n", indice, senhas->senha);
        senhas = senhas->proxima;
        indice++;
    }
}

char *gerarSenha(Senha *senhas) {
    int indice = 0;
    char *string = (char *) malloc(sizeof(char) * QTD_CARACTERES);
    char baseSenha[20] = "IFET";

    while (senhas != NULL) {
        indice++;
        senhas = senhas->proxima;
    }

    sprintf(string, "%d", indice + 1);

    strcat(baseSenha, string);

    char *senhaGerada = (char *) malloc(strlen(baseSenha) + 1);
    strcpy(senhaGerada, baseSenha);

    free(string);

    return senhaGerada;
}

Senha *push(Senha *senhas, char *texto) {
    Senha *novaSenha = (Senha *) malloc(sizeof(Senha));
    novaSenha->senha = (char *) malloc(strlen(texto) + 1);
    strcpy(novaSenha->senha, texto);

    novaSenha->proxima = NULL;
    if (senhas == NULL) {
        return novaSenha;
    }

    Senha *temporaria = senhas;
    while (temporaria->proxima != NULL) {
        temporaria = temporaria->proxima;
    }
    temporaria->proxima = novaSenha;
    return senhas;
}

Senha *pop(Senha *senhas) {
    if (senhas == NULL) {
        printf("Nenhuma senha na fila para atender.\n");
        return NULL;
    }

    Senha *nova = senhas->proxima;

    free(senhas->senha);
    free(senhas);

    return nova;
}
