#include <stdio.h>
#include <stdlib.h>

/*Codificar uma função capaz de imprimir na tela a seguinte mensagem: “Programa
preso em um loop!”. A função só deverá ser finalizada quando o usuário digitar a letra
‘X’. Considere que as informações digitadas pelo usuário não devem aparecer na tela
e que a mensagem deve aparecer apenas uma vez e em uma única linha.*/

void finalizarLoop();

main()
{
    finalizarLoop();
}

void finalizarLoop()
{
    char caractere = 'A';

    printf("Programa preso em um loop!\n");

    while(caractere != 'X' && caractere != 'x')
    {
        caractere = getch();
    }
}
