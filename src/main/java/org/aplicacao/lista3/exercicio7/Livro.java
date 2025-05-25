package org.aplicacao.lista3.exercicio7;

import java.time.LocalDate;

public class Livro extends MaterialBiblioteca{


    public Livro(String titulo, LocalDate dataPublicacao, LocalDate dataEmprestimo) {
        super(titulo, dataPublicacao, dataEmprestimo);
    }

    @Override
    public int quantidadeDiasQuePodeFicarEmprestado() {
        return 15;
    }
}
