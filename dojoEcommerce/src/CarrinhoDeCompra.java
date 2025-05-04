public class CarrinhoDeCompra {
    private int identificador;
    private ItemDeCompra [] items;
    private int qtdTotal;
    private float valorTotal;

    public CarrinhoDeCompra(int identificador) {
        this.identificador = identificador;
        this.items = new ItemDeCompra[50];
    }

    public boolean addProduto(String nome, int qtd, float preco) {
        for(int i = 0; i < qtdTotal; i++){
            if(items[i].getNome().equals(nome)){
                items[i].addQuantidade(qtd);
                valorTotal += items[i].getPreco() * qtd;
                return true;
            }
        }
        items[qtdTotal] = new ItemDeCompra(nome, qtd, preco);
        valorTotal += qtd*preco;
        qtdTotal++;
        return true;
    }

    public boolean removerProdutos(String nome){
        for(int i = 0; i < qtdTotal; i++){
            if(items[i].getNome().equals(nome)){
                valorTotal -= items[i].getPreco() * items[i].getQtd();
                items[i] = items[qtdTotal-1];
                qtdTotal--;
                return true;

            }
        }
        return false;
    }

    public float aplicarDesconto(){
        float desconto = 0;
        int contador = 0;
        for (int i = 0; i < qtdTotal; i++){
            if (items[i].getQtd() > 5){
                contador++;
            }
        }
        if (contador > 3){
            desconto = (float) (0.1*valorTotal);
        }
        return valorTotal - desconto;
    }
}
