const { celsiusToKelvin, celsiusToFahrenheit } = require('../util/conversor.js');

//Testes com valor positivo, negativo, decimal, zero e letra

//celsiusToKelvin:
test('verificar se 25°C é igual a 298.15K', () => {
    expect(celsiusToKelvin(25)).toBe(298.15);
});

test('verificar se -15°C é igual a 258.15K', () => {
    expect(celsiusToKelvin(-15)).toBe(258.15);
});

test('verificar se 22.75°C é igual a 295.9K', () => {
    expect(celsiusToKelvin(22.75)).toBe(295.90);
});

test('verificar se 0°C é igual a 273.15K', () => {
    expect(celsiusToKelvin(0)).toBe(273.15);
});

test('verificar valores tipo string', () => {
    expect(celsiusToKelvin("letra")).toBe("Valor Inválido!");
});


//celsiusToFahrenheit
test('verificar se 25°C é igual a 77°F', () => {
    expect(celsiusToFahrenheit(25)).toBe(77.00);
});

test('verificar se -15°C é igual a 5°F', () => {
    expect(celsiusToFahrenheit(-25)).toBe(-13.00);
});

test('verificar se 22.75°C é igual a 72.95°F', () => {
    expect(celsiusToFahrenheit(22.75)).toBe(72.95);
});

test('verificar se 0°C é igual a 32°F', () => {
    expect(celsiusToFahrenheit(0)).toBe(32.00);
});

test('verificar valores tipo string', () => {
    expect(celsiusToFahrenheit("letra")).toBe("Valor Inválido!");
});
