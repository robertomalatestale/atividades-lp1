package org.aplicacao.lista5.sistemavideolocadora;

public class EmprestimoLancamento extends EmprestimoDiferenciado{
    public EmprestimoLancamento(String nomeFilme, int diasAlugados, Cliente cliente, double valorDiario) {
        super(nomeFilme, diasAlugados, cliente, valorDiario);
    }
}
