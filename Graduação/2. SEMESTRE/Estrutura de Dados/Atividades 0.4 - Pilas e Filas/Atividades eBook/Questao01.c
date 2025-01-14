#include <locale.h>
#define MAX 5 /* tamanho
 da pilha. */
void push(int i); /* insere um elemento na pilha.*/
int pop(void); /* recupera um elemento da pilha.*/
int getTamanho(); /* retorna o tamanho da pilha.*/
int pilha[MAX]; /* cria a pilha. */
int topo=0; /* índice da posição livre e a ser recuperada. */
int tamanho=0; /* armazena o tamanho da pilha. */

main()
{
    setlocale(LC_ALL, "");
    push(1);
    push(2);
    push(3);
    push(4);
    push(5);
    push(6);
    printf("\nTamanho: %d",getTamanho());
    printf("\n%d",pop());
    printf("\n%d",pop());
    printf("\n%d",pop());
    printf("\nTamanho: %d",getTamanho());
    printf("\n%d",pop());
    printf("\n%d",pop());
    printf("\n%d",pop());
    printf("\n%d",pop());
    printf("\n%d",pop());
    printf("\nTamanho: %d",getTamanho());
}

void push(int i)
{
    if(topo < MAX)
    {
        pilha[topo] = i;
        topo++;
    }
    else
    {
        printf("Pilha cheia, não é possível inserir %d\n", i);
    }
}

int pop(void)
{
    if(topo > 0)
    {
        topo--;
        return pilha[topo];
    }
    else
    {
        printf("\nPilha vazia, não há elementos para remover.\n");
        return -1;
    }

}

int getTamanho()
{
    tamanho = topo;
    return tamanho;
}
