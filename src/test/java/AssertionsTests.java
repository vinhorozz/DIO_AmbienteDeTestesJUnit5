import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTests {
    //Validação de array
    @Test
    void validarLancamentos(){
        int[]primeiroLancamento={10,20,30,40,50};
        int[]segundoLancamento={10,20,30,40,50};

      //  Assertions.assertArrayEquals(primeiroLancamento,segundoLancamento);

assertNotEquals(primeiroLancamento,segundoLancamento);
    }

    //Validação de objeto nulo

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;

assertNull(pessoa);

        pessoa=new Pessoa("Luciano", LocalDate.now());

assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes(){
        double valor = 5.0;
        double valor2= 5;

assertEquals(valor,valor2);
    }
}
