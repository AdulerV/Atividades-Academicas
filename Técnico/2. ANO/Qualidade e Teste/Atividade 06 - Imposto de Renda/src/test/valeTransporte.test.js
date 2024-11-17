//const {ValeTransporte} = require('../util/imposto');
import {ValeTransporte} from "../util/imposto";

test('Vale Transporte de um salário de 1000', () => {
    expect(ValeTransporte(1000)).toBe(30);
});

test('Vale Transporte de um salário de 2000', () => {
    expect(ValeTransporte(2000)).toBe(60);
});

test('Vale Transporte de um salário de 3000', () => {
    expect(ValeTransporte(3000)).toBe(90);
});

test('Vale Transporte de um salário de 3000.40', () => {
    expect(ValeTransporte(3000.40)).toBe(90.01);
});

test('Vale Transporte de um salário de 4200', () => {
    expect(ValeTransporte(4200)).toBe(126);
});