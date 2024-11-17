#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define NUM_INSCRICOES 10

//Codificar uma função que seja capaz de verificar se uma determinada inscrição de um candidato está presente em uma relação de candidatos.

void imprimirVerificacao(int resultado, int inscricaoCandidato);
int verificarInscricao(int inscricoes[NUM_INSCRICOES], int inscricaoCandidato);

main()
{
    setlocale(LC_ALL, "");

    int inscricoes[NUM_INSCRICOES] = {341, 578, 982, 109, 102, 223, 111, 965, 417, 991};

    imprimirVerificacao(verificarInscricao(inscricoes, 982), 982);
    imprimirVerificacao(verificarInscricao(inscricoes, 223), 223);
    imprimirVerificacao(verificarInscricao(inscricoes, 103), 103);
}

void imprimirVerificacao(int resultado, int inscricaoCandidato)
{
    if(resultado)
    {
        printf("A inscrição %d está presente.\n", inscricaoCandidato);
    }
    else
    {
        printf("A inscrição %d não está presente.\n", inscricaoCandidato);
    }
}

int verificarInscricao(int inscricoes[NUM_INSCRICOES], int inscricaoCandidato)
{
    for(int i = 0; i < NUM_INSCRICOES; i++)
    {
        if(inscricoes[i] == inscricaoCandidato)
        {
            return 1;
        }
    }
    return 0;
}
