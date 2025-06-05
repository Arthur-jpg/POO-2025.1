import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CentralAutomacao {

    private String nomeResidencia;
    private Map<String, List<?>> mapaDeDispositivos;
    private List<Eletrodomestico> listaEletrodomesticos;
    private List<Conectavel> listaRede;

    public CentralAutomacao(String nomeResidencia) {
        this.nomeResidencia = nomeResidencia;
        this.listaRede = new ArrayList<>();
        this.mapaDeDispositivos = new HashMap<>();
        this.listaEletrodomesticos = new ArrayList<>();

        mapaDeDispositivos.put("eletrodomesticos", listaEletrodomesticos);
        mapaDeDispositivos.put("conectaveis", listaRede);
    }

    public void adicionarDispositivo(DispositivoEletronico dispositivo){
        if (dispositivo instanceof Eletrodomestico) {
            listaEletrodomesticos.add((Eletrodomestico) dispositivo);
        }
        if (dispositivo instanceof  Conectavel) {
            listaRede.add((Conectavel) dispositivo);
        }
    }

    public boolean removerDispositivo(Integer id) {
        for (int i = 0; i < listaEletrodomesticos.size(); i++){
            if (listaEletrodomesticos.get(i).getId() == id){
                listaEletrodomesticos.remove(i);
                System.out.println("Dispositivo com ID " + id + " removido dos eletrodomésticos.");
                return true;
            }
        }

        for (int i = 0; i < listaRede.size(); i++) {
            if (listaRede.get(i) instanceof DispositivoEletronico &&
                    ((DispositivoEletronico) listaRede.get(i)).getId() == id) {
                listaRede.remove(i);
                System.out.println("Dispositivo com ID " + id + " removido dos dispositivos conectáveis.");
                return true;
            }
        }

        System.out.println("Dispositivo com ID " + id + " não encontrado.");
        return false;
    }

    public void ligarTodosDispositivos() {
        System.out.println("Ligando todos os dispositivos...");

        // Ligar eletrodomésticos
        for (Eletrodomestico eletrodomestico : listaDispositivosEletrodomesticos) {
            eletrodomestico.ligar();
        }

        // Ligar dispositivos em rede - verificar se já não foram ligados (como eletrodomésticos)
        for (Conectavel conectavel : listaDispositivosEmRede) {
            if (conectavel instanceof DispositivoEletronico) {
                DispositivoEletronico dispositivoEletronico = (DispositivoEletronico) conectavel;
                if (!dispositivoEletronico.isLigado()) {
                    dispositivoEletronico.ligar();
                }
            }
        }
    }


}
