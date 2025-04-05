#include <stdlib.h>
#include <stdio.h>
#include <locale.h>
#include <time.h>

#define MAX 12

struct TipoArvore
{
    int info;
    struct TipoArvore* sae;
    struct TipoArvore* sad;
};
typedef struct TipoArvore Arvore;

int gerarAleatorio();
Arvore* inicializa();
int estaVazia(Arvore* a);
Arvore* criaNo(int n, Arvore* sae, Arvore* sad);
void imprimeIn(Arvore* a);
Arvore* inserir(Arvore* a, int c);

int main()
{
    srand(time(NULL));

    Arvore *tree = NULL;

    for(int i = 0; i < MAX; i++)
    {
        tree = inserir(tree, gerarAleatorio());
    }
    imprimeIn(tree);
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

void imprimeIn(Arvore* a)
{
    if(!estaVazia(a))
    {
        imprimeIn(a->sae);
        printf("%d ", a->info);
        imprimeIn(a->sad);
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
