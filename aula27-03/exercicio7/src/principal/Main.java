package principal;

import utilidades.Sequencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre o inicio da sequencia: ");
        int inicioSequencia = teclado.nextInt();
        System.out.println("Entre o final da sequencia: ");
        int finalSequencia = teclado.nextInt();
        System.out.println("Entre um incremento: ");
        int incremento = teclado.nextInt();
        Sequencia s1 = new Sequencia(inicioSequencia, finalSequencia);

        s1.sequencia();

        s1.sequencia(2);

    }
}