package principal;

import formas.Ponto;
import formas.SegmentoDeReta;

public class Main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(10, 20);
        Ponto p2 = new Ponto(5, 5);

        SegmentoDeReta s1 = new SegmentoDeReta(p1, p2);
        s1.tamanho();

    }
}