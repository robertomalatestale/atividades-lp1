package org.aplicacao.lista4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TipoEnsinoTest {

    @Test
    void deveLancarExcecaoSeTipoDeEnsinoNaoVazioNoConstrutor(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()-> new TipoEnsino("   "));
    }

    @Test
    void deveLancarExcecaoSeTipoDeEnsinoNaoVazioNoSetter(){
        TipoEnsino tipoEnsino = new TipoEnsino("Ensino Médio");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()-> tipoEnsino.setTipoDeEnsino("  "));
    }


}