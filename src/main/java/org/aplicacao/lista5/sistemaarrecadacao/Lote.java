package org.aplicacao.lista5.sistemaarrecadacao;

public class Lote extends Imovel{

    private double metragemQuadradaTerreno;

    public double getMetragemQuadradaTerreno() {
        return metragemQuadradaTerreno;
    }

    public void setMetragemQuadradaTerreno(double metragemQuadradaTerreno) {
        if(metragemQuadradaTerreno <=0){
            throw new IllegalArgumentException("Valor inválido! Metragem quadrada deve ser positiva");
        }
        this.metragemQuadradaTerreno = metragemQuadradaTerreno;
    }

    @Override
    public double calcularValor() {
        return 30 * metragemQuadradaTerreno;
    }
}
