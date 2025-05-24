package org.aplicacao.lista3.exercicio2;

public class FuncionarioComum extends Funcionario{
    public FuncionarioComum(float salarioMensal) {
        super(salarioMensal);
    }

    @Override
    public float calcularPagamento() {
        return this.salarioMensal;
    }
}
