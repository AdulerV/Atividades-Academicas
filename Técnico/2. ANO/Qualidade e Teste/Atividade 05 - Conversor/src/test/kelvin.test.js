const { kelvinToCelsius, kelvinToFahrenheit } = require('../util/conversor.js');

//Testes com valor positivo, negativo, decimal, zero e letra

//kelvinToCelsius:
test('verificar se 373K é aproximadamente 100°C', () => {
    expect(kelvinToCelsius(373)).toBe(99.85);
});

test('verificar se -13K é igual -286.15°C', () => {
    expect(kelvinToCelsius(-13)).toBe(-286.15);
});

test('verificar se 295.9K é igual a 22.75°C', () => {
    expect(kelvinToCelsius(295.9)).toBe(22.75);
});

test('verificar se 0K é igual a -273.15°C', () => {
    expect(kelvinToCelsius(0)).toBe(-273.15);
});

test('verificar valores tipo string', () => {
    expect(kelvinToCelsius("letra")).toBe("Valor Inválido!");
});


//kelvinToFahrenheit
test('verificar se 373K é igual 211.73°F', () => {
    expect(kelvinToFahrenheit(373)).toBe(211.73);
});

test('verificar se -13K é igual -483.07°F', () => {
    expect(kelvinToFahrenheit(-13)).toBe(-483.07);
});

test('verificar se 295.9K é igual a 72.95°F', () => {
    expect(kelvinToFahrenheit(295.9)).toBe(72.95);
});

test('verificar se 0K é igual a -459.67°F', () => {
    expect(kelvinToFahrenheit(0)).toBe(-459.67);
});

test('verificar valores tipo string', () => {
    expect(kelvinToFahrenheit("letra")).toBe("Valor Inválido!");
});