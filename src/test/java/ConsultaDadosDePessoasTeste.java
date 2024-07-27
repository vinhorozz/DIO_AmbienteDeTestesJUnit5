
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultaDadosDePessoasTeste {
/// aqui definimos que antes do teste conexão seja criada e logo depois, ela seja encerrada
    @BeforeAll
   static void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }

            @BeforeEach
            void inserirDadosParaTeste(){
                BancoDeDados.insereDados(new Pessoa("joao", LocalDate.of(2020,1,1)));
            }
    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2(){
        Assertions.assertNull(null);
    }
            @AfterEach
            void removeDadosDoTeste(){
                BancoDeDados.removeDados(new Pessoa("joao", LocalDate.of(2020,1,1)));
            }
    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }
    //------------------------------------------------------------------------------------------------


}
