package org.aplicacao.lista2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa vitor = new Pessoa("Vitor",19,80.2,1.78);

    @Test
    void deveLancarExcecaoSeNomeNaoForPreenchido(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> vitor.setNome("  "),"Esperava exceção se nome não fosse preenchido");
    }

    @Test
    void deveLancarExcecaoSeIdadeIgualAZeroOuNegativa(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> vitor.setIdade(0),"Esperava exceção se idade fosse negativa ou igual a 0");
    }

    @Test
    void deveLancarExcecaoSeIdadeForMaiorQue120(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> vitor.setIdade(120.01),"Esperava exceção se idade fosse maior que 120");
    }

    @Test
    void deveArrendodarIdadeSeForEmMeses(){
        vitor.setIdade(0.54);
        assertEquals(0.5,vitor.getIdade());
    }

    @Test
    void deveLancarExcecaoSePesoIgualOuMenorQueZero(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> vitor.setPeso(0),"Esperava exceção se peso igual ou menor que 0");
    }

    @Test
    void deveLancarExcecaoSeAlturaIgualOuMenorQueZero(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> vitor.setAltura(0),"Esperava exceção se altura igual ou menor que 0");
    }

    @Test
    void deveEnvelhecerCorretamente(){
        vitor.envelhecer();
        assertEquals(20,vitor.getIdade());
    }

    @Test
    void deveLancarExcecaoSeTentarCrescerEForMaiorDe21(){
        vitor.setIdade(22);
        IllegalStateException exception = assertThrows(IllegalStateException.class, ()->vitor.crescer(10),"Esperava exceção se tentasse crescer sendo maior de 21 anos");
    }

    @Test
    void deveCalcularCorretamenteAlturaAposCrescer(){
        vitor.crescer(10);
        assertEquals(1.88,vitor.getAltura(),0.01);
    }

    @Test
    void deveLancarExcecaoSeTentarGanharPesoNegativoOuZero(){
        QuantidadeInvalidaException exception = assertThrows(QuantidadeInvalidaException.class,()->vitor.ganharPeso(0),"Esperava exceção se parametro do ganho de peso fosse 0 ou negativo");
    }

    @Test
    void deveCalcularPesoCorretamenteAposGanhoDePeso(){
        vitor.ganharPeso(8);
        assertEquals(88.2,vitor.getPeso());
    }

    @Test
    void deveLancarExcecaoSeTentarPerderPesoNegativoOuZero(){
        QuantidadeInvalidaException exception = assertThrows(QuantidadeInvalidaException.class,()->vitor.perderPeso(0),"Esperava exceção se parametro da perca de peso fosse 0 ou negativo");
    }

    @Test
    void deveCalcularPesoCorretamenteAposPerdaDePeso(){
        vitor.perderPeso(8);
        assertEquals(72.2,vitor.getPeso());
    }

}