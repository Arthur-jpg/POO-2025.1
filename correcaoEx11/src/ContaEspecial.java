import java.util.Date;

public class ContaEspecial extends Conta{

    private float limite;

    public ContaEspecial(Date dataAbertura, Agencia agencia, float saldo, Cliente cliente, float limite) {
        super(dataAbertura, agencia, saldo, cliente);
        this.limite = limite;
    }

    public boolean sacar(float valor) {
        float custoSaque = 0f;
        if (this.cliente.ehVip()){
            custoSaque = 1.5f;
        }

        // dever de casa, melhorar o cálculo de saque (regra do saque)
        if (this.saldo + this.limite >= valor + custoSaque) {
            this.saldo -= valor + custoSaque;
            return true;
        }
        return false;
    }
}
