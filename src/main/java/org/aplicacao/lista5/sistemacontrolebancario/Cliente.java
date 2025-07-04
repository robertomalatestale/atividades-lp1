package org.aplicacao.lista5.sistemacontrolebancario;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String codigo;
    private List<ContaBancaria> contas;

    public Cliente(String nome, String codigo) {
        setNome(nome);
        setCodigo(codigo);
        contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome deve ser preenchido");
        }
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<ContaBancaria> getContas() {
        return contas;
    }

    public void adicionarConta(ContaBancaria contaBancaria){
        contas.add(contaBancaria);
    }

    public String listarContasComSaldos(){
        String listaContas = "Contas bancárias de: " + nome;
        for(int i = 0 ; i<contas.size();i++){
            listaContas += "\nConta " + (i+1) + ": R$" + contas.get(i).informarSaldoDisponivel();
        }
        return listaContas;
    }
}
