import java.util.logging.Logger;

public class BancoDeDados {


    private static final Logger LOGGER=Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        //descrição
            LOGGER.info("Iniciou conexão");

    }

    public static void finalizarConexao(){
        //descrição
        LOGGER.info("Finalizou conexão");

    }

    public static void insereDados(Pessoa pessoa){
            LOGGER.info("Inseriu dados");
    }

    public static void removeDados(Pessoa pessoa){
        LOGGER.info("Removeu dados");
    }

}

