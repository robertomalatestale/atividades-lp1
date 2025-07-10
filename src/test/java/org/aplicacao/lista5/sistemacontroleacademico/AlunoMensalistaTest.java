package org.aplicacao.lista5.sistemacontroleacademico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoMensalistaTest {

    Curso curso = new Curso("INF2004",60,"Curso de Modelagem de Sistemas");
    AlunoMensalista alunoMensalista = new AlunoMensalista("Ronaldo","2024000120","Rua São João", 12, 120, curso);


    @Test
    void deveLancarExcecaoSeNomeNaoPreenchdido(){
        assertThrows(IllegalArgumentException.class, ()-> alunoMensalista.setNome("   "));
    }

    @Test
    void deveLancarExcecaoSeMatriculaNaoPreenchdida(){
        assertThrows(IllegalArgumentException.class, ()-> alunoMensalista.setMatricula("   "));
    }

    @Test
    void deveLancarExcecaoSeNumeroDeParcelasNegativoOuZero(){
        assertThrows(IllegalArgumentException.class, ()-> alunoMensalista.setNumeroDeParcelas(0));
    }

    @Test
    void deveLancarExcecaoSeMensalidadeNegativaOuZero(){
        assertThrows(IllegalArgumentException.class, ()-> alunoMensalista.setValorMensalidade(0));
    }

    @Test
    void deveLancarExcecaoSeCursoNaoPreenchido(){
        assertThrows(IllegalArgumentException.class, ()-> alunoMensalista.setCurso(null));
    }


}