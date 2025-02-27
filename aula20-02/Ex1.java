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
      
      int soma = a + b;
      System.out.println(soma);
      
    }
}