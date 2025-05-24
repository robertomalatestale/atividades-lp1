package org.aplicacao.lista3.exercicio2;

import org.aplicacao.lista3.exercicio3.Empresa;

public class Diretor extends Funcionario{
    private float participacaoLucros;
    private Empresa empresa = new Empresa();

    public Diretor(float salarioMensal, float participacaoLucros) {
        super(salarioMensal);
        this.participacaoLucros = participacaoLucros;
        Empresa empresa = new Empresa();
    }

    public float getParticipacaoLucros() {
        return participacaoLucros;
    }

    public void setParticipacaoLucros(float participacaoLucros) {
        if (participacaoLucros <= 0){
            throw new IllegalArgumentException("Participação nos lucros deve ser positiva");
        }
        this.participacaoLucros = participacaoLucros;
    }


    @Override
    public float calcularPagamento() {
        return this.salarioMensal + (this.participacaoLucros/100 * empresa.getLucroTotal());
    }
}
