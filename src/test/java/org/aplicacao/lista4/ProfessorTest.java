package org.aplicacao.lista4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetornarNomeEscolaridade() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Doutorado");
        Professor professor = new Professor();
        professor.setEscolaridade(escolaridade);
        assertEquals("Doutorado", professor.getNomeEscolaridade());
    }

    @Test
    void deveRetornarPessoaSemEscolaridade() {
        Professor professor = new Professor();
        assertEquals("Pessoa sem escolaridade", professor.getNomeEscolaridade());

    }
    @Test
    void deveRetornarPessoaSemNaturalidade(){
        Professor professor = new Professor();
        assertEquals("Pessoa sem naturalidade", professor.getNomeCidade());
    }

    @Test
    void deveRetornarNaturalidadeProfessor(){
        Professor professor = new Professor();
        Estado estado = new Estado();
        Cidade cidade = new Cidade(estado);
        cidade.setNome("Juiz de Fora");
        professor.setNaturalidade(cidade);
        assertEquals("Juiz de Fora",professor.getNomeCidade());

    }
    @Test
    void deveLancarExcecaoSeCursoForNulo(){
        Professor professor = new Professor();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()-> professor.setCursoQueLeciona(null));
    }

    @Test
    void deveRetornarTipoDeEnsinoLecionadoCorretamente(){
        Professor professor = new Professor();
        Curso curso = new Curso();
        TipoEnsino tipoEnsino = new TipoEnsino("Ensino Superior");
        curso.setTipoDeEnsino(tipoEnsino);
        professor.setCursoQueLeciona(curso);
        assertEquals("Ensino Superior",professor.getTipoDeEnsinoLecionado());
    }

    @Test
    void deveRetornarNomeDiretorDaEscolaQueLecionaCorretamente(){
        Professor professor1 = new Professor();
        Professor professor2 = new Professor();
        professor2.setNome("Ricardo");
        Curso curso = new Curso();
        Escola escola = new Escola();
        escola.setDiretor(professor2);
        curso.setEscola(escola);
        professor1.setCursoQueLeciona(curso);
        assertEquals("Ricardo",professor1.getNomeDiretor());
    }

    @Test
    void deveRetornarNomeCoordenadorDoCursoQueLecionaCorretamente(){
        Professor professor1 = new Professor();
        Professor professor2 = new Professor();
        professor2.setNome("Ricardo");
        Curso curso = new Curso();
        curso.setCoordenador(professor2);
        professor1.setCursoQueLeciona(curso);
        assertEquals("Ricardo",professor1.getNomeCoordenador());
    }
}