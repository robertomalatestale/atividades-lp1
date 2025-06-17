package org.aplicacao.lista4;

public class Escola {
    private Professor diretor;

    public Professor getDiretor() {
        return diretor;
    }

    public void setDiretor(Professor diretor) {
        if(diretor == null){
            throw new IllegalArgumentException("Diretor não pode ser nulo.");
        }
        this.diretor = diretor;
    }

    public String getEscolaridadeDiretor(){
        if (this.diretor.getEscolaridade() == null) {
            return "Diretor sem escolaridade";
        } else {
            return this.getDiretor().getNomeEscolaridade();
        }
    }
}
