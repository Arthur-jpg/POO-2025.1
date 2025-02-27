import java.util.*;

public class Aula2 {
    public static void main(String[] args) 
    {
      Scanner teclado = new Scanner(System.in);
      float a, b;
      
    
      System.out.println("Digite o primeiro numero: ");
      a = teclado.nextFloat();
      System.out.println("Digite o primeiro segundo: ");
      b = teclado.nextFloat();
      
      float soma = a + b;
      System.out.println(soma);
      
    }
}