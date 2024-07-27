public class TransfereEntreContas {


    public void transfere(Conta contaOrigem, Conta contaDestino, int valor) throws IllegalAccessException {
        if(valor<=0){
            throw new IllegalAccessException("valor deve ser maior");
        }
    }
}
