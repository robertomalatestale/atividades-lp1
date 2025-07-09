package org.aplicacao.lista5.sistemavideolocadora;

import java.time.LocalDate;

public class EmprestimoCatalogo extends Emprestimo{


    public EmprestimoCatalogo(String nomeFilme, int diasAlugados) {
        super(nomeFilme, diasAlugados);
    }

    @Override
    public double calculaValor() {
        return diasAlugados * 5.0;
    }}
