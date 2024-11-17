#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

//Codificar uma função para calcular a quantidade de funcionários que possuem salário igual ao maior salário de uma empresa.

int calcularFuncionariosComMaiorSalario(int numFuncionarios, float salarios[numFuncionarios]);

int main()
{
    setlocale(LC_ALL, "");
    int numFuncionarios;

    printf("Insira a quantidade de funcionários da empresa: ");
    scanf("%d", &numFuncionarios);

    if (numFuncionarios <= 0)
    {
        printf("A quantidade de funcionários deve ser maior que zero.\n");
        return 1;
    }

    float salarios[numFuncionarios];

    for(int i = 0; i < numFuncionarios; i++)
    {
        printf("Insira o salário do %d° funcionário: ", i + 1);
        scanf("%f", &salarios[i]);
    }
    int resultado = calcularFuncionariosComMaiorSalario(numFuncionarios, salarios);
    printf("Quantidade de funcionários com maior salário: %d\n", resultado);
    return 0;
}

int calcularFuncionariosComMaiorSalario(int numFuncionarios, float salarios[numFuncionarios])
{
    float maiorSalario = 0;
    int quantidade = 0;

    for(int i = 0; i < numFuncionarios; i++)
    {
        if(salarios[i] > maiorSalario)
        {
            maiorSalario = salarios[i];
        }
    }

    for(int i = 0; i < numFuncionarios; i++)
    {
        if(salarios[i] == maiorSalario)
        {
            quantidade++;
        }
    }
    return quantidade;
}
