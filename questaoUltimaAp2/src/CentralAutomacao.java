
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CentralAutomacao {
    private String nomeResidencia;
    private Map<String, List<?>> mapaDeDispositivos;
    private List<Eletrodomestico> listaDispositivosEletrodomesticos;
    private List<Conectavel> listaDispositivosEmRede;

    public CentralAutomacao(String nomeResidencia) {
        this.nomeResidencia = nomeResidencia;
        this.mapaDeDispositivos = new HashMap<>();
        this.listaDispositivosEletrodomesticos = new ArrayList<>();
        this.listaDispositivosEmRede = new ArrayList<>();
        
        // Inicializar o mapa
        mapaDeDispositivos.put("eletrodomesticos", listaDispositivosEletrodomesticos);
        mapaDeDispositivos.put("conectaveis", listaDispositivosEmRede);
    }

    public void adicionarDispositivo(DispositivoEletronico dispositivo) {
        // Verificar o tipo específico e adicionar à lista correspondente
        if (dispositivo instanceof Eletrodomestico) {
            listaDispositivosEletrodomesticos.add((Eletrodomestico) dispositivo);
        }
        
        if (dispositivo instanceof Conectavel) {
            listaDispositivosEmRede.add((Conectavel) dispositivo);
        }
    }

    public boolean removerDispositivo(Integer id) {
        // Remover dos eletrodomésticos
        for (int i = 0; i < listaDispositivosEletrodomesticos.size(); i++) {
            if (listaDispositivosEletrodomesticos.get(i).getId() == id) {
                listaDispositivosEletrodomesticos.remove(i);
                System.out.println("Dispositivo com ID " + id + " removido dos eletrodomésticos.");
                return true;
            }
        }
        
        // Remover dos conectáveis - precisamos ter cuidado pois DispositivoEletronico é que tem getId()
        for (int i = 0; i < listaDispositivosEmRede.size(); i++) {
            if (listaDispositivosEmRede.get(i) instanceof DispositivoEletronico && 
                ((DispositivoEletronico) listaDispositivosEmRede.get(i)).getId() == id) {
                listaDispositivosEmRede.remove(i);
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

    public void conectarTodosDispositivosDeRede(Float banda) {
        System.out.println("Conectando todos os dispositivos de rede na banda " + banda + "GHz...");
        for (Conectavel conectavel : listaDispositivosEmRede) {
            conectavel.conectarEmRede(banda);
        }
    }

    public void exibirTodosDispositivos() {
        System.out.println("=============================================");
        System.out.println("CENTRAL DE AUTOMAÇÃO DA RESIDÊNCIA: " + nomeResidencia);
        System.out.println("=============================================");
        
        System.out.println("\nEletrodomésticos:");
        for (Eletrodomestico eletrodomestico : listaDispositivosEletrodomesticos) {
            eletrodomestico.exibirInformacoes();
        }
        
        System.out.println("\nDispositivos em Rede:");
        for (Conectavel conectavel : listaDispositivosEmRede) {
            if (conectavel instanceof DispositivoEletronico) {
                DispositivoEletronico dispositivoEletronico = (DispositivoEletronico) conectavel;
                dispositivoEletronico.exibirInformacoes();
            }
            
            // Exibir comandos para dispositivos inteligentes
            if (conectavel instanceof DispositivoInteligente) {
                DispositivoInteligente dispositivoInteligente = (DispositivoInteligente) conectavel;
                dispositivoInteligente.exibirComandos();
                System.out.println();
            }
        }
    }

    public void contarPorTipo() {
        Map<String, Integer> contagem = new HashMap<>();
        
        // Contar eletrodomésticos
        contagem.put("Eletrodoméstico", 0);
        for (Eletrodomestico eletrodomestico : listaDispositivosEletrodomesticos) {
            contagem.put("Eletrodoméstico", contagem.get("Eletrodoméstico") + 1);
        }
        
        // Contar dispositivos em rede por tipo específico
        for (Conectavel conectavel : listaDispositivosEmRede) {
            String tipo;
            if (conectavel instanceof Lampada) {
                tipo = "Lâmpada";
            } else if (conectavel instanceof Termostato) {
                tipo = "Termostato";
            } else if (conectavel instanceof Computador) {
                tipo = "Computador";
            } else {
                tipo = "Outro dispositivo conectável";
            }
            
            contagem.put(tipo, contagem.getOrDefault(tipo, 0) + 1);
        }
        
        // Exibir contagem
        System.out.println("\nQuantidade de dispositivos por tipo:");
        for (Map.Entry<String, Integer> entry : contagem.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println(entry.getValue() + " " + entry.getKey() + (entry.getValue() > 1 ? "s" : ""));
            }
        }
    }
}
