import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;


// ordenar os testes em uma sequência desejada
// antes da classe  adicionar a anotação @TestMethodOrder(),
// passando como argumento o MethodName.class


//@TestMethodOrder(MethodOrderer.MethodName.class)

//@TestMethodOrder(MethodOrderer.Random.class)

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemNomeTeste {
// adicionando @Order(n), onde "n" é o representa a posição do teste

    @DisplayName("Teste que valida se o usuário foi criado")
    @Test
    void validaFluxoA(){
    assertTrue(true);
    }
    @DisplayName("a")
    @Test
    void validaFluxoB(){assertTrue(true);}

    @DisplayName("a")
    @Test
    void validaFluxoC(){assertTrue(true);}
    @DisplayName("C")
    @Test
    void validaFluxoD(){assertTrue(true);}
    @DisplayName("B")
    @Test
    void validaFluxoE(){assertTrue(true);}

}
