public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    //--------------------------------------------------------------------\\

    public ContaPoupanca(Banco banco){
        super(banco);
    }

    //--------------------------------------------------------------------\\

    @Override
    public void imprimirExtrato() {
        System.out.println(" === Extrato Da Poupança === ");
        super.imprimirInfosComuns();
    }

    @Override
    public void imprimirExtratoBanco() {
        super.imprimirDadosBancos();
    }

}
