import java.util.Date;

public class ContaInvestimento extends Conta{

    public ContaInvestimento(Date dataAbertura, Agencia agencia, float saldo, Cliente cliente) {
        super(dataAbertura, agencia, saldo, cliente);
    }

    public boolean sacar(float valor) {
        System.out.println("Ação não possível de ser realizada");
        return false;
    }
}
