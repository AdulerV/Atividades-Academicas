#include <stdio.h>
#include <stdlib.h>

/*Codificar uma fun��o capaz de imprimir na tela o s�mbolo �O� tantas vezes quanto a
idade da pessoa. Por exemplo: para uma pessoa de 5 anos a fun��o deve ser
respons�vel por imprimir OOOOO.*/

main()
{
    int idade;

    printf("Insira a idade: ");
    scanf("%d", &idade);

    imprimirSimbolos(idade);
}

void imprimirSimbolos(int idade)
{
    int contador = 0;

    while(contador < idade)
    {
        printf("O");
        contador++;
    }
}

