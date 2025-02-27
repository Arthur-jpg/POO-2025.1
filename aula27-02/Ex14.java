import java.util.*;

public class Ex14 {
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int contagem = 0;
        int entrada = 0;
        int soma = 1;
        int maior = 0;
        int menor = 10;
        int stop = -1;
        while (entrada != -1){
            System.out.println("Entre uma nota de aluno: ");
            entrada = teclado.nextInt();
            contagem += 1;
            if (entrada > maior ){
                maior = entrada;
            }
            if (entrada < menor && entrada != stop){
                menor = entrada;
            }
            soma = soma + entrada;
        }
        System.out.println(soma);
        System.out.println(contagem-1);
        int media = soma / (contagem - 1);

        System.out.println("Quantidade de alunos: " + (contagem-1));
        System.out.println("Media das notas: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);

    }
}