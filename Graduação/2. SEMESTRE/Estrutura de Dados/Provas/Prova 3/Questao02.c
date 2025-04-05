#include <stdlib.h>
#include <stdio.h>
#include <locale.h>
#include <time.h>
#include <string.h>

#define MAX 12

struct TipoArvore
{
    int info;
    struct TipoArvore* sae;
    struct TipoArvore* sad;
};
typedef struct TipoArvore Arvore;

typedef struct
{
    int saltos;
    char posicao[20];
} Auxiliar;

int gerarAleatorio();
Arvore* inicializa();
int estaVazia(Arvore* a);
Arvore* criaNo(int n, Arvore* sae, Arvore* sad);
void imprime(Arvore* a);
Arvore* inserir(Arvore* a, int c);
int busca(Arvore* a, int c);
int buscaImprimir(Arvore* a, int c, int contador);

int main()
{
    setlocale(LC_ALL, "");
    srand(time(NULL));

    int contador = 0;
    Arvore *tree = NULL;

    for(int i = 0; i < MAX; i++)
    {
        tree = inserir(tree, gerarAleatorio());
    }

    imprime(tree);

    int valorSensor = 4;

    if (!busca(tree, valorSensor))
    {
        buscaImprimir(tree, valorSensor, contador);
        printf("\nIncêndio não encontrado.");
    }
    else
    {
        printf("\nMSG = ");
        buscaImprimir(tree, valorSensor, contador);
    }
}

void imprime(Arvore* a)
{
    if(!estaVazia(a))
    {
        printf("%d ", a->info);
        imprime(a->sae);
        imprime(a->sad);
    }
}

int gerarAleatorio()
{
    return rand() % 11;
}

Arvore* inicializa()
{
    return NULL;
}

int estaVazia(Arvore* a)
{
    return a == NULL;
}

Arvore* criaNo(int n, Arvore* sae, Arvore* sad)
{
    Arvore* p = (Arvore*) malloc(sizeof(Arvore));
    p->info = n;
    p->sae = sae;
    p->sad = sad;
    return p;
}

int busca(Arvore* a, int c)
{
    if(estaVazia(a))
    {
        return 0;
    }
    else
    {
        if (a->info == c)
        {
            return 1;
        }
        else
        {
            if (c < a->info)
            {
                return busca(a->sae, c);
            }
            else
            {
                if (c > a->info)
                {
                    return busca(a->sad, c);
                }
            }
        }
    }
}

int buscaImprimir(Arvore* a, int c, int contador)
{
    if(estaVazia(a))
    {
        return 0;
    }
    else
    {
        contador++;

        if (a->info == c)
        {
            printf("%d", contador);
            return 1;
        }
        else
        {
            if (c < a->info)
            {
                printf("%c", 'E');
                return buscaImprimir(a->sae, c, contador);
            }
            else
            {
                if (c > a->info)
                {
                    printf("%c", 'D');
                    return buscaImprimir(a->sad, c, contador);
                }
            }
        }
    }
}

Arvore* inserir(Arvore* a, int c)
{
    if (estaVazia(a))
    {
        return criaNo(c, inicializa(), inicializa());
    }
    else
    {
        if (c < a->info)
        {
            a->sae = inserir(a->sae, c);
        }
        if (c > a->info)
        {
            a->sad = inserir(a->sad, c);
        }
        return a;
    }
}
