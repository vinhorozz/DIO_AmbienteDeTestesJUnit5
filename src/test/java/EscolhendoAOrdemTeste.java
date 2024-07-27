
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;


// ordenar os testes em uma sequência desejada
// antes da classe  adicionar a anotação @TestMethodOrder(), passando como argumento o MethodOrderer.OrderAnnotation.class


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoAOrdemTeste {
// adicionando @Order(n), onde "n" é o representa a posição do teste

    @Order(6)
    @Test
    void validaFluxoA(){
    assertTrue(true);
    }
    @Order(4)
    @Test
    void validaFluxoB(){assertTrue(true);}

    @Order(2)
    @Test
    void validaFluxoC(){assertTrue(true);}
    @Order(3)
    @Test
    void validaFluxoD(){assertTrue(true);}
    @Order(1)
    @Test
    void validaFluxoE(){assertTrue(true);}

}
