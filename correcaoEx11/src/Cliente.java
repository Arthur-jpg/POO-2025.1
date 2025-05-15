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
    public void adicionarNovaConta() {

    }
}
