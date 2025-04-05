#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

struct TipoArvore
{
    int info;
    struct TipoArvore* sae;
    struct TipoArvore* ctr;
    struct TipoArvore* sad;
};
typedef struct TipoArvore Arvore;

Arvore* inicializa();
int estaVazia(Arvore* a);
Arvore* criaNo(int n, Arvore* sae, Arvore* ctr, Arvore* sad);
void imprime(Arvore* a);

int main()
{
    Arvore *D = criaNo(6, inicializa(), inicializa(), inicializa());
    Arvore *C = criaNo(7, inicializa(), inicializa(), inicializa());
    Arvore *X = criaNo(4, inicializa(), inicializa(), inicializa());
    Arvore *Z = criaNo(44, inicializa(), inicializa(), inicializa());
    Arvore *Y = criaNo(4, inicializa(), inicializa(), inicializa());
    Arvore *W = criaNo(22, inicializa(), inicializa(), inicializa());
    Arvore *K = criaNo(26, inicializa(), D, inicializa());
    Arvore *J = criaNo(3, inicializa(), X, inicializa());
    Arvore *L = criaNo(19, inicializa(), inicializa(), Z);
    Arvore *A = criaNo(3, inicializa(), W, inicializa());
    Arvore *B = criaNo(5, K, inicializa(), C);
    Arvore *E = criaNo(9, J, L, Y);
    Arvore *F = criaNo(18, B, E, A);
    imprime(F);

    return 0;
}

Arvore* inicializa()
{
    return NULL;
}

Arvore* criaNo(int n, Arvore* sae, Arvore* ctr, Arvore* sad)
{
    Arvore* p = (Arvore*) malloc(sizeof(Arvore));
    p->info = n;
    p->sae = sae;
    p->ctr = ctr;
    p->sad = sad;
    return p;
}

void imprime(Arvore* a)
{
    if(!estaVazia(a))
    {
        printf("%d ", a->info);
        imprime(a->sae);
        imprime(a->ctr);
        imprime(a->sad);
    }
}

int estaVazia(Arvore* a)
{
    return a == NULL;
}




