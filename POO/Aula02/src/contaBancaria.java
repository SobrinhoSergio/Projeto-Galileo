public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }
        saldo -= valor;
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }
        saldo -= valor;
        destino.depositar(valor);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
