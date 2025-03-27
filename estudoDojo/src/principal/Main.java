package principal;

import objetos.Caneta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Caneta c1 = new Caneta();
        System.out.println("Entre um modelo para a caneta1: ");
        String modelo = teclado.nextLine();
        c1.setModelo(modelo);
        c1.getModelo();


    }
}