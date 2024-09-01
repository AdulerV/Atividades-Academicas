#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int defineDivisivel (int numero1, int numero2);

main()
{
    setlocale(LC_ALL, "");
    int num1, num2, resultado;


    printf("Insira o primeiro número: ");
    scanf("%d", &num1);

    printf("Insira o segundo número: ");
    scanf("%d", &num2);

    resultado = defineDivisivel(num1, num2);

    if(resultado) {
        printf("O número %d é dívisivel por %d.\n", num1, num2);
    } else {
        printf("O número %d NÃO é dívisivel por %d.\n", num1, num2);
    }
}

int defineDivisivel (int numero1, int numero2) {
   return ((numero1 % numero2) == 0); //contendo somente 1 linha de instrução
}
