import java.util.*;

public class Ex10 {
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int numero, numero2, numero3;

        numero = 10;

        System.out.println("Entre um número: ");
        numero2 = teclado.nextInt();
        System.out.println("Entre outro número maior: ");
        numero3 = teclado.nextInt();

        if (numero <= numero3 && numero >= numero2) {
            System.out.println("O número está no intervalo, ele é " + numero);
        } else if (numero < numero2) {
            System.out.println("O número está fora do intervalo para baixo, o limite inferior é " + numero2 + " e o número é "  + 10);
        } else if (numero > numero3) {
            System.out.println("O número está fora do intervalo para cima, o limite superior é " + numero2 + " e o número é "  + 10);

        }
      
    }
}