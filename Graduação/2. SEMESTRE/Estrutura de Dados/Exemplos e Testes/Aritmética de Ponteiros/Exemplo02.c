#include <locale.h>
#define MAX 5

main()
{
    setlocale(LC_ALL, "Portuguese");

    int *p = (int) malloc(sizeof(int) * MAX);

    int i;

    for (i=0; i<MAX; i++)
    {
        printf("Informe um número: ");
        scanf("%d", p + i);
    }

    printf("\n\n*** Mostra os valores - Do primeiro ao último ***");

    for (i=0; i<MAX; i++)
    {
        printf("\nParte de valor do %do. inteiro: %d", i+1, *(p+i));
    }

    printf("\n\n*** Mostra os valores - Do último ao primeiro ***");

    for (i=MAX-1; i>=0; i--)
    {
        printf("\nParte de valor do %do. inteiro: %d", i+1, *(p+i));
    }
}
