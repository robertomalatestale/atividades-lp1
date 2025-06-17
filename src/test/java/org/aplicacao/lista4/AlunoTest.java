package org.aplicacao.lista4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {
    Aluno aluno = new Aluno();
    Estado estado = new Estado();

    @Test
    void deveRetornarNomeEstado(){
        estado.setNome("Amazonas");
        aluno.setEstado(estado);
        assertEquals("Amazonas", aluno.getNomeEstado());
    }

    @Test
    void deveRetornarAlunoSemEstado(){
        aluno.setEstado(null);
        assertEquals("Pessoa sem estado", aluno.getNomeEstado());
    }

    @Test
    void deveLancarExcecaoSeCursoForNulo(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()-> aluno.setCurso(null));
    }

    @Test
    void deveRetornarNomeDoCoordenadorDoCursoCorretamente(){
        Curso curso = new Curso();
        Professor professor = new Professor();
        professor.setNome("Emerson");
        curso.setCoordenador(professor);
        aluno.setCurso(curso);
        assertEquals("Emerson",aluno.getCoordenadorDoCurso());
    }



}