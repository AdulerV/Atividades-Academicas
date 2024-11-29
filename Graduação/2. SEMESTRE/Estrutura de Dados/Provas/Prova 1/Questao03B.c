#include <stdio.h>

int main()
{
    long a, n, contador = 0; // 1

    printf("\na="); // 1
    scanf("%1d", &a); // 1

    printf("\nn="); // 1
    scanf("%1d", &n); // 1

    long z = 1, t = a, k = n; // 1

    while(k > 0) // n / 2
    {
        if(k % 2 != 0)
        {
            z *= t;
        }

        k = k / 2;

        if(k != 0)
        {
            t *= t;
        }
        contador++;
    }
    printf("\nz=%d\n", z); // 1
    printf("\ncontador = %1d.\n", contador); // 1
}

/*  1. O que ele faz?
    R: O programa tem a finalidade de calcular a potencia da notação a^n.

    2. Qual a complexidade assintotica O(??)?
    R: A complexidade assintótica é dado por O(log n), visto que a cada repetição o valor de k é divido pela metade, o qual pode ser expresso aproximadamente por n / 2. */
