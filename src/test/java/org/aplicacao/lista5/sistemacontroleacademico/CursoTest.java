package org.aplicacao.lista5.sistemacontroleacademico;

import org.aplicacao.lista5.sistemaarrecadacao.Contribuinte;
import org.aplicacao.lista5.sistemacontrolebancario.ContaBancaria;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    Curso curso = new Curso("INF2004",60,"Curso de Modelagem de Sistemas");

    @Test
    void deveLancarExcecaoSeCargaHorarioNegativaOuZero(){
        assertThrows(IllegalArgumentException.class, ()-> curso.setCargaHoraria(0));
    }

    @Test
    void deveInicializarListaDeAlunosCorretamente(){
        assertEquals(0,(curso.getAlunos().size()));
    }

    @Test
    void deveAdicionarAlunosNoCursoCorretamente(){
        Aluno aluno = new AlunoBolsistaParcial("Rogerio","2024000313", "Rua Doze" , 120, 120, curso, 50);
        curso.registrarAlunoNoCurso(aluno);
        List<Aluno> list = new ArrayList<Aluno>();
        list.add(aluno);
        assertEquals(list,curso.getAlunos());
    }

    @Test
    void deveListarAlunosDoCursoComValoresMensalidade(){
        Aluno alunoBolsistaParcial = new AlunoBolsistaParcial("Rogerio","2024000313", "Rua Doze" , 120, 120, curso, 50);
        Aluno alunoMensalista = new AlunoMensalista("Ronaldo","2024000120","Rua São João", 12, 120, curso);
        curso.registrarAlunoNoCurso(alunoBolsistaParcial);
        curso.registrarAlunoNoCurso(alunoMensalista);
        assertEquals("Aluno: Rogerio Matrícula: 2024000313 Valor da mensalidade: R$60.0\n" +
                "Aluno: Ronaldo Matrícula: 2024000120 Valor da mensalidade: R$120.0\n",curso.listarAlunosComValorDasMensalidades());
    }

}