#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

//Qual será a configuração do vetor num depois de executado o trecho de programa abaixo?

main()
{
    int num[5][5], i, j;
    for (i=0; i<5; i++)
    {
        for (j=0; j<5; j++)
        {
            if (i>j)
            {
                num[i][j]=1;
            }
            if (i==j)
            {
                num[i][j]=0;
            }
            if (i<j)
            {
                num[i][j]=-1;
            }
        }
    }
    /* Configuração:
    0 |-1 |-1 |-1 |-1 |
    1 |0 |-1 |-1 |-1 |
    1 |1 |0 |-1 |-1 |
    1 |1 |1 |0 |-1 |
    1 |1 |1 |1 |0 | */
}

