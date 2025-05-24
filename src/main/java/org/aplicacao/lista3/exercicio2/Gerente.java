package org.aplicacao.lista3.exercicio2;

public class Gerente extends Funcionario{

    private float bonusFixo;

    public Gerente(float salarioMensal, float bonusFixo) {
        super(salarioMensal);
        setBonusFixo(bonusFixo);
    }

    public float getBonusFixo() {
        return bonusFixo;
    }

    public void setBonusFixo(float bonusFixo) {
        if(bonusFixo<=0){
            throw new IllegalArgumentException("Bônus deve ser positivo");
        }
        this.bonusFixo = bonusFixo;
    }

    @Override
    public float calcularPagamento() {
        return this.salarioMensal + this.bonusFixo;
    }
}
