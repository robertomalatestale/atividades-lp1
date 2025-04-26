package org.aplicacao.lista2;

public class QuantidadeInvalidaException extends RuntimeException {
    public QuantidadeInvalidaException(){
        super("Quantidade inválida: quantidade não pode ser negativa");
    }
}
