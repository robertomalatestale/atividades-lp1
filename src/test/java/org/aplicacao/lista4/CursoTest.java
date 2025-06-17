package org.aplicacao.lista4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    Professor coordenador = new Professor();
    Curso curso = new Curso();
    Escolaridade escolaridade = new Escolaridade();

    @Test
    void deveImprimirEscolaridadeDoCoordenador(){
        curso.setCoordenador(coordenador);
        escolaridade.setNome("Doutorado");
        curso.getCoordenador().setEscolaridade(escolaridade);
        assertEquals("Doutorado", curso.getEscolaridadeCoordenador());
    }

    @Test
    void deveImprimirCoordenadorSemEscolaridade(){
        curso.setCoordenador(coordenador);
        curso.getCoordenador().setEscolaridade(null);
        assertEquals("Coordenador sem escolaridade", curso.getEscolaridadeCoordenador());
    }

    @Test
    void deveLancarExcecaoSeTipoDeEnsinoForNulo(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->curso.setTipoDeEnsino(null));
    }

    @Test
    void deveLancarExcecaoSeEscolaForNula(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->curso.setEscola(null));
    }

}