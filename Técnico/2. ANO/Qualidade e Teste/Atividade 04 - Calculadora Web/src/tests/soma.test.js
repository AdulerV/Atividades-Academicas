const { somar } = require('../util/matematica');
test('verificar se soma 1 + 2 é igual a 3', () => {
    expect(somar(1, 2)).toBe(3);
});

test('verificar se soma 1 + 0 é igual a 1', () => {
    expect(somar(1, 0)).toBe(1);
});

test('verificar se soma -5 + -4 é igual a -9', () => {
    expect(somar(-5, -4)).toBe(-9);
});

test('verificar se soma 0 + 0 é igual a 0', () => {
    expect(somar(0, 0)).toBe(0);
});