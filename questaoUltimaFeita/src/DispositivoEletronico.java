import javax.sound.midi.Soundbank;

public abstract class DispositivoEletronico {
    protected int id;
    protected String nome;
    protected boolean estado;
    protected float voltagemMinima;
    protected float voltagemMaxima;
    protected String localizacao;

    public DispositivoEletronico(int id, String nome, float voltagemMinima, float voltagemMaxima, String localizacao) {
        this.id = id;
        this.nome = nome;
        this.estado = false;
        this.voltagemMinima = voltagemMinima;
        this.voltagemMaxima = voltagemMaxima;
        this.localizacao = localizacao;
    }

    // métodos concretos
    public void ligar() {
        this.estado = true;
        System.out.println(nome + "Foi ligado.");
    }
    public void desligar() {
        this.estado = false;
        System.out.println(nome + "Foi desligado");
    }
    public boolean isLigado(){return estado;}

    public int getId() {
        return id;
    }

    //me
    public abstract void exibirInformacoes();
}
