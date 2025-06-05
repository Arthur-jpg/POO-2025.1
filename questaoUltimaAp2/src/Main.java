public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando Sistema de Automação Residencial");
        
        // Criar a central de automação
        CentralAutomacao central = new CentralAutomacao("Casa Inteligente");
        
        // Criar eletrodomésticos
        Eletrodomestico geladeira = new Eletrodomestico(1, "Geladeira Samsung", 110, 220, "Cozinha", "Refrigeração");
        Eletrodomestico microondas = new Eletrodomestico(2, "Microondas LG", 110, 110, "Cozinha", "Aquecimento");
        Eletrodomestico airfryer = new Eletrodomestico(3, "Airfryer Philips", 110, 127, "Cozinha", "Fritura sem óleo");
        
        // Criar computadores
        Computador notebook = new Computador(4, "Notebook Dell", 100, 240, "Escritório", "Intel i7, 16GB RAM, SSD 512GB");
        Computador desktop = new Computador(5, "Desktop Gamer", 100, 240, "Quarto", "AMD Ryzen 9, 32GB RAM, RTX 3080");
        
        // Criar dispositivos inteligentes
        Lampada lampadaSala = new Lampada(6, "Lâmpada Philips Hue", 110, 220, "Sala", "RGB");
        Lampada lampadaQuarto = new Lampada(7, "Lâmpada Smart", 110, 220, "Quarto", "Branco Quente");
        Termostato termostatoSala = new Termostato(8, "Termostato Nest", 110, 220, "Sala", 22.0);
        Termostato termostatoQuarto = new Termostato(9, "Termostato Ecobee", 110, 220, "Quarto", 20.0);
        
        // Adicionar os dispositivos à central
        central.adicionarDispositivo(geladeira);
        central.adicionarDispositivo(microondas);
        central.adicionarDispositivo(airfryer);
        central.adicionarDispositivo(notebook);
        central.adicionarDispositivo(desktop);
        central.adicionarDispositivo(lampadaSala);
        central.adicionarDispositivo(lampadaQuarto);
        central.adicionarDispositivo(termostatoSala);
        central.adicionarDispositivo(termostatoQuarto);
        
        // Exibir todos os dispositivos
        central.exibirTodosDispositivos();
        
        // Ligar todos os dispositivos
        central.ligarTodosDispositivos();
        
        // Conectar dispositivos em rede 2.4GHz
        System.out.println("\nTentando conectar todos os dispositivos na rede 2.4GHz...");
        central.conectarTodosDispositivosDeRede(2.4f);
        
        // Conectar dispositivos em rede 5.0GHz
        System.out.println("\nTentando conectar todos os dispositivos na rede 5.0GHz...");
        central.conectarTodosDispositivosDeRede(5.0f);
        
        // Testar comandos de voz
        System.out.println("\nTestando comandos de voz:");
        lampadaSala.receberComandoVoz("ligar lâmpada da sala");
        lampadaSala.receberComandoVoz("aumentar luminosidade da sala");
        termostatoQuarto.receberComandoVoz("aumentar temperatura do quarto");
        termostatoQuarto.receberComandoVoz("subir temperatura do quarto");
        
        // Remover um dispositivo
        System.out.println("\nRemovendo o airfryer:");
        central.removerDispositivo(3);
        
        // Contar dispositivos por tipo
        central.contarPorTipo();
    }
}