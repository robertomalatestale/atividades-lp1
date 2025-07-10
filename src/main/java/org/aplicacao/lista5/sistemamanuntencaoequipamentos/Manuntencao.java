package org.aplicacao.lista5.sistemamanuntencaoequipamentos;

import java.util.concurrent.ThreadLocalRandom;

public class Manuntencao {
    private Equipamento equipamentoEmManuntencao;
    private int numeroManuntencao;

    public Manuntencao(Equipamento equipamentoEmManuntencao) {
        setEquipamentoEmManuntencao(equipamentoEmManuntencao);
        this.numeroManuntencao = ThreadLocalRandom.current().nextInt(1, 100000);
    }

    public Equipamento getEquipamentoEmManuntencao() {
        return equipamentoEmManuntencao;
    }

    public void setEquipamentoEmManuntencao(Equipamento equipamentoEmManuntencao) {
        if(equipamentoEmManuntencao == null){
            throw new IllegalArgumentException("Precisa associar um equipamento a manuntenção");
        }
        this.equipamentoEmManuntencao = equipamentoEmManuntencao;
    }

    public int getNumeroManuntencao() {
        return numeroManuntencao;
    }
}
