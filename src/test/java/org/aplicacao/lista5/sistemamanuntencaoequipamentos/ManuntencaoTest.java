package org.aplicacao.lista5.sistemamanuntencaoequipamentos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManuntencaoTest {

    @Test
    void deveLancarExcecaoSeManuntencaoNaoTiverEquipamentoAssociado(){
        assertThrows(IllegalArgumentException.class, ()-> new Manuntencao(null));
    }

}