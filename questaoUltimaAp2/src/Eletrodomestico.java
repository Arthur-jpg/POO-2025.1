
public class Eletrodomestico extends DispositivoEletronico {
    private String funcao;

    public Eletrodomestico(int id, String nome, double voltagemMinima, double voltagemMaxima, String localizacao, String funcao) {
        super(id, nome, voltagemMinima, voltagemMaxima, localizacao);
        this.funcao = funcao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Eletrodoméstico: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Estado: " + (isLigado() ? "Ligado" : "Desligado"));
        System.out.println("Voltagem: " + voltagemMinima + "V - " + voltagemMaxima + "V");
        System.out.println("Localização: " + localizacao);
        System.out.println("Função: " + funcao);
        System.out.println("-----------------------");
    }
}
