public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void sacar(double valorSaque) {
        double valorMaximoSaque = saldo - 1.50;

        if (valorSaque >= valorMaximoSaque){
            System.out.println("Saldo insuficiente para saque");
        } else {
            saldo -= valorSaque;
        }
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito < 0){

        } else {
            saldo += valorDeposito;
        }
    }

    public void exibirDados(){
        System.out.println("Nome titular: " + titular);
        System.out.println("Numero conta: " + numeroConta);
        System.out.println("Saldo atual: " +  saldo);
    }
}
