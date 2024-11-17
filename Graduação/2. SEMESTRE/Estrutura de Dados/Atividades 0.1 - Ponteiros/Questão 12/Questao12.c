/* Qual o valor impresso ao final do programa? Tente primeiro descobrir e depois verifique no
computador o resultado. Indique o valor de cada uma das variáveis a cada atribuição
realizada. */

int main()
{
    int y, *p, x;
    y = 0;
    p = &y;
    x = *p;
    x = 4;
    (*p)++;
    x--;
    (*p) += x;
    printf ("\nx = %d\n", x); //3
    printf ("\ny = %d\n", y); //4
}
