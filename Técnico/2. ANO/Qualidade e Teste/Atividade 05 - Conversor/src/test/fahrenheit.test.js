const { fahrenheitToCelsius, fahrenheitToKelvin } = require('../util/conversor.js');

//Testes com valor positivo, negativo, decimal, zero e letra

//fahrenheitToCelsius:
test('verificar se 212°F é igual a 100°C', () => {
    expect(fahrenheitToCelsius(212)).toBe(100.00);
});

test('verificar se -13°F é igual a -25°C', () => {
    expect(fahrenheitToCelsius(-13)).toBe(-25.00);
});

test('verificar se 72.95°F é igual a 22.75°C', () => {
    expect(fahrenheitToCelsius(72.95)).toBe(22.75);
});

test('verificar se 0°F é aproximadamente -17.8°C', () => {
    expect(fahrenheitToCelsius(0)).toBe(-17.78);
});

test('verificar valores tipo string', () => {
    expect(fahrenheitToCelsius("letra")).toBe("Valor Inválido!");
});


//fahrenheitToKelvin
test('verificar se 212°F é igual a 373.15K', () => {
    expect(fahrenheitToKelvin(212)).toBe(373.15);
});

test('verificar se -13°F é igual a 248.15K', () => {
    expect(fahrenheitToKelvin(-13)).toBe(248.15);
});

test('verificar se 72.95°F é igual a 295.9K', () => {
    expect(fahrenheitToKelvin(72.95)).toBe(295.90);
});

test('verificar se 0°F é aproximadamente 255.373K', () => {
    expect(fahrenheitToKelvin(0)).toBe(255.37);
});

test('verificar valores tipo string', () => {
    expect(fahrenheitToKelvin("letra")).toBe("Valor Inválido!");
});
