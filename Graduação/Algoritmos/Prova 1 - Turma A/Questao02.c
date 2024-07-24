#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Codificar uma fun��o capaz de simular um editor de textos bem simples, ou seja, que
permita apenas a digita��o de texto. Ao final, a fun��o dever� calcular a quantidade
total de caracteres digitados pelo usu�rio.*/

main()
{
    setlocale(LC_ALL, "");
    imprimirMenu();
    int resultado = calcularCaracteres();
    printf("\nVoc� digitou %d caracteres.", resultado);
}

void imprimirMenu()
{
    printf("************************************************************\n");
    printf("Bem-vindo ao editor de texto! Para sair, pressione barra (/)\n");
    printf("************************************************************\n");
}

int calcularCaracteres()
{
    char caractere = 'A';
    int contador = 0;

    while(caractere != '/')
    {
        caractere = getche();
        contador++;
    }
    return contador;
}

