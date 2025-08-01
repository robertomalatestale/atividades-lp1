package org.aplicacao.prova;

public class Venda extends Transacao {
    private Cliente cliente;

    public Venda(String dataVenda, Cliente cliente, Produto produto, int qtdeVendida) {
        super(dataVenda, qtdeVendida, produto);
        setCliente(cliente);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if(cliente == null){
            throw new IllegalArgumentException("Venda deve ter um cliente associado");
        }
        this.cliente = cliente;
    }

    public boolean vender(Produto produto, int qtdeVendida){
        if(qtdeVendida <= 0){
            throw new IllegalArgumentException("Quantidade vendida deve ser positiva");
        }
        if(produto.verificarEstoqueInsuficiente(qtdeVendida)){
            return false;
        } else{
            produto.debitarEstoque(qtdeVendida);
            produto.verificarEstoqueBaixo();
            return true;
        }
    }
}
