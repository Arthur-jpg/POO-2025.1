public class Produto {
    protected String codigo;
    protected String descricao;
    protected float preco;
    protected float peso;
    protected String localizacao;
    float frete = 0;

    public Produto(String codigo, String descricao, float preco, float peso, String localizacao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.peso = peso;
        this.localizacao = localizacao;
    }

    public void calcularFrete(String localizacao) {
        if(localizacao == null){
            System.out.printf("É necessário informar a localização!");
        } else {
            if (localizacao != this.localizacao) {
                frete = (peso * 3.5f) + 10;
            } else {
                frete = peso * 3.5f;
            }
        }

    }
}
