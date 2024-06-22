//const {trabalhoNoturno} = require('../util/imposto');
import {trabalhoNoturno} from "../util/imposto";

test('Trabalho noturno de um salário de 1000', () => {
    expect(trabalhoNoturno(1000)).toBe(50);
});

test('Trabalho noturno de um salário de 2000', () => {
    expect(trabalhoNoturno(2000)).toBe(100);
});

test('Trabalho noturno de um salário de 3000', () => {
    expect(trabalhoNoturno(3000)).toBe(150);
});

test('Trabalho noturno de um salário de 3000.40', () => {
    expect(trabalhoNoturno(3000.40)).toBe(150.02);
});

test('Trabalho noturno de um salário de 4200', () => {
    expect(trabalhoNoturno(4200)).toBe(210);
});