public class Main {
    public static void main(String[] args) {
        ItemProduto i1 = new ItemProduto("Banana", 2, 3);
        i1.exibirInformacoes();
        System.out.println("-------------------------------");
        i1.atualizarQuantidade(3);
        i1.exibirInformacoes();
        System.out.println("-------------------------------");
        i1.atualizarPreco(4);
        i1.atualizarQuantidade(2);
        i1.exibirInformacoes();
    }
}