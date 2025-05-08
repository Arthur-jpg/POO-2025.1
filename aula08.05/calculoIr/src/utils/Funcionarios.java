package utils;
import java.util.Date;
public class Funcionarios {
    private String nome;
    private Date dataDeContratacao;
    private float salarioBruto;

    public Funcionarios(String nome, Date dataDeContratacao, float salarioBruto) {
        this.nome = nome;
        this.dataDeContratacao = dataDeContratacao;
        this.salarioBruto = salarioBruto;
    }
}
