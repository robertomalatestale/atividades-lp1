package org.aplicacao.lista5.sistemavideolocadora;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String codigo;
    private List<Emprestimo> emprestimos;

    public Cliente(String nome, String codigo) {
        setNome(nome);
        setCodigo(codigo);
        emprestimos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome deve ser preenchido");
        }
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    }

    public String listarEmprestimosComValores(){
        String listaEmprestimos = "Empréstimos do cliente: " + nome;
        for(int i = 0 ; i<emprestimos.size();i++){
            listaEmprestimos += "\nEmpréstimo " + emprestimos.get(i).getNomeFilme() + ": R$" + emprestimos.get(i).calculaValor();
        }
        return listaEmprestimos;
    }
}
