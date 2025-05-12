package ListasDeExercicios.ListasExtras.Lista01.Questao01;

public class Temperatura {
    float valor;
    String unidadeOrigem;

    Temperatura() {
        valor = 0;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getUnidadeOrigem() {
        return unidadeOrigem;
    }

    public void setUnidadeOrigem(String unidadeOrigem) {
        final String UNIDADE_ORIGEM = unidadeOrigem.toLowerCase();

        if(!UNIDADE_ORIGEM.equals("celsius") && !UNIDADE_ORIGEM.equals("fahrenheit") && !UNIDADE_ORIGEM.equals("kelvin")) {
            throw new IllegalArgumentException("Unidade de origem inválida!");
        }
        this.unidadeOrigem = UNIDADE_ORIGEM;
    }

    public float converterCelsiusParaFahrenheit() {
        if(!unidadeOrigem.equals("celsius")) {
            throw new IllegalArgumentException("A unidade de origem está incorreta!");
        }
        return this.valor * 1.8f + 32;
    }

    public float converterCelsiusParaKelvin() {
        if(!unidadeOrigem.equals("celsius")) {
            throw new IllegalArgumentException("A unidade de origem está incorreta!");
        }
        return this.valor + 273.15f;
    }

    public float converterFahrenheitParaCelsius() {
        if(!unidadeOrigem.equals("fahrenheit")) {
            throw new IllegalArgumentException("A unidade de origem está incorreta!");
        }
        return (this.valor - 32) / 1.8f;
    }

    public float converterFahrenheitParaKelvin() {
        if(!unidadeOrigem.equals("fahrenheit")) {
            throw new IllegalArgumentException("A unidade de origem está incorreta!");
        }
        return (this.valor + 459.67f) * 5/9;
    }

    public float converterKelvinParaCelsius() {
        if(!unidadeOrigem.equals("kelvin")) {
            throw new IllegalArgumentException("A unidade de origem está incorreta!");
        }
        return this.valor - 273.15f;
    }

    public float converterKelvinParaFahrenheit() {
        if(!unidadeOrigem.equals("kelvin")) {
            throw new IllegalArgumentException("A unidade de origem está incorreta!");
        }
        return this.valor * 9/5f - 459.67f;
    }

    public String exibirConversao() {
        switch (this.unidadeOrigem) {
            case "celsius":
                return "Fahrenheit: " + String.format("%.2f", converterCelsiusParaFahrenheit()) +
                        " - Kelvin: " + String.format("%.2f", converterCelsiusParaKelvin());
            case "fahrenheit":
                return "Celsius: " + String.format("%.2f", converterFahrenheitParaCelsius()) +
                        " - Kelvin: " + String.format("%.2f", converterFahrenheitParaKelvin());
            case "kelvin":
                return "Celsius: " + String.format("%.2f", converterKelvinParaCelsius()) +
                        " - Fahrenheit: " + String.format("%.2f", converterKelvinParaFahrenheit());
            default:
                return "Unidade de origem não encontrada.";
        }
    }
}
