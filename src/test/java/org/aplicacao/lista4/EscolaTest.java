package org.aplicacao.lista4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    Escola escola = new Escola();
    Professor professor = new Professor();
    Escolaridade escolaridade = new Escolaridade();

    @Test
    void deveLancarExcecaoSeDiretorForNulo(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->escola.setDiretor(null));
    }

    @Test
    void deveRetornarEscolaridadeDoDiretor(){
        escolaridade.setNome("Mestrado");
        professor.setEscolaridade(escolaridade);
        escola.setDiretor(professor);
        assertEquals("Mestrado",escola.getEscolaridadeDiretor());
    }

    @Test
    void deveRetornarEscolaridadeDoDiretorCorretamenteCasoNaoTenha(){
        escola.setDiretor(professor);
        assertEquals("Diretor sem escolaridade",escola.getEscolaridadeDiretor());
    }

}