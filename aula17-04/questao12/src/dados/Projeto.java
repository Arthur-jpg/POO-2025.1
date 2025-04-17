package dados;

import java.util.Date;

public class Projeto {
    private String nome;
    private int custo;
    private Membro[] membros;
    private int qtdDeMembros;

    public Projeto(String nome, int qtdMaxMembros) {
        this.nome = nome;
        this.membros = new Membro[qtdMaxMembros];
    }

    public boolean addMembro(Membro m){
        for(int i = 0; i < qtdDeMembros; i++) {
            if(membros[i].getName().equals(m.getName()) && membros[i].getDataDeNascimento().equals(m.getDataDeNascimento())) {
                return false;
            }
            if(m.getProjeto() != null) {
                return false;
            }

        }
        m.setProjeto(this);
        this.membros[qtdDeMembros] = m;
        qtdDeMembros++;
        custo += m.getSalario();
        return true;

    }

    public boolean removerMembro(String nome, Date nascimento){
        for (int i = 0; i<qtdDeMembros; i++){
            if(membros[i].getName().equals(nome) && membros[i].getDataDeNascimento().equals(nascimento)){
                membros[i].setProjeto(null);
                membros[i] = membros[qtdDeMembros - 1];
                membros[qtdDeMembros - 1] = null;
                qtdDeMembros--;
            }
            return true;
        }
        return false;
    }

    public void imprimir() {
        for (int i = 0; i < qtdDeMembros; i++){
            membros[i].imprimirDadosMembro();
            System.out.println("Nome projeto projeto: " + nome);
            System.out.println("Custo: " + custo);
            System.out.println("Quantidade de membros: " + qtdDeMembros);
        }
    }
}


