//const {inss} = require('../util/imposto');
import {inss} from "../util/imposto";

test('Inss de um salário de 1000', () => {
    expect(inss(1000)).toBe(130);
});

test('Inss de um salário de 2000', () => {
    expect(inss(2000)).toBe(260);
});

test('Inss de um salário de 3000', () => {
    expect(inss(3000)).toBe(390);
});

test('Inss de um salário de 3000.40', () => {
    expect(inss(3000.40)).toBe(390.05);
});

test('Inss de um salário de 4200', () => {
    expect(inss(4200)).toBe(546);
});