#include <stdio.h>
#include <locale.h>

main() {
    setlocale(LC_ALL, "Portuguese");

    double *p;
    p = (double*) malloc(8);

    if (p == NULL)
    {
        printf("Mem�ria Insuficiente!");
        return 0;
    }

    *p = 9.5;

    printf("\nEndere�o do 1o. Byte: %d", p);
    printf("\nValor double armazenado: %f", *p);
    free(p);
}
