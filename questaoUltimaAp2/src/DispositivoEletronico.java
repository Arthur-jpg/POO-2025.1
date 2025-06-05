
public abstract class DispositivoEletronico {
    protected int id;
    protected String nome;
    protected boolean estado; // ligado/desligado
    protected double voltagemMinima;
    protected double voltagemMaxima;
    protected String localizacao;

    public DispositivoEletronico(int id, String nome, double voltagemMinima, double voltagemMaxima, String localizacao) {
        this.id = id;
        this.nome = nome;
        this.estado = false; // Inicialmente desligado
        this.voltagemMinima = voltagemMinima;
        this.voltagemMaxima = voltagemMaxima;
        this.localizacao = localizacao;
    }

    // Métodos concretos
    public void ligar() {
        this.estado = true;
        System.out.println(nome + " foi ligado.");
    }

    public void desligar() {
        this.estado = false;
        System.out.println(nome + " foi desligado.");
    }

    public boolean isLigado() {
        return estado;
    }

    public int getId() {
        return id;
    }

    // Método abstrato
    public abstract void exibirInformacoes();
}
