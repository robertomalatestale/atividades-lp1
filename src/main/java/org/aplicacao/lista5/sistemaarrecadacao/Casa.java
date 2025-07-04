package org.aplicacao.lista5.sistemaarrecadacao;

public class Casa extends Imovel{

    private double metragemQuadradaTerreno;
    private double metragemQuadradaConstrucao;

    public Casa(double metragemQuadradaTerreno, double metragemQuadradaConstrucao) {
        setMetragemQuadradaTerreno(metragemQuadradaTerreno);
        setMetragemQuadradaConstrucao(metragemQuadradaConstrucao);
    }

    public double getMetragemQuadradaTerreno() {
        return metragemQuadradaTerreno;
    }

    public void setMetragemQuadradaTerreno(double metragemQuadradaTerreno) {
        if(metragemQuadradaTerreno <=0){
            throw new IllegalArgumentException("Valor inválido! Metragem quadrada deve ser positiva");
        }
        this.metragemQuadradaTerreno = metragemQuadradaTerreno;
    }

    public double getMetragemQuadradaConstrucao() {
        return metragemQuadradaConstrucao;
    }

    public void setMetragemQuadradaConstrucao(double metragemQuadradaConstrucao) {
        if(metragemQuadradaConstrucao <=0){
            throw new IllegalArgumentException("Valor inválido! Metragem quadrada deve ser positiva");
        }
        if(metragemQuadradaConstrucao > this.metragemQuadradaTerreno){
            throw new IllegalArgumentException("Metragem construída não pode ser maior que a metragem disponível do terreno");
        }
        this.metragemQuadradaConstrucao = metragemQuadradaConstrucao;
    }

    @Override
    public double calcularValor() {
        return 30 * metragemQuadradaTerreno + 50 * metragemQuadradaConstrucao;
    }
}
