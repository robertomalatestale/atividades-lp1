package org.aplicacao.lista4;

public class Professor extends Pessoa {
    private Curso cursoQueLeciona;

    public Curso getCursoQueLeciona() {
        return cursoQueLeciona;
    }

    public void setCursoQueLeciona(Curso cursoQueLeciona) {
        if (cursoQueLeciona == null) {
            throw new IllegalArgumentException("Curso lecionado não pode ser nulo.");
        }
        this.cursoQueLeciona = cursoQueLeciona;
    }

    public String getTipoDeEnsinoLecionado(){
        return cursoQueLeciona.getTipoDeEnsino().getTipoDeEnsino();
    }

    public String getNomeDiretor(){
        return cursoQueLeciona.getEscola().getDiretor().getNome();
    }

    public String getNomeCoordenador(){
        return cursoQueLeciona.getCoordenador().getNome();
    }
}
