const celsiusToKelvin = (x) => {
    if (isNaN(x)) {
        return "Valor Inválido!"
    } else {
        let resultado = (x + 273.15);
        return Number(resultado.toFixed(2));
    }
}

const celsiusToFahrenheit = (x) => {
    if (isNaN(x)) {
        return "Valor Inválido!"
    } else {
        let resultado = ((x * 1.8) + 32);
        return Number(resultado.toFixed(2));
    }
}

const kelvinToCelsius = (x) => {
    if (isNaN(x)) {
        return "Valor Inválido!"
    } else {
        let resultado = (x - 273.15);
        return Number(resultado.toFixed(2));
    }
}

const kelvinToFahrenheit = (x) => {
    if (isNaN(x)) {
        return "Valor Inválido!"
    } else {
        let resultado = (((x - 273.15) * 1.8) + 32);
        return Number(resultado.toFixed(2));
    }
}

const fahrenheitToKelvin = (x) => {
    if (isNaN(x)) {
        return "Valor Inválido!"
    } else {
        let resultado = (((x - 32) / 1.8) + 273.15);
        return Number(resultado.toFixed(2));
    }
}

const fahrenheitToCelsius = (x) => {
    if (isNaN(x)) {
        return "Valor Inválido!"
    } else {
        let resultado = ((x - 32) / 1.8);
        return Number(resultado.toFixed(2));
    }
}

export {celsiusToKelvin, celsiusToFahrenheit, kelvinToCelsius, kelvinToFahrenheit, fahrenheitToKelvin, fahrenheitToCelsius}
//module.export = { celsiusToKelvin, celsiusToFahrenheit, kelvinToCelsius, kelvinToFahrenheit, fahrenheitToKelvin, fahrenheitToCelsius }

