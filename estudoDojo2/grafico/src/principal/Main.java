package principal;

import objetos.Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre um X: ");
        int x = teclado.nextInt();
        System.out.println("Entre um Y: ");
        int y = teclado.nextInt();
        System.out.println("Entre um Altura: ");
        int altura = teclado.nextInt();
        System.out.println("Entre um Largura: ");
        int largura = teclado.nextInt();

        Retangulo r1 = new Retangulo();

        r1.makeRetangulo(x, y, largura, altura);
        r1.mostrarRetangulo();
        r1.cortarNaDiagonal();

    }
}