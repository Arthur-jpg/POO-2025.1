public class ItemDeCompra {
    private String nome;
    private int qtd;
    private float preco;

    public ItemDeCompra(String nome, int qtd, float preco) {
        this.nome = nome;
        this.qtd = qtd;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQtd() {
        return qtd;
    }

    public float getPreco() {
        return preco;
    }

    public void addQuantidade(int q) {
        qtd += q;
    }
}
