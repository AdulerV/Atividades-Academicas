#include <stdio.h>
#include <stdlib.h>

/*Codificar uma fun��o capaz de imprimir na tela a seguinte mensagem: �Programa
preso em um loop!�. A fun��o s� dever� ser finalizada quando o usu�rio digitar a letra
�X�. Considere que as informa��es digitadas pelo usu�rio n�o devem aparecer na tela
e que a mensagem deve aparecer apenas uma vez e em uma �nica linha.*/

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
