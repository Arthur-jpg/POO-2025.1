package principal;

import java.util.*;

import formas.Retangulo;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre um x: ");
        int x = teclado.nextInt();
        System.out.println("Entre um y: ");
        int y = teclado.nextInt();
        System.out.println("Entre uma largura: ");
        int largura = teclado.nextInt();
        System.out.println("Entre uma altura: ");
        int altura = teclado.nextInt();

        Retangulo r1 = new Retangulo(x,y,largura,altura);
        r1.mover(10, 10);
        r1.desenhar();
        r1.redimensionar(20, 20);
        r1.desenhar();
        r1.dividir(2,2);
        r1.desenhar();
    }
}
