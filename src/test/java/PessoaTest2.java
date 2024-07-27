import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest2 {

    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa pessoa = new Pessoa("Jessica", LocalDate.of(2008,1,1));

assertEquals(16,pessoa.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa jessica = new Pessoa("Jéssica",LocalDate.of(2000,01,01));
assertTrue(jessica.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João",LocalDate.of(2009,01,01));
assertFalse(joao.ehMaiorDeIdade());

    }
}
