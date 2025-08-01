package org.aplicacao.prova;

public class Compra extends Transacao{
    private Fornecedor fornecedor;
    private Double precoUnit;


    public Compra(String dataCompra, Produto produto, Fornecedor fornecedor, int qtdeCompra, Double precoUnit) {
        super(dataCompra, qtdeCompra, produto);
        setFornecedor(fornecedor);
        setPrecoUnit(precoUnit);
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        if(fornecedor == null){
            throw new IllegalArgumentException("Compra deve ter um fornecedor associado");
        }
        this.fornecedor = fornecedor;
    }

    public Double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(Double precoUnit) {
        this.precoUnit = precoUnit;
    }

    public boolean comprar(Produto produto, int qtdeCompra){
        if(qtdeCompra <= 0){
            throw new IllegalArgumentException("Quantidade comprada deve ser positiva");
        }
        if(produto.verificarEstoqueExcedente(qtdeCompra)){
            return false;
        } else{
            produto.creditarEstoque(qtdeCompra);
            return true;
        }
    }


}
