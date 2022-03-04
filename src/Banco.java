import java.util.List;

public class Banco {

    private List<Conta> contas;
    private String nomeBanco;
    private String enderecoBanco;


    //--------------------------------------------------------------------\\

    public String getEnderecoBanco() {
        return enderecoBanco;
    }
    public void setEnderecoBanco(String enderecoBanco) {
        this.enderecoBanco = enderecoBanco;
    }

    //--------------------------------------------------------------------\\

    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    //--------------------------------------------------------------------\\

    public String getNomeBanco() {
        return nomeBanco;
    }
    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }


    //--------------------------------------------------------------------\\

}
