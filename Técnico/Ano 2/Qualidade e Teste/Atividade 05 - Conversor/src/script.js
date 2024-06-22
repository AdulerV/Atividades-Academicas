import { celsiusToFahrenheit, celsiusToKelvin, kelvinToCelsius, kelvinToFahrenheit, fahrenheitToCelsius, fahrenheitToKelvin } from "./util/conversor.js"

let btn = document.querySelector(".container button")
let resultado = document.querySelectorAll(".container li")
let alerta = document.querySelector(".container span")
let form = document.querySelector(".container")

btn.onclick = () => {

    let celsius = parseFloat(document.querySelector("#celcius").value)
    let kelvin = parseFloat(document.querySelector("#kelvin").value)
    let fahrenheit = parseFloat(document.querySelector("#fahrenheit").value)

    if (isNaN(celsius) || isNaN(kelvin) || isNaN(fahrenheit)) {
        alerta.innerHTML = "Informe Valores Corretos";
    } else {
        form.style.height = '650px'
        form.style.transition = '70ms'
        alerta.innerHTML = "Resultados:";
        resultado[0].innerHTML = `Celsius para Fahrenheit: ${celsiusToFahrenheit(celsius)}`;
        resultado[1].innerHTML = `Celsius para Kelvin: ${celsiusToKelvin(celsius)}`;
        resultado[2].innerHTML = `Kelvin para Celcius: ${kelvinToCelsius(kelvin)}`;
        resultado[3].innerHTML = `Kelvin para Fahrenheit: ${kelvinToFahrenheit(kelvin)}`;
        resultado[4].innerHTML = `Fahrenheit para Celcius: ${fahrenheitToCelsius(fahrenheit)}`;
        resultado[5].innerHTML = `Fahrenheit para Kelvin: ${fahrenheitToKelvin(fahrenheit)}`;
    }
}


/*
btn.onclick = () => {

    let celsius = parseFloat(document.querySelector("#celcius").value)
    let kelvin = parseFloat(document.querySelector("#kelvin").value)
    let fahrenheit = parseFloat(document.querySelector("#fahrenheit").value)

    if (isNaN(celsius) || isNaN(kelvin) || isNaN(fahrenheit)) {
        alert("Informe todos os valores");
    } else {
        resultado[0].innerHTML = `Celsius: ${celsius}`;
        resultado[1].innerHTML = `Kelvin: ${celsiusToKelvin(celsius)}`;
        resultado[2].innerHTML = `Fahrenheit: ${(celsiusToFahrenheit(celsius))}`;
    }
}


*/