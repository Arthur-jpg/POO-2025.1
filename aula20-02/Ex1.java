/*Exercício 1 */
import java.util.*;

public class Ex1 {
    public static void main(String[] args) 
    {
      Scanner teclado = new Scanner(System.in);
      int a, b;
      
    
      System.out.println("Digite o primeiro numero: ");
      a = teclado.nextInt();
      System.out.println("Digite o primeiro segundo: ");
      b = teclado.nextInt();
      
      System.out.println("Soma: " + (a + b));
      System.out.println("Sub: " + (a - b));
      System.out.println("Divsao: " + (a / b));
      System.out.println("Multiplicaçao: " + (a * b));
      
    }
}