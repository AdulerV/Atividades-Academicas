/*Considerando a função abaixo.
a) X(10, 8, -1) b) X(1, 3, 5)
c) X(5, 2, -1) d) X(X(10, 8, -1), 6 * X(1, 3, 5), 2)*/

main() {
    printf("%d\n", X(10, 8, -1)); //10
    printf("%d\n", X(1, 3, 5)); //3
    printf("%d\n", X(5, 2, -1)); //5
    printf("%d\n", X(X(10, 8, -1), 6 * X(1, 3, 5), 2)); //10, 3, 2 => 10
}


int X(int A, int B, int C) {
    if ((A > B) && (B > C)) {
        return A;
    }
    if ((A < B) && (B < C)) {
        return B;
    } else {
        return (A + B + C) / 3;
    }
}
