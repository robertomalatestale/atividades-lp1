package org.aplicacao.lista2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    Livro it = new Livro("It a Coisa", "Stephen King", 1986, 1104, "Terror");


    @Test
    void deveLancarExcecaoSeAnoDePublicacaoMenorOuIgualAZero(){
        QuantidadeInvalidaException exception = assertThrows(QuantidadeInvalidaException.class, () -> it.setAnoDePublicacao(0), "Esperava exceção para ano de publicação menor ou igual a zero");
    }

    @Test
    void deveLancarExcecaoSeNumeroDePaginasMenorOuIgualAZero(){
        QuantidadeInvalidaException exception = assertThrows(QuantidadeInvalidaException.class, () -> it.setNumeroDePaginas(0), "Esperava exceção para número de páginas menor ou igual a zero");
    }

    @Test
    void deveTestarSeOLivroAbriu() {
        it.abrir();
        assertTrue(it.isAberto());
    }

    @Test
    void deveTestarSeOLivroFechou() {
        it.fechar();
        assertFalse(it.isAberto());
    }

    @Test
    void deveAvancarPaginaCorretamente(){
        it.avancarPagina();
        assertEquals(2,it.getPaginaAtual());
    }

    @Test
    void deveLancarExcecaoSeTentarAvancarAlemDoNumeroDePaginas(){
        it.setNumeroDePaginas(3);
        it.avancarPagina();
        it.avancarPagina();
        IllegalStateException exception = assertThrows(IllegalStateException.class, () ->it.avancarPagina(), "Esperava exceção para pagina atual maior que numero de paginas");
    }

    @Test
    void deveRetrocederPaginaCorretamente(){
        it.avancarPagina();
        it.avancarPagina();
        it.avancarPagina();
        it.retrocederPagina();
        assertEquals(3,it.getPaginaAtual());
    }

    @Test
    void deveLancarExcecaoSeTentarRetrocederAlemDoNumeroDePaginas(){
        IllegalStateException exception = assertThrows(IllegalStateException.class, () ->it.retrocederPagina(), "Esperava exceção para tentativa de retroceder além da página um");
    }
}