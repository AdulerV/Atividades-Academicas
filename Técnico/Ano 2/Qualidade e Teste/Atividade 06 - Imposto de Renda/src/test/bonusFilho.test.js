//const {bonusFilho} = require('../util/imposto');
import {bonusFilho} from "../util/imposto";

test('0 filhos', () => {
    expect(bonusFilho(0)).toBe(0);
});

test('1 filho', () => {
    expect(bonusFilho(1)).toBe(50);
});

test('2 filhos', () => {
    expect(bonusFilho(2)).toBe(100);
});

test('3 filhos', () => {
    expect(bonusFilho(3)).toBe(150);
});

test('4 filhos', () => {
    expect(bonusFilho(4)).toBe(150);
});