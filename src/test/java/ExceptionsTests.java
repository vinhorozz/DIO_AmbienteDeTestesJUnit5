import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTests {

    //Testar cenários onde exceções acontecem

    @Test
    void validarCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta(123456,0);
        Conta contaDestino = new Conta(32153,100);

        TransfereEntreContas transfereEntreContas = new TransfereEntreContas();
//temos o método que espera que a exceção seja lançada
/*
        Assertions.assertThrows(IllegalAccessException.class,()->
            transfereEntreContas.transfere(contaOrigem,contaDestino,-1));
*/

//temos o método que espera que a exceção não seja lançada
        Assertions.assertDoesNotThrow(()->
                transfereEntreContas.transfere(contaOrigem,contaDestino,-1));

    }

}
