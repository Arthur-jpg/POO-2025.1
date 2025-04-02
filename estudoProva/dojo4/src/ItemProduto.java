public class ItemProduto {
    private String nomeProduto;
    private int quantidadeComprada;
    private double precoUnitario;
    private double subtotal;

    public ItemProduto (String nomeProduto, int quantidadeComprada, double precoUnitario) {
        this.nomeProduto = nomeProduto;
        this.quantidadeComprada = quantidadeComprada;
        this.precoUnitario = precoUnitario;
        this.subtotal = quantidadeComprada * precoUnitario;
    }

    public void atualizarQuantidade(int novaQuantidade) {
        if (novaQuantidade < 1) {
            System.out.println("Não é possível ter uma quantidade menor que 1");
        } else {
            quantidadeComprada = novaQuantidade;
            subtotal = novaQuantidade * precoUnitario;
        }
    }

    public void atualizarPreco(double novoPreco) {
        if ( novoPreco <= 0) {
            System.out.println("O preço não pode ser zero ou negativo");
        } else {
            precoUnitario = novoPreco;
            subtotal = quantidadeComprada * novoPreco;
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome produto: " +  nomeProduto);
        System.out.printf("Quantidade: %d\n", quantidadeComprada);
        System.out.println("Preço unitário: " + precoUnitario);
        System.out.println("Subtotal: " + subtotal);
    }

}
