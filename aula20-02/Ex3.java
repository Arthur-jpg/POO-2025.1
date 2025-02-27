import java.util.*;

public class Ex3 {
    public static void main(String[] args) 
    {
      Scanner teclado = new Scanner(System.in);
      System.out.println("Entre o salário: ");
      float salario, resultado;
      float percentual;
      salario = teclado.nextFloat();
      System.out.println("Entre o percentual de aumento: ");
      percentual = teclado.nextFloat();
      percentual = percentual/100;
      resultado = salario * (1+percentual);
      System.out.println(resultado);
    }
}