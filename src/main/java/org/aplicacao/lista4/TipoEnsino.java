package org.aplicacao.lista4;

public class TipoEnsino {
    private String tipoDeEnsino;

    public TipoEnsino(String tipoDeEnsino) {
        setTipoDeEnsino(tipoDeEnsino);
    }

    public String getTipoDeEnsino() {
        return tipoDeEnsino;
    }

    public void setTipoDeEnsino(String tipoDeEnsino) {
        if(tipoDeEnsino.trim().isEmpty()){
            throw new IllegalArgumentException("Deve preencher o tipo de ensino");
        }
        this.tipoDeEnsino = tipoDeEnsino;
    }
}
