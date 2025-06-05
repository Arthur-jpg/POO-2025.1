import java.util.ArrayList;
import java.util.List;
public abstract class DispositivoInteligente extends DispositivoEletronico implements Conectavel {

    protected List<String> comandos;

    public DispositivoInteligente(int id, String nome, float voltagemMinima, float voltagemMaxima, String localizacao, List<String> comandos) {
        super(id, nome, voltagemMinima, voltagemMaxima, localizacao);
        this.comandos = comandos;
    }

    public void exibirComandos() {
        System.out.println("Comandos disponíveis para: " + this.nome);
        for (String comando : comandos){
            System.out.println(" - " + comando);
        }
    }

    //simular receber um comando completo por voz
    public abstract boolean comandoVoz (String comando);

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

    public int getId() {
        return id;
    }
}
