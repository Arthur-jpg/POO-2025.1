import java.util.*;

public class Ex11 {
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre um operando: ");
        String operando = teclado.next();

        int numero1, numero2, numero3;
        System.out.println("Entre um número: ");
        numero1 = teclado.nextInt();
        System.out.println("Entre outro número: ");
        numero2 = teclado.nextInt();

        System.out.println("A expressão é: " + numero1 + operando + numero2);
        System.out.println("Resultado: ");
        switch (operando) {
            case "/": System.out.println(numero1 / numero2); 
                break;
            case "*": System.out.println(numero1 * numero2); 
                break;
            case "+": System.out.println(numero1 + numero2); 
                break;
            case "-": System.out.println(numero1 - numero2); 
                break;

                
        
            default: System.out.println("Entre um operador válido");
                break;
        }

      
    }
}