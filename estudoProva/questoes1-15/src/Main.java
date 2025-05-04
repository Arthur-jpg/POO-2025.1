/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Entre um tempo em segundos: ");
            int tempoSegundos = teclado.nextInt();
            int restoParaHoras = tempoSegundos%3600;
            int horas = (tempoSegundos - restoParaHoras)/3600;

            int restoParaMinutos = tempoSegundos%60;
            int minutos = (tempoSegundos-restoParaMinutos)/60;
            if (minutos >= 60) {
                horas += 1;
                minutos = 0;
            }



            System.out.println(horas);
            System.out.println(minutos);
            System.out.println(restoParaMinutos);


        }

    }
}
*/


import utilidades.Sequencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Sequencia s1 = new Sequencia(0, 15);
        s1.formandoSequencia();
        s1.formandoSequencia(3);
    }
}