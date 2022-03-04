public class Main {
    public static void main(String[] args) {

        Cliente Wesley = new Cliente();
        Wesley.setNome("Wesley");
        Wesley.setEndereco("Rua Geraldo Mendes");
        Conta cc = new ContaCorrente(Wesley);
        Conta cp = new ContaPoupanca(Wesley);

        Banco Brasil = new Banco();
        Brasil.setNomeBanco("Banco do Brasil");
        Brasil.setEnderecoBanco("Rua Adolfo Olinto Nº: 20\nBairro: Centro");
        Conta bancoc = new ContaCorrente(Brasil);
        Conta bancop = new ContaPoupanca(Brasil);


        cc.depositar(1000);
        cp.depositar(2000);

        cp.transferir(500, cc);

        cc.imprimirExtrato();
        bancoc.imprimirExtratoBanco();

        cp.imprimirExtrato();
        bancop.imprimirExtratoBanco();

    }
}
