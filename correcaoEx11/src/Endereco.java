public class Endereco {
    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String logradouro, String cidade, int numero, String bairro, String estado, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String toString() {
        String endereco = this.logradouro +  ", n" + this.numero + ", " + this.bairro + ", " + this.cidade + ", " + this.estado + ", " + this.cep;
        System.out.println(endereco);
        return endereco;
    }
}
