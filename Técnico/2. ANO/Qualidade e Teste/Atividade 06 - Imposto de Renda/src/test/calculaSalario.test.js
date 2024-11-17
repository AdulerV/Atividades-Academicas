//const {calculaSalario} = require('../util/imposto');
import {calculaSalario} from "../util/imposto";

test('Funcionário 1', () => {
    expect(calculaSalario(1000, 130, 0, 30, 50)).toBe(890);
});

test('Funcionário 2', () => {
    expect(calculaSalario(2000, 260, 50, 60, 100)).toBe(1830);
});

test('Funcionário 3', () => {
    expect(calculaSalario(3000, 390, 100, 90, 150)).toBe(2770);
});

test('Funcionário 4', () => {
    expect(calculaSalario(3000.40, 390.052, 150, 90.012, 150.02)).toBe(2820.36);
});

test('Funcionário 5', () => {
    expect(calculaSalario(4200, 546, 150, 126, 210)).toBe(3888);
});