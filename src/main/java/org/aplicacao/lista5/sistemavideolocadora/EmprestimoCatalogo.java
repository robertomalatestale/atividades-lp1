package org.aplicacao.lista5.sistemavideolocadora;

import java.time.LocalDate;

public class EmprestimoCatalogo extends Emprestimo{


    public EmprestimoCatalogo(String nomeFilme, int diasAlugados, Cliente cliente) {
        super(nomeFilme, diasAlugados, cliente);
    }

    @Override
    public double calculaValor() {
        return diasAlugados * 5.0;
    }}
