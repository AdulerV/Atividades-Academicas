const { mdc } = require('../util/matematica');

test('verificar se o MDC de 1 e 6 é igual a 1', () => {
    expect(mdc(1, 6)).toBe(1);
});

test('verificar se o MDC de 2 e 4 é igual a 2', () => {
    expect(mdc(2, 4)).toBe(2);
});

test('verificar se o MDC de 3 e 13 é igual a 1', () => {
    expect(mdc(3, 13)).toBe(1);
});

test('verificar se o MDC de 12 e 8 é igual a 4', () => {
    expect(mdc(12, 8)).toBe(4);
});

test('verificar se o MDC de 50 e 15 é igual a 5', () => {
    expect(mdc(50, 15)).toBe(5);
});

test('verificar se o MDC de 632 e 724 é igual a 4', () => {
    expect(mdc(632, 724)).toBe(4);
});

test('verificar se o MDC de -5 e 10 é igual a 5', () => {
    expect(mdc(-5, 10)).toBe(5);
});

test('verificar se o MDC de -2 e -4 é igual a 2', () => {
    expect(mdc(-2, -4)).toBe(2);
});