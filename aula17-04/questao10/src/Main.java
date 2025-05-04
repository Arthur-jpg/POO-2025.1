import dominio.Aluno;
import dominio.Curso;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Eng da Computacao", 10);
        Aluno a1 = new Aluno("Ricardo", 1);
        Aluno a2 = new Aluno("Marcelo", 2);
        Aluno a3 = new Aluno("Fernanda", 3);

        curso1.matricularAluno(a1);
        curso1.matricularAluno(a2);
        curso1.imprimir();
    }
}