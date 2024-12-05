#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

typedef struct EstruturaProduto
{
    int codigo;
    char* nome;
    int quantidade;
    struct EstruturaProduto* proximo;
} Produto;

int main()
{
    setlocale(LC_ALL, "");

    Produto* novo;
    int resultado = imprimirMenu();

    inserirDados(novo);
}


void inserirDados(Produto* produto)
{
    printf("Insira o código: ");
    scanf("%d", produto->codigo);


    printf("Insira o nome: ");
    produto->nome = malloc(sizeof(char) * 81);
    fgets(produto->nome, 81, stdin);
    gets(produto->nome);

    printf("Insira a quantidade: ");
    scanf("%d", produto->quantidade);
}

int imprimirMenu()
{
    int opcao;

    printf("\n =======================");
    printf("\n Menu");
    printf("\n =======================");
    printf("\n 1 - Inclusão");
    printf("\n 2 - Compra");
    printf("\n 3 - Venda");
    printf("\n 4 - Posição geral");
    printf("\n 5 - Consulta");
    printf("\n 6 - Exclui");
    printf("\n 7 - Sai");
    printf("\n =======================");
    printf("\nInsira a opção desejada: ");
    scanf("%d", &opcao);

    return opcao;
}

