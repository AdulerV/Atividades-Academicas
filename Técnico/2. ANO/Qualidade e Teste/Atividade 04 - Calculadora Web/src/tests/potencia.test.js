const { potencia } = require('../util/matematica');

test('verificar se 1^1 é igual a 1', () => {
    expect(potencia(1, 1)).toBe(1);
});

test('verificar se 5^0 é igual a 1', () => {
    expect(potencia(5, 0)).toBe(1);
});

test('verificar se 4^2 é igual a 16', () => {
    expect(potencia(4, 2)).toBe(16);
});

test('verificar se 2^3 é igual a 8', () => {
    expect(potencia(2, 3)).toBe(8);
});

test('verificar se -6^2 é igual a 36', () => {
    expect(potencia(-6, 2)).toBe(36);
});

test('verificar se -5^3 é igual a -125', () => {
    expect(potencia(-5, 3)).toBe(-125);
});

test('verificar se 2^-1 é igual a 0.5', () => {
    expect(potencia(2, -1)).toBe(0.5);
});
