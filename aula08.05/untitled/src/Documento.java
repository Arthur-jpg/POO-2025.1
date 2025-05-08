public class Documento {
    private int qtd;
    private String nome;
    private String extensao;

    public Documento(int qtd, String nome, String extensao) {
        this.qtd = qtd;
        this.nome = nome;
        this.extensao = extensao;
    }


    public int getQtd() {
        return qtd;
    }

    public String getNome() {
        return nome;
    }

    public String getExtensao() {
        return extensao;
    }
}
