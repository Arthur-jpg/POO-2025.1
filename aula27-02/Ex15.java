import java.util.*;

public class Ex15 {
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre algumm caracter: ");
        char entrada = teclado.nextLine().charAt(0);
        int contagemVogais = 0;
        int demais = 0;
        int contagemNumeros = 0;

        while (entrada != '.'){
            if (entrada == 'a' || entrada == 'e' || entrada == 'i' || entrada == 'o' || entrada == 'u') {
                contagemVogais += 1;
            } else if (entrada == '1' || entrada == '2' || entrada == '3' || entrada == '4' || entrada == '5' || entrada == '6' || entrada == '7' || entrada == '8' || entrada == '9' || entrada == '0'){
                contagemNumeros += 1;
            } else {
                demais += 1;
            }

            entrada = teclado.nextLine().charAt(0);

        }

        System.out.println("Vogais: " + contagemVogais);
        System.out.println("Numeros: " + contagemNumeros);
        System.out.println("Demais: " + demais);

    }
}