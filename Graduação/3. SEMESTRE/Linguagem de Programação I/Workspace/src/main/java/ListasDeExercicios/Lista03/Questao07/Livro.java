package ListasDeExercicios.Lista03.Questao07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Livro extends MaterialBiblioteca {
    Livro(String titulo) {
        super(titulo);
    }

    Livro(String titulo, String dataPublicacao) {
        super(titulo, dataPublicacao);
    }

    @Override
    public String calcularDataDevolucao(String dataEmprestimo) {
        if (!verificarData(dataEmprestimo)) {
            throw new IllegalArgumentException("Data de empréstimo inválida!");
        }

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("pt", "BR"));
        LocalDate dataLocal = LocalDate.parse(dataEmprestimo, formato);
        dataLocal = dataLocal.plusDays(15);
        return dataLocal.format(formato);
    }
}