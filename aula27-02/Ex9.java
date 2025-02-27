import java.util.*;

public class Ex9 {
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        float numero, numeroInteiro, parteDecimal;

        System.out.println("Entre um número com casa decimal: ");
        numero = teclado.nextFloat();
        numeroInteiro = (int) numero;
        
        parteDecimal = numero - numeroInteiro;
        
        System.out.println("O número arrdondado é: ");
        if (parteDecimal < 0.5){
            System.out.println(numeroInteiro);
        } else if (parteDecimal >= 0.5) {
            numeroInteiro += 1;
            System.out.println(numeroInteiro);
        }
        


      
    }
}