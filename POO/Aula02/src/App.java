import ContaBancaria;

public class ExemploContaBancaria {
    public static void main(String[] args) {
        // criar uma nova conta bancária
        ContaBancaria minhaConta = new ContaBancaria("João da Silva", 1234, 1000.0);

        // depositar dinheiro na conta
        minhaConta.depositar(500.0);

        // sacar dinheiro da conta
        minhaConta.sacar(200.0);

        // criar outra conta bancária
        ContaBancaria outraConta = new ContaBancaria("Maria dos Santos", 5678, 1500.0);

        // transferir dinheiro entre as contas
        minhaConta.transferir(outraConta, 300.0);

        // exibir informações das contas
        System.out.println("Saldo da minha conta: " + minhaConta.getSaldo());
        System.out.println("Saldo da outra conta: " + outraConta.getSaldo());
    }
}
