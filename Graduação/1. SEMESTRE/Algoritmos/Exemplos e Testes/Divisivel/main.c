#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int defineDivisivel (int numero1, int numero2);

main()
{
    setlocale(LC_ALL, "");
    int num1, num2, resultado;


    printf("Insira o primeiro n�mero: ");
    scanf("%d", &num1);

    printf("Insira o segundo n�mero: ");
    scanf("%d", &num2);

    resultado = defineDivisivel(num1, num2);

    if(resultado) {
        printf("O n�mero %d � d�visivel por %d.\n", num1, num2);
    } else {
        printf("O n�mero %d N�O � d�visivel por %d.\n", num1, num2);
    }
}

int defineDivisivel (int numero1, int numero2) {
   return ((numero1 % numero2) == 0); //contendo somente 1 linha de instru��o
}
