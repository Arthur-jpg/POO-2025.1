package dados;
import java.util.Date;

public class Membro {
    private String name;
    private Date dataDeNascimento;
    private int salario;
    private Projeto projeto;

    public Membro(String name, Date dataDeNascimento, int salario) {
        this.name = name;
        this.dataDeNascimento = dataDeNascimento;
        this.salario = salario;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getName() {
        return name;
    }

    public int getSalario() {
        return salario;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public void imprimirDadosMembro() {
        System.out.println("Nome membro: " + name);
        System.out.println("Projeto membro: " + projeto);
        System.out.println("Data de nascimento: " + dataDeNascimento);
        System.out.println("Salario: " + salario);
    }
}
