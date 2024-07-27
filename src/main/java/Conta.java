public class Conta {
    private  int numenro;
    private int valor;


    public Conta(int numenro, int valor) {
        this.numenro = numenro;
        this.valor = valor;
    }

    public int getNumenro() {
        return numenro;
    }

    public void setNumenro(int numenro) {
        this.numenro = numenro;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
