public abstract class Conta implements IConta {

    private static final int Agencia_Padrao = 1;
    private static int Sequencial = 1;

    //--------------------------------------------------------------------\\

    protected double saldo;
    protected int agencia;
    protected int numero;
    protected Cliente cliente;
    protected Banco banco;


    //--------------------------------------------------------------------\\

    public Conta(Cliente cliente) {
        this.agencia = Conta.Agencia_Padrao;
        this.numero = Sequencial++;
        this.cliente = cliente;

    }
    //--------------------------------------------------------------------\\

    public Conta(Banco banco){
        this.banco = banco;
    }


    //--------------------------------------------------------------------\\

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    //--------------------------------------------------------------------\\

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    //--------------------------------------------------------------------\\

    protected void imprimirInfosComuns() {

        System.out.printf("Titular: %s%n", cliente.getNome());
        System.out.printf("Endereço do Cliente: %s%n", cliente.getEndereco());
        System.out.printf("Agencia: %d%n", agencia);
        System.out.printf("Numero: %d%n", numero);
        System.out.printf("Saldo: %.2f%n", saldo);

    }

    protected void imprimirDadosBancos(){
        System.out.printf("Nome do Banco: %s%n", banco.getNomeBanco());
        System.out.printf("Endereço do Banco: %s%n", banco.getEnderecoBanco());
    }
}
