public class ContaCorrente {
    public ContaCorrente(String titular, double saldo, int numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    String titular;
    Double saldo;
    int numeroConta;

    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Titular: " + titular);
            System.out.println("Número da conta: " + numeroConta);
            System.out.println("Depósito de R$" + valor + " realizado");
            System.out.println("Saldo de R$" + saldo);
        }
    }
    public void sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        if (valor > saldo) {
            System.out.println("Saldo indisponível.");
            return;
        }

        saldo -= valor;

        System.out.println("Titular: " + titular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saque de R$" + valor + " realizado");
        System.out.println("Saldo de R$" + saldo);
        }
    public void transferir(double valor, ContaCorrente destino) {

        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        saldo -= valor;
        destino.saldo += valor;
        System.out.println("Transferência feito por: " + titular);
        System.out.println("Número bancario: " + numeroConta);
        System.out.println("Saldo de R$" + saldo);
        System.out.println("Transferência de R$" + valor + " realizada.");
        System.out.println("Para: " + destino.titular);
        System.out.println("Número bancario: " + destino.numeroConta);
        System.out.println("Saldo de R$" + destino.saldo);
    }
}
    public void main(String[] args) {
        ContaCorrente titular1 = new ContaCorrente("Matheus Kevyn Gouveia De Lima", 500, 456);
        ContaCorrente titular2 = new ContaCorrente("João Batista da Cruz", 100, 555);
        titular1.transferir(500, titular2);
}
