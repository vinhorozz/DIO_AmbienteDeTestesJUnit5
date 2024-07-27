import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
    @Test
    void validarCalculoIdade(){
        Pessoa pessoa = new Pessoa("jose", LocalDate.of(2002,1,1));
assertEquals(22,pessoa.getIdade());
    }
}
