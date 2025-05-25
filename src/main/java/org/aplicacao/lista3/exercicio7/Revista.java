package org.aplicacao.lista3.exercicio7;

import java.time.LocalDate;

public class Revista extends MaterialBiblioteca{
    public Revista(String titulo, LocalDate dataPublicacao, LocalDate dataEmprestimo) {
        super(titulo, dataPublicacao, dataEmprestimo);
    }

    @Override
    public int quantidadeDiasQuePodeFicarEmprestado() {
        return 7;
    }
}
