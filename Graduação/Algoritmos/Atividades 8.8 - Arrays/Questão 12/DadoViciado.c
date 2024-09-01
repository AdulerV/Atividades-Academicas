#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Codificar um programa para simular a verificação se o dado usado em um determinado jogo é “viciado” ou não.
Considere que dado não “viciado” é aquele em que não há grande variação na quantidade de vezes que cada face é sorteada ao final de vários lançamentos.
O programa deve permitir ao usuário escolher o número de faces do dado (mínimo 2) e a quantidade de lançamentos a serem simulados.
Codificar uma função capaz de emitir um relatório apresentando a quantidade de vezes que cada face fora sorteada e assim o usuário perceberá se o dado é ou não viciado.*/

void simularLancamentos(int qtdFaces, int qtdLancamentos, int dado[qtdFaces]);

int main()
{
    setlocale(LC_ALL, "");
    int qtdFaces, qtdLancamentos, faces = 0;

    printf("Insira o número de faces do dado: ");
    scanf("%d", &qtdFaces);

    if(qtdFaces <  2) {
        printf("Número de faces inválido.");
        return 1;
    }

    printf("Insira a quantidade de lançamentos a serem simulados: ");
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
