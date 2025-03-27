package principal;

import objetos.Caneta;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.setCor("Vermerlho");
        c1.escrever();
        c1.showStatusCaneta();
    }
}