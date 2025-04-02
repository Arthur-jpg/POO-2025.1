public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Arthur", "001", 100);
        c1.exibirDados();
        System.out.println("-------------------------------");
        c1.depositar(10);
        c1.exibirDados();
        System.out.println("-------------------------------");
        c1.sacar(110);
        c1.exibirDados();

    }
}