import java.util.Date;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Date dataAbertura, Agencia agencia, float saldo, Cliente cliente) {
        super(dataAbertura, agencia, saldo, cliente);
    }


    //crie a sua regra (usar date para calcular o tempo de rendimento)
    public void render() {

    }
}
