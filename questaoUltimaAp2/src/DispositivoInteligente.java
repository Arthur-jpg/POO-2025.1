
import java.util.ArrayList;
import java.util.List;

public abstract class DispositivoInteligente extends DispositivoEletronico implements Conectavel {
    protected List<String> comandos;

    public DispositivoInteligente(int id, String nome, double voltagemMinima, double voltagemMaxima, String localizacao) {
        super(id, nome, voltagemMinima, voltagemMaxima, localizacao);
        this.comandos = new ArrayList<>();
    }

    // Método concreto
    public void exibirComandos() {
        System.out.println("Comandos disponíveis para " + nome + ":");
        for (String comando : comandos) {
            System.out.println(" - " + comando);
        }
    }

    // Método abstrato
    public abstract boolean receberComandoVoz(String comando);

    @Override
    public boolean conectarEmRede(Float banda) {
        if (banda == 2.4f) {
            System.out.println(nome + " conectado na rede 2.4GHz.");
            return true;
        } else {
            System.out.println(nome + " não suporta a rede na banda " + banda + "GHz.");
            return false;
        }
    }
}
