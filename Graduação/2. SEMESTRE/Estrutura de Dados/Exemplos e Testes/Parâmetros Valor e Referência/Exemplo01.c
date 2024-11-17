#include <locale.h>

void modificaNumero(int numero);

main()
{
    setlocale(LC_ALL, "Portuguese");

    int numero = 100;

    printf("Valor variável numero: %d", numero);
    modificaNumero(numero);
    printf("\nValor variável numero: %d", numero);
}

void modificaNumero(int numero)
{
    numero = numero * 2;
}
