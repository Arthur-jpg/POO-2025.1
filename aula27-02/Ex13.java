import java.util.*;

public class Ex13 {
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int alunos;
        float nota, somaNotas, media;
        System.out.println("Entre a quantidade de alunos: ");
        alunos = teclado.nextInt();
        somaNotas = 0;

        for (int i = 0; i<=alunos-1; ++i){
            System.out.println("Entre a nota do aluno" + (i+1));
            nota = teclado.nextFloat();
            somaNotas = somaNotas + nota;
            System.out.println("Soma: " + somaNotas);
        }

        media = somaNotas / (float)alunos;
        System.out.println("Média das notas é: " + media);
      
    }
}