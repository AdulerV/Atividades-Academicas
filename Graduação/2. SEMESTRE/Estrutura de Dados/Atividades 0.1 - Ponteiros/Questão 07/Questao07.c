/* Qual o valor das seguintes expressões:
int i = 3, j = 5;
int *p = &i, *q = &j;
a) p == &i b) *p - *q  */

main()
{
    int i = 3, j = 5;
    int *p = &i, *q = &j;

    printf("a) %d\n", p == &i); //true, ou seja, != 0.
    printf("b) %d\n", *p - *q); //-2
}

