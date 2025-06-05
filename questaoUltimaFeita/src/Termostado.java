import java.util.List;

public class Termostado extends DispositivoInteligente{
    private float temperaturaAtual;

    public Termostado(String id, String nome, float voltagemMinima, float voltagemMaxima, String localizacao, List<String> comandos, float temperaturaAtual) {
        super(id, nome, voltagemMinima, voltagemMaxima, localizacao, comandos);
        this.temperaturaAtual = temperaturaAtual;

        comandos.add("ligar termostato");
        comandos.add("desligar termostato");
        comandos.add("aumentar temperatura");
        comandos.add("diminuir temperatura");
    }

    public void aumentarTemperatura() {
        temperaturaAtual += 1.0;
        System.out.println("Temperatura de " + nome + " aumentada para " + temperaturaAtual + "°C.");
    }

    public void diminuirTemperatura() {
        temperaturaAtual -= 1.0;
        System.out.println("Temperatura de " + nome + " diminuída para " + temperaturaAtual + "°C.");
    }

    public boolean comandoVoz(String comando) {
        String comandoLowerCase = comando.toLowerCase();

        if (comandoLowerCase.contains("ligar") && comandoLowerCase.contains("termostato") && comandoLowerCase.contains(localizacao.toLowerCase())) {
            this.ligar();
            return true;
        } else if (comandoLowerCase.contains("desligar") && comandoLowerCase.contains("termostato") && comandoLowerCase.contains(localizacao.toLowerCase())) {
            this.desligar();
            return true;
        } else if ((comandoLowerCase.contains("aumentar") || comandoLowerCase.contains("subir")) && comandoLowerCase.contains("temperatura") && comandoLowerCase.contains(localizacao.toLowerCase())) {
            this.aumentarTemperatura();
            return true;
        } else if ((comandoLowerCase.contains("diminuir") || comandoLowerCase.contains("baixar")) && comandoLowerCase.contains("temperatura") && comandoLowerCase.contains(localizacao.toLowerCase())) {
            this.diminuirTemperatura();
            return true;
        }

        System.out.println("Comando não reconhecido para o termostato do(a) " + localizacao);
        return false;
    }

    public void exibirInformacoes() {
        System.out.println("Termostato Inteligente: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Estado: " + (isLigado() ? "Ligado" : "Desligado"));
        System.out.println("Voltagem: " + voltagemMinima + "V - " + voltagemMaxima + "V");
        System.out.println("Localização: " + localizacao);
        System.out.println("Temperatura Atual: " + temperaturaAtual + "°C");
        System.out.println("-----------------------");
    }

}
