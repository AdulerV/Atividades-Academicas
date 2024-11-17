#include <locale.h>

main()
{
    setlocale(LC_ALL, "Portuguese");

    int *p = (int) malloc(sizeof(int) * 10);

    for (int i=0; i<10; i++)
    {
        printf("\nParte de posição do %do. inteiro: %d", i+1, p+i);
    }

    char *p2 = (char*) malloc(sizeof(char) * 10);

    for (int i=0; i<10; i++)
    {
        printf("\nParte de posição do %do. inteiro: %d", i+1, p2+i);
    }

    double *p3 = (double*) malloc(sizeof(double) * 10);

    for (int i=0; i<10; i++)
    {
        printf("\nParte de posição do %do. inteiro: %d", i+1, p3+i);
    }

    float *p4 = (float*) malloc(sizeof(float) * 10);

    for (int i=0; i<10; i++)
    {
        printf("\nParte de posição do %do. inteiro: %d", i+1, p4+i);
    }
}
