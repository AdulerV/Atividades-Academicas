//const {salarioBase} = require('../util/imposto');
import {salarioBase} from "../util/imposto";

test('Salário 1000', () => {
    expect(salarioBase(1000)).toBe(1000);
});

test('Salário 2000', () => {
    expect(salarioBase(2000)).toBe(2000);
});

test('Salário 3000', () => {
    expect(salarioBase(3000)).toBe(3000);
});

test('Salário 3000.40', () => {
    expect(salarioBase(3000.40)).toBe(3000.40);
});

test('Salário 4200', () => {
    expect(salarioBase(4200)).toBe(4200);
});