package org.aplicacao.lista5.sistemacontroleacademico;

public class AlunoBolsistaIntegral extends Aluno {
    public AlunoBolsistaIntegral(String nome, String matricula, String endereco, int numeroDeParcelas) {
        super(nome, matricula, endereco, numeroDeParcelas);
    }

    @Override
    public double getValorMensalidade() {
        return 0.0;
    }}
