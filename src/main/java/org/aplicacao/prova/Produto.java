package org.aplicacao.prova;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private int qtdeEstoque;
    private Double precoUnit;
    private int estoqueMinimo;
    private int estoqueMaximo;
    private List<String> historico;

    public Produto(String nome, int qtdeEstoque, Double precoUnit, int estoqueMinimo, int estoqueMaximo) {
        this.nome = nome;
        setQtdeEstoque(qtdeEstoque);
        this.precoUnit = precoUnit;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        historico = new ArrayList<String>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        if(qtdeEstoque < 0){
            throw new IllegalArgumentException("Quantidade em estoque não pode ser negativo");
        }
        this.qtdeEstoque = qtdeEstoque;
    }

    public Double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(Double precoUnit) {
        this.precoUnit = precoUnit;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(int estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    public List<String> getHistorico() {
        return historico;
    }


    public void registrarHistorico(String dadosTransacao){
        historico.add(dadosTransacao);
    }

    public String exibirHistorico(){
        return getHistorico().toString();
    }

    public void debitarEstoque(int quantidade){
        if(quantidade <= 0){
            throw new IllegalArgumentException("Informe um valor positivo para debitar");
        }
        setQtdeEstoque(this.qtdeEstoque - quantidade);
    }

    public void creditarEstoque(int quantidade){
        if(quantidade <= 0){
            throw new IllegalArgumentException("Informe um valor positivo para creditar");
        }
        setQtdeEstoque(this.qtdeEstoque + quantidade);
    }

    public String informaSeEstoqueBaixoOuNaoPorTexto(){
        if(this.qtdeEstoque < this.estoqueMinimo){
            return "Estoque baixo";
        } else{
            return "Situação de estoque normal";
        }
    }

    public String informaSeEstoqueExcedenteOuInsuficientePorTexto(int quantidade){
        if(quantidade > this.qtdeEstoque){
            return "Estoque insuficiente";
        }
        else{
            return "Estoque excedente";
        }
    }


    public boolean verificarEstoqueBaixo(){
        informaSeEstoqueBaixoOuNaoPorTexto();
        if(this.qtdeEstoque < this.estoqueMinimo){
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarEstoqueInsuficiente(int quantidade){
        informaSeEstoqueExcedenteOuInsuficientePorTexto(quantidade);
        if(quantidade > this.qtdeEstoque){
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarEstoqueExcedente(int quantidade){
        informaSeEstoqueExcedenteOuInsuficientePorTexto(quantidade);
        if(quantidade + this.qtdeEstoque > this.estoqueMaximo){
            return true;
        } else {
            return false;
        }
    }

    public Double calcularValorVenda(int quantidade){
        return quantidade * this.precoUnit;
    }

    public void vender(String dataVenda, Cliente cliente, int qtdeVendida){
        Venda venda = new Venda(dataVenda,
                cliente,
                new Produto(this.nome,this.qtdeEstoque, this.precoUnit, this.estoqueMinimo, this.estoqueMaximo),
                qtdeVendida);
        if(venda.vender(venda.getProduto(), qtdeVendida)){
            registrarHistorico("Venda do produto " + this.nome);
        }
    }

    public void comprar(String dataCompra, Fornecedor fornecedor, int qtdeCompra, Double precoUnit){
        Compra compra = new Compra(dataCompra,
                new Produto(this.nome,this.qtdeEstoque, this.precoUnit, this.estoqueMinimo, this.estoqueMaximo),
                fornecedor, qtdeCompra, precoUnit);
        if(compra.comprar(compra.getProduto(), qtdeCompra)){
            registrarHistorico("Compra do produto " + this.nome);
        }
    }


}
