public class Cliente {
    private String nome;
    private boolean ehVip;
    private String cpf;
    private Endereco endereco;
    private Conta[] contas;

    public Cliente(Endereco endereco, String cpf, boolean ehVip, String nome) {
        this.endereco = endereco;
        this.cpf = cpf;
        this.ehVip = ehVip;
        this.nome = nome;
        this.contas = new Conta[4];
    }

    // aqui você vai add uma conta, para criar a conta vai ser fora de cliente
    public boolean adicionarNovaConta(Conta c) {
        for (int i = 0; i < contas.length; i++){
            if (contas[i] instanceof ContaPoupanca){
                if (c instanceof ContaPoupanca){
                    return false;
                            //dever de casa
                }
            }
        }
        for (int i = 0; i < contas.length; i++){
            if (this.contas[i] == null) {
                contas[i] = c;
                return true;
            }

        }
        return false;
    }

    public boolean ehVip() {
        return ehVip;
    }
}
