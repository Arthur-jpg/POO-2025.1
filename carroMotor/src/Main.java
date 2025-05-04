//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Motor m1 = new Motor(1.0f);
        Carro c1 = new Carro("Polo highline", m1);

        Motor m2 = new Motor(1.6f);
        Carro c2 = new Carro("Polo GTS", m2);
        c1.exibirDados();
        System.out.println("----------------------");
        c2.exibirDados();
    }
}