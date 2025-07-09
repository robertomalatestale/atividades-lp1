package org.aplicacao.lista5.sistemavideolocadora;

import java.time.LocalDate;

public class EmprestimoDiferenciado extends Emprestimo{
    protected double valorDiario;

    public EmprestimoDiferenciado(String nomeFilme, int diasAlugados, double valorDiario) {
        super(nomeFilme,diasAlugados);
        setValorDiario(valorDiario);
    }

    public double getValorDiario() {
        return valorDiario;
    }

    public void setValorDiario(double valorDiario) {
        if(valorDiario <=0){
            throw new IllegalArgumentException("Valor diário deve ser positivo");
        }
        this.valorDiario = valorDiario;
    }

    @Override
    public double calculaValor() {
        return valorDiario * diasAlugados;
    }}