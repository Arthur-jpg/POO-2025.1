public class Livro extends Produto{
    private String genero;
    private Musico[] musicos;

    public Livro(String genero, String codigo, String descricao, float preco, float peso, String localizacao ) {
        super(codigo, descricao, preco, peso, localizacao);
        this.genero = genero;
        this.musicos = new Musico[50];

    }
}
