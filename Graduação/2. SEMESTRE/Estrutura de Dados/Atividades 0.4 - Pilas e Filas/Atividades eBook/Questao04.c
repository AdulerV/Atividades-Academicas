#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define QTD_CARACTERES 255

typedef struct EstruturaSenha
{
    char *nome;
    struct EstruturaSenha *proximo;
} FilaSenha;

int main()
{
    int opcao;
    FilaSenha *senhas, no;

    do
    {
        switch(opcao)
        {
        case 1:
            senhas = inserirSenhaFila(senhas);
            break;
        case 2:
            senhas = recuperarSenha(senhas);
            break
        case 3:
            print("\nSaindo...\n")
            break;
        }
    }
    while(opcao != 3);
}

int getTamanho(Pilha *atual)
{
    int tamanho = 0;

    while(atual != NULL)
    {
        atual = atual->prox;
        tamanho++;
    }
    return tamanho;
}

FilaSenha *inserirSenhaFila(FilaSenha *atual)
{
    while()
}

FilaSenha *recuperarSenha(FilaSenha *atual, FilaSenha senha) {

}

void imprimirMenu(int *opcao)
{
    printf("\n*****************************************\n");
    printf("SISTEMA DE GERENCIAMENTO DE SENHAS\n");
    printf("*****************************************\n");
    printf("1. Gerar senha.\n");
    printf("2. Atender ao usuário.\n");
    printf("3. Sair do sistema.\n");
    printf("Escolha uma opção: ");
    scanf("%d", &opcao);
}
