package org.aplicacao.lista5.sistemacontroletransportadora;

import org.aplicacao.lista5.sistemacontrolebancario.ContaBancaria;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String codigo;
    private List<Frete> fretes;

    public Cliente(String nome, String codigo) {
        setNome(nome);
        setCodigo(codigo);
        fretes = new ArrayList<>();
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

    public List<Frete> getFretes() {
        return fretes;
    }

    public void adicionarFrete(Frete frete){
        fretes.add(frete);
    }

    public String listarTodosFretesComValores(){
        String listaFretes = "Fretes do cliente " + nome;
        for(int i = 0 ; i<fretes.size();i++){
            listaFretes += "\nFrete " + (i+1) + ": R$" + fretes.get(i).calcularValorTotalEntrega();
        }
        return listaFretes;
    }
}
