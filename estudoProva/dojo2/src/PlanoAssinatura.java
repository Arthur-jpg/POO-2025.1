public class PlanoAssinatura {
    private String nome;
    private int limitePessoas;
    private int numeroPessoas;
    private double valorAssinatura;

    public PlanoAssinatura (String nome, int limitePessoas, int numeroPessoas, double valorAssinatura) {
        this.nome = nome;
        this.limitePessoas = limitePessoas;
        this.numeroPessoas = numeroPessoas;
        this.valorAssinatura = valorAssinatura;
    }

    public void adcionarAssinante() {
        if (limitePessoas < (numeroPessoas + 1)) {
            System.out.println("Não é possível adicionar mais assinantes");
        } else {
            numeroPessoas += 1;
        }
    }

    public void ofertarDesconto(double desconto) {
        double porcentagemDesconto = desconto/valorAssinatura;
        if (porcentagemDesconto > 0.50) {
            System.out.println("O desconto não pode exceder 50%");
        } else {
            valorAssinatura -= desconto;
        }
    }

    public void exibirDados() {
        System.out.println("Nome plano: " + nome);
        System.out.println("Quantidade de assinantes: " + numeroPessoas);
        System.out.println("Valor plano: " + valorAssinatura);
    }
}
