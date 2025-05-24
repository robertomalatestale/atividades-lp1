package org.aplicacao.lista3.exercicio2;

public abstract class Funcionario {
    protected float salarioMensal;

    public Funcionario(float salarioMensal) {
        setSalarioMensal(salarioMensal);
    }

    public float getSalarioMensal() {
        return this.salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        if(salarioMensal<=0){
            throw new IllegalArgumentException("Salário deve ser positivo");
        }
        this.salarioMensal = salarioMensal;
    }

    public abstract float calcularPagamento();
}
