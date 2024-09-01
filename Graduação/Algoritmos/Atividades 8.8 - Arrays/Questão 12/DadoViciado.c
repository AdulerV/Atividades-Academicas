#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Codificar um programa para simular a verifica��o se o dado usado em um determinado jogo � �viciado� ou n�o.
Considere que dado n�o �viciado� � aquele em que n�o h� grande varia��o na quantidade de vezes que cada face � sorteada ao final de v�rios lan�amentos.
O programa deve permitir ao usu�rio escolher o n�mero de faces do dado (m�nimo 2) e a quantidade de lan�amentos a serem simulados.
Codificar uma fun��o capaz de emitir um relat�rio apresentando a quantidade de vezes que cada face fora sorteada e assim o usu�rio perceber� se o dado � ou n�o viciado.*/

void simularLancamentos(int qtdFaces, int qtdLancamentos, int dado[qtdFaces]);

int main()
{
    setlocale(LC_ALL, "");
    int qtdFaces, qtdLancamentos, faces = 0;

    printf("Insira o n�mero de faces do dado: ");
    scanf("%d", &qtdFaces);

    if(qtdFaces <  2) {
        printf("N�mero de faces inv�lido.");
        return 1;
    }

    printf("Insira a quantidade de lan�amentos a serem simulados: ");
    scanf("%d", &qtdLancamentos);

    int dado[qtdFaces];

    for(int i = 0; i < qtdFaces; i++)
    {
        dado[i] = 0;
    }

    simularLancamentos(qtdFaces, qtdLancamentos, dado);
    return 0;
}

void simularLancamentos(int qtdFaces, int qtdLancamentos, int dado[qtdFaces])
{
    srand(time(NULL));

    for(int i = 0; i < qtdLancamentos; i++)
    {
        int faceSorteada = rand() % qtdFaces;
        dado[faceSorteada]++;
    }

    for(int i = 0; i < qtdFaces; i++)
    {
        printf("\nFace %d: %d vezes.", i + 1, dado[i]);
    }
}
