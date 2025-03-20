import java.util.*;

public class Ex2 {
    public static void main(String[] args) 
    {
      Scanner teclado = new Scanner(System.in);
      float a, b;
      
    
      System.out.println("Digite o primeiro numero: ");
      a = teclado.nextFloat();
      System.out.println("Digite o primeiro segundo: ");
      b = teclado.nextFloat();
      
      System.out.println("Soma: " + (a + b));
      System.out.println("Sub: " + (a - b));
      System.out.println("Divsao: " + (a / b));
      System.out.println("Multiplicaçao: " + (a * b));
      
    }
}