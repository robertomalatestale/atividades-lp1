package org.aplicacao.lista1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    Usuario roberto = new Usuario("Roberto",'M');
    Usuario ana = new Usuario("Ana",'F');

    @Test
    public void deveCalcularContaDeLuz() {
        assertEquals(114.9792,roberto.calculaContaEnergiaEletrica(812),0.0001);
    }

    @Test
    public void deveCalcularConsumoDeCombustivel() {
        assertEquals(20,roberto.calculaMediaCombustivel(500,25));
    }

    @Test
    public void deveCalcularImc(){

    }
}