const { raiz } = require('../util/matematica');

test('verificar se a raiz de 0 é igual a 0', () => {
    expect(raiz(0)).toBe(0);
});

test('verificar se a raiz de 1 é igual a 1', () => {
    expect(raiz(1)).toBe(1);
});

test('verificar se a raiz de 9 é igual a 3', () => {
    expect(raiz(9)).toBe(3);
});

test('verificar se a raiz de 16 é igual a 4', () => {
    expect(raiz(16)).toBe(4);
});

test('verificar se a raiz de 7 é igual a 2.6457513110645907', () => {
    expect(raiz(7)).toBe(2.6457513110645907);
});

test('verificar se a raiz de 8 é igual a 2.82842712474619', () => {
    expect(raiz(8)).toBe(2.82842712474619);
});

test('verificar se a raiz a quadrada de um numero negativo é igual a 1', () => {
    expect(raiz(-16)).toBe(1);
});

test('verificar se a raiz a quadrada de um numero decimal', () => {
    expect(raiz(4.7)).toBe(2.167948338867939);
});

