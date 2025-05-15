import java.util.Date;

public class ContaComum  extends  Conta{

    public ContaComum(Date dataAbertura, Agencia agencia, float saldo, Cliente cliente) {
        super(dataAbertura, agencia, saldo, cliente);
    }
}
