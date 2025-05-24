package org.aplicacao.lista3.exercicio8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {
    Veiculo veiculo = new Carro("Teste","Teste",1);

    @Test
    void deveLancarExcecaoSeMarcaNaoForPreenchida(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> veiculo.setMarca("  "));
    }

    @Test
    void deveLancarExcecaoSeModeloNaoForPreenchido(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> veiculo.setModelo("  "));
    }

    @Test
    void deveLancarExcecaoSePrecoBaseForNegativoOuZero(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> veiculo.setPrecoBase(0));
    }

}