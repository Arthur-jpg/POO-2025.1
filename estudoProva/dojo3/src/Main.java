public class Main {
    public static void main(String[] args) {
        VagaEstacionamento v1 = new VagaEstacionamento("A1", "Carro", "Ocupado", 10);
        VagaEstacionamento v2 = new VagaEstacionamento("A2", "Moto", "Livre", 10);
        v1.exibirInformacoes();
        System.out.println("-------------------------------");
        v2.exibirInformacoes();
        System.out.println("-------------------------------");
        v1.liberarVaga(10);
        v1.exibirInformacoes();
    }
}