public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    //--------------------------------------------------------------------\\

    public ContaCorrente(Banco banco){
        super(banco);
    }

    //--------------------------------------------------------------------\\

    @Override
    public void imprimirExtrato() {
        System.out.println(" === Extrato Conta Corrente === ");
        super.imprimirInfosComuns();
    }

    @Override
    public void imprimirExtratoBanco() {
        super.imprimirDadosBancos();
    }

}
