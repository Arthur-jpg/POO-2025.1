
public class Lampada extends DispositivoInteligente {
    private String cor;
    private int intensidadeLuminosidade;  // Varia de 0 a 100

    public Lampada(int id, String nome, double voltagemMinima, double voltagemMaxima, String localizacao, String cor) {
        super(id, nome, voltagemMinima, voltagemMaxima, localizacao);
        this.cor = cor;
        this.intensidadeLuminosidade = 50;  // Começa com intensidade média
        
        // Adiciona os comandos disponíveis
        comandos.add("ligar lâmpada");
        comandos.add("desligar lâmpada");
        comandos.add("aumentar luminosidade");
        comandos.add("diminuir luminosidade");
    }

    public void aumentarLuminosidade() {
        if (intensidadeLuminosidade < 100) {
            intensidadeLuminosidade += 10;
            if (intensidadeLuminosidade > 100) intensidadeLuminosidade = 100;
            System.out.println("Luminosidade de " + nome + " aumentada para " + intensidadeLuminosidade + "%.");
        } else {
            System.out.println(nome + " já está na luminosidade máxima.");
        }
    }

    public void diminuirLuminosidade() {
        if (intensidadeLuminosidade > 0) {
            intensidadeLuminosidade -= 10;
            if (intensidadeLuminosidade < 0) intensidadeLuminosidade = 0;
            System.out.println("Luminosidade de " + nome + " diminuída para " + intensidadeLuminosidade + "%.");
        } else {
            System.out.println(nome + " já está na luminosidade mínima.");
        }
    }

    @Override
    public boolean receberComandoVoz(String comando) {
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

    @Override
    public void exibirInformacoes() {
        System.out.println("Lâmpada Inteligente: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Estado: " + (isLigado() ? "Ligada" : "Desligada"));
        System.out.println("Voltagem: " + voltagemMinima + "V - " + voltagemMaxima + "V");
        System.out.println("Localização: " + localizacao);
        System.out.println("Cor: " + cor);
        System.out.println("Intensidade de Luminosidade: " + intensidadeLuminosidade + "%");
        System.out.println("-----------------------");
    }
}
