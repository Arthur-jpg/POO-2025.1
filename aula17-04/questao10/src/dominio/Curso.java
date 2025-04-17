package dominio;

public class Curso {
    private String nome;
    private Aluno[] alunos;
    private int qtdAulnosInscritos;

    public Curso (String nome, int nrVagas) {
        this.nome = nome;
        this.alunos = new Aluno[nrVagas];
    }

    public boolean matricularAluno(Aluno a) {
        for (int i = 0; i<qtdAulnosInscritos; i++) {
            if (this.alunos[i].getMatricula() == a.getMatricula()) {
                return false;
            }

        }

        this.alunos[qtdAulnosInscritos] = a;
        a.setCurso(this);
        qtdAulnosInscritos++;
        return true;
    }

    public boolean cancelarMatricula(int maticula) {
        for (int i = 0; i<qtdAulnosInscritos; i++) {
            if (this.alunos[i].getMatricula() == maticula) {
                this.alunos[i].setCurso(null);
                this.alunos[i] = this.alunos[qtdAulnosInscritos-1];
                this.alunos[qtdAulnosInscritos-1] = null;
                qtdAulnosInscritos--;

                return true;
            }

        }
        return false;
    }

    public void imprimir() {
        System.out.println("Cruso: " + nome);
        for (int i = 0; i<qtdAulnosInscritos; i++) {
            alunos[i].imprimir();

        }
    }
}
