
public class Computador extends DispositivoEletronico implements Conectavel {
    private String especificacao;

    public Computador(int id, String nome, double voltagemMinima, double voltagemMaxima, String localizacao, String especificacao) {
        super(id, nome, voltagemMinima, voltagemMaxima, localizacao);
        this.especificacao = especificacao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Computador: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Estado: " + (isLigado() ? "Ligado" : "Desligado"));
        System.out.println("Voltagem: " + voltagemMinima + "V - " + voltagemMaxima + "V");
        System.out.println("Localização: " + localizacao);
        System.out.println("Especificação: " + especificacao);
        System.out.println("-----------------------");
    }

    @Override
    public boolean conectarEmRede(Float banda) {
        if (banda == 2.4f || banda == 5.0f) {
            System.out.println(nome + " conectado na rede " + banda + "GHz.");
            return true;
        } else {
            System.out.println(nome + " não suporta a rede na banda " + banda + "GHz.");
            return false;
        }
    }
}
