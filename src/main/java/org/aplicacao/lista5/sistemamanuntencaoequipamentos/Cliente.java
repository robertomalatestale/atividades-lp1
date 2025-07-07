package org.aplicacao.lista5.sistemamanuntencaoequipamentos;

import org.aplicacao.lista5.sistemacontrolebancario.ContaBancaria;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String codigo;
    private List<Manuntencao> equipamentosEmManuntecao;

    public Cliente(String nome, String codigo) {
        setNome(nome);
        setCodigo(codigo);
        equipamentosEmManuntecao = new ArrayList<>();
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

    public List<Manuntencao> getEquipamentosEmManuntecao() {
        return equipamentosEmManuntecao;
    }

    public void adicionarEquipamentoEmManuntencao(Manuntencao manuntencao){
        equipamentosEmManuntecao.add(manuntencao);
    }

    public String consultarManuntencoesComValores(){
        String listaManuntencoes = "Manuntencoes registradas do cliente " + nome;
        for(int i = 0 ; i<equipamentosEmManuntecao.size();i++){
            listaManuntencoes += "\nImovel " + (i+1) + ": R$" + equipamentosEmManuntecao.get(i).getEquipamentoEmManuntencao().getValorManuntencao();
        }
        return listaManuntencoes;
    }
}
