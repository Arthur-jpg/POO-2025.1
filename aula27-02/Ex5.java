import java.util.*;

public class Ex5 {
    public static void main(String[] args) 
    {
        int t;
        float segundos, minutos, horas;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre segundos: ");
        t = teclado.nextInt();
        segundos = t%60;
        minutos = (t%3600)/60;
        horas = (t/3600);
    
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

        
        



        
        

        
      
    }
}