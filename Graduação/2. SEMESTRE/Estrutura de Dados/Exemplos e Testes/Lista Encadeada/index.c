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

Produto* buscarProduto(int codigo, Produto* estoque);


int main()
{
    setlocale(LC_ALL, "");

    Produto* estoque = NULL;
    int resultado = imprimirMenu();

    while(resultado != 7)
    {
        switch(resultado)
        {
        case 1:
            inserirDados(estoque);
            break;
        case 2:
            comprarProduto(estoque);
            break;
        case 3:
            inserirDados(estoque);
            break;
        case 4:
            inserirDados(estoque);
            break;
        case 5:
            inserirDados(estoque);
            break;
        case 6:
            inserirDados(estoque);
            break;
        case 7:
            break;
        default:
            printf("Opção inválida.\n");
        }
        resultado = imprimirMenu();
    }

}
void comprarProduto(Produto* produto)
{
    int codigo, quantidade;

    printf("Insira o código: ");
    scanf("%d", &codigo);
    produto = buscarProduto(codigo, produto);

    if(produto == NULL)
    {
        printf("Código de produto inexistente.");
        return NULL;
    }

    printf("Insira a quantidade: ");
    scanf("%d", quantidade);

    if(quantidade <= 0)
    {
        printf("Quantidade de produto inválida.");
        return NULL;
    }
    produto->quantidade += quantidade;
}

Produto* buscarProduto(int codigo, Produto* estoque)
{
    Produto* produtoAtual = estoque;

    while(produtoAtual != NULL && produtoAtual->codigo != codigo)
    {
        produtoAtual = produtoAtual->proximo;
    }
    return (produtoAtual);
}

void inserirDados(Produto* produto)
{
    int codigo;

    printf("Insira o código: ");
    scanf("%d", &codigo);
    produto->codigo = codigo;

    printf("Insira o nome: ");
    produto->nome = malloc(sizeof(char) * 81);
    fgets(produto->nome, 81, stdin);
    gets(produto->nome);

    printf("Insira a quantidade: ");
    scanf("%d", produto->quantidade);

    printf("Código: %d.\n", produto->codigo);
    printf("Nome: %s.\n", produto->nome);
    printf("Quantidade: %d.\n", produto->quantidade);

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
