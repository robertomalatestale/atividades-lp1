package org.aplicacao.lista5.sistemacontroleacademico;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String codigo;
    private String descricao;
    private int cargaHoraria;
    private List<Aluno> alunos;

    public Curso(String codigo, int cargaHoraria, String descricao) {
        setCodigo(codigo);
        setCargaHoraria(cargaHoraria);
        setDescricao(descricao);
        alunos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if(cargaHoraria <= 0){
            throw new IllegalArgumentException("Carga horária deve ser positiva");
        }
        this.cargaHoraria = cargaHoraria;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void registrarAlunoNoCurso(Aluno aluno){
        alunos.add(aluno);
    }

    public String listarAlunosComValorDasMensalidades(){
        String listaAlunos = "";
        for(int i = 0 ; i<alunos.size();i++){
            listaAlunos += "Aluno: " + alunos.get(i).getNome() + " Matrícula: " + alunos.get(i).getMatricula() +
                    " Valor da mensalidade: R$" + alunos.get(i).getValorMensalidade() + "\n";
        }
        return listaAlunos;
    }
    }
