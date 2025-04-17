package dominio;

import javax.sound.midi.Soundbank;

public class Aluno {
    private String nome;
    private int matricula;
    private Curso curso;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
    }
}
