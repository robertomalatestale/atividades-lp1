package org.aplicacao.lista5.sistemaarrecadacao;

public abstract class Imovel {
    private Contribuinte dono;


    public Contribuinte getDono() {
        return dono;
    }

    public void setDono(Contribuinte dono) {
        if(dono == null){
            throw new IllegalArgumentException("Dono não pode ser nulo");
        }
        this.dono = dono;
    }

    public abstract double calcularValor();
}
