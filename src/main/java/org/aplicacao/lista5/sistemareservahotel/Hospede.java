package org.aplicacao.lista5.sistemareservahotel;

import java.util.ArrayList;
import java.util.List;

public class Hospede {
    private String nome;
    private String codigo;
    private List<Reserva> reservas;

    public Hospede(String nome, String codigo) {
        setNome(nome);
        setCodigo(codigo);
        reservas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome deve ser preenchido");
        }
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void adicionarReserva(Reserva reserva){
        reservas.add(reserva);
    }

    public String mostrarValorDeTodasReservas(){
        String listaReservas = "Reservas de " + nome;
        for(int i = 0 ; i<reservas.size();i++){
            listaReservas += "\nReserva " + (i+1) + ": R$" + reservas.get(i).getQuarto().getValorDaReserva();
        }
        return listaReservas;
    }
}
