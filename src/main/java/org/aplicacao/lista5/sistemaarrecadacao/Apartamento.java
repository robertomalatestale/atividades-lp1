package org.aplicacao.lista5.sistemaarrecadacao;

public class Apartamento extends Imovel{
    private double metragemQuadradaApartamento;
    private int andar;

    public Apartamento(double metragemQuadradaApartamento, int andar) {
        setMetragemQuadradaApartamento(metragemQuadradaApartamento);
        setAndar(andar);
    }

    public double getMetragemQuadradaApartamento() {
        return metragemQuadradaApartamento;
    }

    public void setMetragemQuadradaApartamento(double metragemQuadradaApartamento) {
        if(metragemQuadradaApartamento <=0){
            throw new IllegalArgumentException("Valor inválido! Metragem quadrada deve ser positiva");
        }
        this.metragemQuadradaApartamento = metragemQuadradaApartamento;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        if(andar <=0){
            throw new IllegalArgumentException("Apartamento não pode estar no térreo ou no subsolo");
        }
        this.andar = andar;
    }

    @Override
    public double calcularValor() {
        if(andar <= 5){
        return 40 * metragemQuadradaApartamento - andar * (0.1 * 40 * metragemQuadradaApartamento);
        }
        return 40 * metragemQuadradaApartamento - 5 * (0.1 * 40 * metragemQuadradaApartamento);
    }
}
