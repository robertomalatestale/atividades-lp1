package org.aplicacao.lista4;

public class Pessoa {
    private String nome;
    private Escolaridade escolaridade;
    private Cidade naturalidade;
    private Estado estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome deve ser preenchido");
        }
        this.nome = nome;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Cidade getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(Cidade naturalidade) {
        this.naturalidade = naturalidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNomeEscolaridade() {
        if (this.escolaridade == null) {
            return "Pessoa sem escolaridade";
        }
        else {
            return this.escolaridade.getNome();
        }
    }
    public String getNomeEstado(){
        if(this.estado == null) {
            return "Pessoa sem estado";
        }else{
            return this.getEstado().getNome();
        }
    }

    public String getNomeCidade(){
        if(this.naturalidade == null){
            return "Pessoa sem naturalidade";
        }
        return this.naturalidade.getNome();
    }
}
