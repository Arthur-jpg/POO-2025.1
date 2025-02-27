import java.util.*;

public class Ex7 {
    public static void main(String[] args) 
    {
        int numero, resultado;

        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Entre um número: ");
        numero = teclado.nextInt();
        resultado = numero%2;

        if (resultado == 0) {
            System.out.println("Esse número é par: ");
        } else {
            System.out.println("Esse número é ímpar: ");
            
        }


        



      
    }
}