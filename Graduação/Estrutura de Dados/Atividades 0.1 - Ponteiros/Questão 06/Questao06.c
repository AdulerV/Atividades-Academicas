/* Assumindo que o endere�o da vari�vel x fora atribu�do a um ponteiro px, escreva uma
express�o que n�o use x, mas que divida x por 5.*/

main()
{
    int x, *px = &x;

    printf("Insira o valor de x: ");
    scanf("%d", px);

    *px /= 5;
    printf("x / 5 = %d", *px);
}
