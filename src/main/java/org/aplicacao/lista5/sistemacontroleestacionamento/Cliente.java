package org.aplicacao.lista5.sistemacontroleestacionamento;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String codigo;
    private List<Vaga> vagasAlugadas;

    public Cliente(String nome, String codigo) {
        setNome(nome);
        setCodigo(codigo);
        vagasAlugadas = new ArrayList<>();
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

    public List<Vaga> getVagasAlugadas() {
        return vagasAlugadas;
    }

    public void adicionarVaga(Vaga vaga){
        vagasAlugadas.add(vaga);
    }

    public String listarVagasAlugadas(){
        String listaVagas = "Vagas alugadas do cliente " + nome;
        for(int i = 0 ; i<vagasAlugadas.size();i++){
            listaVagas += "\nConta " + (i+1) + ": R$" + vagasAlugadas.get(i).calcularValorAluguel();
        }
        return listaVagas;
    }
}
