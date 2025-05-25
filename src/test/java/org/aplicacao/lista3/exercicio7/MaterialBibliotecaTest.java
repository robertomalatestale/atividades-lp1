package org.aplicacao.lista3.exercicio7;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MaterialBibliotecaTest {

    MaterialBiblioteca materialBiblioteca = new Livro("A Espera de Um Milagre", LocalDate.of(1996,3,28),LocalDate.of(2025,5,25));

    @Test
    void deveLancarExcecaoSeTituloNaoForPreenchido(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> materialBiblioteca.setTitulo("   "));
    }

    @Test
    void deveLancarExcecaoSeDataDePublicacaoForNula(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()-> materialBiblioteca.setDataPublicacao(null));
    }

    @Test
    void deveLancarExcecaoSeDataDeEmprestimoForNula(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()-> materialBiblioteca.setDataEmprestimo(null));
    }

}