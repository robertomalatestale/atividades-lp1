package org.aplicacao.lista1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class UsuarioTest {
    Usuario roberto = new Usuario("Roberto",'M',1.82,72);
    Usuario ana = new Usuario("Ana",'F',1.68,59);
    Usuario testeIMCHomem = new Usuario ("José",'M',1);
    Usuario testeIMCMulher = new Usuario ("Maria",'F',1);

    @Test
    public void deveCalcularContaDeLuz() {
        assertEquals(114.9792,roberto.calculaContaEnergiaEletrica(812),0.0001);
    }

    @Test
    public void deveCalcularConsumoDeCombustivel() {
        assertEquals(20,roberto.calculaMediaCombustivel(500,25));
    }

    @Test
    public void deveLancarExceptionSeGeneroInvalido(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> roberto.setGenero('r'), "Esperava exceção para genero sem ser 'M' ou 'F'");
    }

    @Test
    public void deveTransformarGeneroEmLetraMaiuscula(){
        Usuario leticia = new Usuario("Leticia",'f');
        assertEquals('F',leticia.getGenero());
    }

    @Test
    public void deveLancarExceptionSeAlturaInvalida(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> roberto.setAltura(0), "Esperava exceção para altura menor ou igual a 0");
    }

    @Test
    public void deveLancarExceptionSePesoInvalido(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> roberto.setPeso(0), "Esperava exceção para peso menor ou igual a 0");
    }

    @Test
    void deveCalcularIMCHomemAbaixoDoPeso(){
        testeIMCHomem.setPeso(20.699);
        assertEquals("Abaixo do peso",testeIMCHomem.calculaIMCHomem());
    }

    @Test
    void deveCalcularIMCHomemNoPesoNormal(){
        testeIMCHomem.setPeso(26.399);
        assertEquals("No peso normal",testeIMCHomem.calculaIMCHomem());
    }

    @Test
    void deveCalcularIMCHomemMarginalmenteAcimaDoPeso(){
        testeIMCHomem.setPeso(27.799);
        assertEquals("Marginalmente acima do peso",testeIMCHomem.calculaIMCHomem());
    }

    @Test
    void deveCalcularIMCHomemAcimaDoPeso(){
        testeIMCHomem.setPeso(31.099);
        assertEquals("Acima do peso ideal",testeIMCHomem.calculaIMCHomem());
    }

    @Test
    void deveCalcularIMCHomemObeso(){
        testeIMCHomem.setPeso(31.111);
        assertEquals("Obeso",testeIMCHomem.calculaIMCHomem());
    }

    @Test
    void deveCalcularIMCMulherAbaixoDoPeso(){
        testeIMCMulher.setPeso(19.099);
        assertEquals("Abaixo do peso",testeIMCMulher.calculaIMCMulher());
    }

    @Test
    void deveCalcularIMCMulherNoPesoNormal(){
        testeIMCMulher.setPeso(25.799);
        assertEquals("No peso normal",testeIMCMulher.calculaIMCMulher());
    }

    @Test
    void deveCalcularIMCMulherMarginalmenteAcimaDoPeso(){
        testeIMCMulher.setPeso(27.299);
        assertEquals("Marginalmente acima do peso",testeIMCMulher.calculaIMCMulher());
    }

    @Test
    void deveCalcularIMCMulherAcimaDoPeso(){
        testeIMCMulher.setPeso(32.299);
        assertEquals("Acima do peso ideal",testeIMCMulher.calculaIMCMulher());
    }

    @Test
    void deveCalcularIMCMulherObesa() {
        testeIMCMulher.setPeso(32.311);
        assertEquals("Obeso", testeIMCMulher.calculaIMCMulher());
    }

    @Test
    void deveEscolherIMCHomemParaCalcular(){
        assertEquals(testeIMCHomem.calculaIMC(),testeIMCHomem.calculaIMCHomem());
    }

    @Test
    void deveEscolherIMCMulherParaCalcular(){
        assertEquals(testeIMCMulher.calculaIMC(),testeIMCMulher.calculaIMCMulher());
    }

    @Test
    void deveLancarExcecaoSeCalcularIMCComSexoInvalido() throws NoSuchFieldException, IllegalAccessException {
        Field generoField = Usuario.class.getDeclaredField("genero");
        generoField.setAccessible(true);
        generoField.set(testeIMCHomem,'x');
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> testeIMCHomem.calculaIMC(), "Esperava exceção para sexo inválido no cálculo do IMC");

    }


}

