package org.aplicacao.lista4;

public class Cidade {
    private Estado estado;
    private String nome;

    public Cidade(Estado estado) {
        this.setEstado(estado);
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        if (estado == null) {
            throw new IllegalArgumentException("Estado invalido");
        }
        this.estado = estado;
    }

    public String getNomeEstado() {
        return this.estado.getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
