public class CD extends Produto {
    private String estilo;
    private Musico[] musicos;

    public CD(String estilo, String codigo, String descricao, float preco, float peso, String localizacao ) {
        super(codigo, descricao, preco, peso, localizacao);
        this.estilo = estilo;
        this.musicos = new Musico[50];

    }
}
