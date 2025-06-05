import java.util.List;

public class Lampada extends DispositivoInteligente{
    private String cor;
    private int intensidade;

    public Lampada(String id, String nome, float voltagemMinima, float voltagemMaxima, String localizacao, List<String> comandos, String cor, int intensidade) {
        super(id, nome, voltagemMinima, voltagemMaxima, localizacao, comandos);
        this.cor = cor;
        this.intensidade = 50;

        comandos.add("ligar lâmpada");
        comandos.add("desligar lâmpada");
        comandos.add("aumentar luminosidade");
        comandos.add("diminuir luminosidade");
    }

    public void aumentarLuminosidade() {
        if (intensidade < 100) {
            intensidade += 10;
            if (intensidade > 100) {
                intensidade = 100;
            }
            System.out.println("Luminosidade de " + nome + " aumentada para " + intensidade);
        } else {
            System.out.println("intensidade já está no máximo para: " + intensidade);
        }
    }

    public void diminuirLuminosidade() {
        if (intensidade > 0) {
            intensidade -= 10;
            if (intensidade < 0) {
                intensidade = 0;
            }
            System.out.println("Luminosidade de " + nome + " diminuida para " + intensidade);
        } else {
            System.out.println("intensidade já está no mínimo para: " + intensidade);
        }
    }

    public boolean comandoVoz(String comando) {
        String comandoLowerCase = comando.toLowerCase();

        if (comandoLowerCase.contains("ligar") && comandoLowerCase.contains("lâmpada") && comandoLowerCase.contains(localizacao.toLowerCase())) {
            this.ligar();
            return true;
        } else if (comandoLowerCase.contains("desligar") && comandoLowerCase.contains("lâmpada") && comandoLowerCase.contains(localizacao.toLowerCase())) {
            this.desligar();
            return true;
        } else if (comandoLowerCase.contains("aumentar") && comandoLowerCase.contains("luminosidade") && comandoLowerCase.contains(localizacao.toLowerCase())) {
            this.aumentarLuminosidade();
            return true;
        } else if (comandoLowerCase.contains("diminuir") && comandoLowerCase.contains("luminosidade") && comandoLowerCase.contains(localizacao.toLowerCase())) {
            this.diminuirLuminosidade();
            return true;
        }

        System.out.println("Comando não reconhecido para a lâmpada do(a) " + localizacao);
        return false;
    }

    public void exibirInformacoes() {
        System.out.println("Lâmpada Inteligente: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Estado: " + (isLigado() ? "Ligada" : "Desligada"));
        System.out.println("Voltagem: " + voltagemMinima + "V - " + voltagemMaxima + "V");
        System.out.println("Localização: " + localizacao);
        System.out.println("Cor: " + cor);
        System.out.println("Intensidade de Luminosidade: " + intensidade + "%");
        System.out.println("-----------------------");
    }


}
