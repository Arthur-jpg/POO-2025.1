import java.util.*;

public class Ex4 {
    public static void main(String[] args) 
    {
      Scanner teclado = new Scanner(System.in);
      System.out.println("Entre o raio do circulo: ");
      float raio, perimetro, pi;
      double area;
      raio = teclado.nextFloat();
      pi = 3.14f;
      perimetro = 2 * pi * raio;
      area = pi * Math.pow(raio, 2);
      System.out.println("Perimetro: ");
      System.out.println(perimetro);
      System.out.println("Area: ");
      System.out.println(area);
    }
}
