package org.aplicacao.lista4;

public class Curso {
    private Professor coordenador;
    private TipoEnsino tipoDeEnsino;
    private Escola escola;

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public TipoEnsino getTipoDeEnsino() {
        return tipoDeEnsino;
    }

    public void setTipoDeEnsino(TipoEnsino tipoDeEnsino) {
        if (tipoDeEnsino == null) {
            throw new IllegalArgumentException("Tipo de ensino não pode ser nulo.");
        }
        this.tipoDeEnsino = tipoDeEnsino;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        if (escola == null) {
            throw new IllegalArgumentException("Escola não deve ser nula.");
        }
        this.escola = escola;
    }

    public String getEscolaridadeCoordenador(){
        if (this.coordenador.getEscolaridade() == null) {
            return "Coordenador sem escolaridade";
        } else {
        return this.getCoordenador().getNomeEscolaridade();
        }
    }
}
