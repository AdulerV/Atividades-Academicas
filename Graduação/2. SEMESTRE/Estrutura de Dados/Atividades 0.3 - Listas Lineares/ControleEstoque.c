#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define QTD_CARACTERES 255

typedef struct EstruturaProduto
{
    int codigo;
    char *nome;
    int quantidade;
    struct EstruturaProduto *proximo;
} Produto;

void imprimirMenu(int *opcao);
void inserirCodigoProduto(int *codigo);
Produto incluirDadosProduto(Produto *listaProdutos, Produto produto);
Produto* incluirNovoProduto(Produto *atual, Produto produto);
Produto* comprarProduto(Produto *atual, int codigo);
Produto* venderProduto(Produto *atual, int codigo);
void imprimirPosicaoGeralEstoque(Produto *atual);
Produto* consultarProduto(Produto *atual, int codigo);
Produto* excluirProduto(Produto *atual, int codigo);

int main()
{
    setlocale(LC_ALL, "");

    int opcao, codigo;
    Produto *listaProdutos = NULL, produto;

    do
    {
        imprimirMenu(&opcao);

        switch(opcao)
        {
        case 1:
            produto = incluirDadosProduto(listaProdutos, produto);
            listaProdutos = incluirNovoProduto(listaProdutos, produto);
            break;
        case 2:
            inserirCodigoProduto(&codigo);

            if(consultarProduto(listaProdutos, codigo) == NULL)
            {
                printf("Produto não encontrado.\n");
            }
            else
            {
                listaProdutos = comprarProduto(listaProdutos, codigo);
            }
            break;
        case 3:
            inserirCodigoProduto(&codigo);

            if(consultarProduto(listaProdutos, codigo) == NULL)
            {
                printf("Produto não encontrado.\n");
            }
            else
            {
                listaProdutos = venderProduto(listaProdutos, codigo);
            }
            break;
        case 4:
            imprimirPosicaoGeralEstoque(listaProdutos);
            break;
        case 5:
            inserirCodigoProduto(&codigo);
            Produto *consulta = consultarProduto(listaProdutos, codigo);

            if(consulta == NULL)
            {
                printf("Produto não encontrado.\n");
            }
            else
            {
                printf("%d - %s - %d\n", consulta->codigo, consulta->nome, consulta->quantidade);
            }
            break;
        case 6:
            inserirCodigoProduto(&codigo);

            if(consultarProduto(listaProdutos, codigo) == NULL)
            {
                printf("Produto não encontrado.\n");
            }
            else
            {
                listaProdutos = excluirProduto(listaProdutos, codigo);
            }
            break;
        case 7:
            printf("\nSaindo...\n");
            break;
        default:
            printf("Opção inserida inválida.\n");
        }
    }
    while(opcao != 7);
    return 0;
}

void imprimirMenu(int *opcao)
{
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
    printf("\n =======================\n");
    printf("Escolha uma opção: ");
    scanf("%d", opcao);
}

void inserirCodigoProduto(int *codigo)
{
    printf("\nInsira o código do produto: ");
    scanf("%d", codigo);
}

Produto incluirDadosProduto(Produto *atual, Produto produto)
{
    Produto *temporaria = atual;

    inserirCodigoProduto(&produto.codigo);

    while(temporaria != NULL)
    {
        if(temporaria->codigo == produto.codigo)
        {
            printf("Código já existente. Tente novamente.");
            inserirCodigoProduto(&produto.codigo);
            temporaria = atual;
        }
        else
        {
            temporaria = temporaria->proximo;
        }
    }

    produto.nome = (char*) malloc(sizeof(char) * QTD_CARACTERES);
    printf("Insira o nome do produto: ");
    scanf("%s", produto.nome);

    do
    {
        if(produto.quantidade < 0)
        {
            printf("Quantidade inválida. Tente novamente.\n");
        }
        printf("Insira a quantidade do produto: ");
        scanf("%d", &produto.quantidade);
    }
    while(produto.quantidade < 0);

    return produto;
}

Produto* incluirNovoProduto(Produto *atual, Produto produto)
{
    Produto *novo = (Produto*) malloc(sizeof(Produto));

    novo->codigo = produto.codigo;
    novo->nome = produto.nome;
    novo->quantidade = produto.quantidade;

    novo->proximo = atual;

    return novo;
}

Produto* comprarProduto(Produto *atual, int codigo)
{
    Produto *temporaria = atual;
    int quantidade;

    while(temporaria->codigo != codigo)
    {
        temporaria = temporaria->proximo;
    }

    do
    {
        printf("Insira a quantidade a ser comprada: ");
        scanf("%d", &quantidade);

        if (quantidade < 0)
        {
            printf("Quantidade inválida. Tente novamente.\n");
        }
    }
    while (quantidade < 0);

    temporaria->quantidade += quantidade;
    return atual;
}

Produto* venderProduto(Produto *atual, int codigo)
{
    Produto *temporaria = atual;
    int quantidade;

    while(temporaria->codigo != codigo)
    {
        temporaria = temporaria->proximo;
    }

    do
    {
        printf("Insira a quantidade a ser vendida: ");
        scanf("%d", &quantidade);

        if (quantidade < 0 || quantidade > temporaria->quantidade)
        {
            printf("Quantidade inválida. Tente novamente.\n");
        }
    }
    while (quantidade < 0 || quantidade > temporaria->quantidade);

    temporaria->quantidade -= quantidade;
    return atual;
}

void imprimirPosicaoGeralEstoque(Produto *atual)
{
    if(atual == NULL)
    {
        printf("Sem produtos no estoque.\n");
        return;
    }
    printf("\nCódigo - Nome - Quantidade:\n");

    while(atual != NULL)
    {
        printf("%d - %s - %d\n", atual->codigo, atual->nome, atual->quantidade);
        atual = atual->proximo;
    }
}

Produto* consultarProduto(Produto *atual, int codigo)
{
    while(atual != NULL && atual->codigo != codigo)
    {
        atual = atual->proximo;
    }

    if(atual == NULL)
    {
        return NULL;
    }
    return atual;
}

Produto* excluirProduto(Produto *atual, int codigo)
{
    Produto *anterior = NULL, *temporaria = atual;

    while(temporaria->codigo != codigo)
    {
        anterior = temporaria;
        temporaria = temporaria->proximo;
    }

    if(temporaria == atual && temporaria->proximo == NULL)
    {
        return NULL;
    }
    else if(temporaria == atual && temporaria->proximo != NULL)
    {
        atual = temporaria->proximo;
    }
    else
    {
        anterior->proximo = temporaria->proximo;
    }
    return atual;
}



