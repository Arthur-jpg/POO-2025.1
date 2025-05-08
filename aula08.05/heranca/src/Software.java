public class Software extends Produto{

    private String categoria;

    public Software(String categoria, String codigo, String descricao, float preco, float peso, String localizacao ) {
        super(codigo, descricao, preco, peso, localizacao);
        this.categoria = categoria;
    }

}
