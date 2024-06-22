//const {impostoRenda} = require('../util/imposto');
import {impostoRenda} from "../util/imposto";

test('Imposto de renda de um salário de 1000', () => {
    expect(impostoRenda(1000)).toBe("Não Paga Imposto");
});

test('Imposto de renda de um salário de 2000', () => {
    expect(impostoRenda(2000)).toBe("Seu imposto de renda é de 8%, logo, Você pagará 160 do seu salário.");
});

test('Imposto de renda de um salário de 3000', () => {
    expect(impostoRenda(3000)).toBe("Seu imposto de renda é de 15%, logo, Você pagará 450 do seu salário.");
});

test('Imposto de renda de um salário de 4200', () => {
    expect(impostoRenda(4200)).toBe("Seu imposto de renda é de 15%, logo, Você pagará 630 do seu salário.");
});

test('Imposto de renda de um salário de 5000', () => {
    expect(impostoRenda(5000)).toBe("Seu imposto de renda é de 27%, logo, Você pagará 1350 do seu salário.");
});