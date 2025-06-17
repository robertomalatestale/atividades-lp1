package org.aplicacao.lista4;

public class Aluno extends Pessoa{
    private Curso curso;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        if (curso == null) {
            throw new IllegalArgumentException("Curso não pode ser nulo.");
        }
        this.curso = curso;
    }

    public String getCoordenadorDoCurso(){
        return curso.getCoordenador().getNome();
    }
}
