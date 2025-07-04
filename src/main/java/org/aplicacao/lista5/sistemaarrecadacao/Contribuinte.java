package org.aplicacao.lista5.sistemaarrecadacao;

import java.util.ArrayList;
import java.util.List;

public class Contribuinte {
    private String nome;
    private String codigo;
    private List<Imovel> imoveis;

    public Contribuinte(String nome, String codigo) {
        imoveis = new ArrayList<>();
        setNome(nome);
        setCodigo(codigo);
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

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void adicionarImovel(Imovel imovel){
        imoveis.add(imovel);
    }

    public String listarImoveisComPrecos(){
        String listaImoveis = "Imoveis do contribuinte " + nome;
        for(int i = 0 ; i<imoveis.size();i++){
            listaImoveis += "\nImovel " + (i+1) + ": R$" + imoveis.get(i).calcularValor();
        }
        return listaImoveis;
    }


}
