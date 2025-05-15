import java.util.Date;

public class Conta {

    //vou usar a qtd de contas para gerar o número da conta
    private static int qtdContas = 0;
    protected Date dataAbertura;
    protected Agencia agencia;
    protected int numero;
    protected float saldo;
    protected Cliente cliente;

    public Conta(Date dataAbertura, Agencia agencia, float saldo, Cliente cliente) {
        qtdContas++;
        this.dataAbertura = dataAbertura;
        this.agencia = agencia;
        this.numero = qtdContas;
        this.saldo = saldo;
        this.cliente = cliente;

    }


    public float consultarSaldo () {
        return this.saldo;
    }

    public boolean depositar(float valor) {
       if (valor > 0 ){
           this.saldo = valor;
           return  true;
       } else {
           return false;
       }

    }


    public boolean sacar(float valor) {
        if (valor <= 0) {
            return false;
        }
        float custoSaque = 0f;
        if (this.cliente.ehVip()){
            custoSaque = 1.5f;
        }

        if (valor <= this.saldo + custoSaque) {
            this.saldo -= valor + custoSaque;
            return true;
        }
        return false;
    }




}
