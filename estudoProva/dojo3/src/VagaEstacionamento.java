public class VagaEstacionamento {
    private String identificador;
    private String tipo;
    private String status;
    private double valorHora;

    public VagaEstacionamento (String identificador, String tipo, String status, double valorHora) {
        this.identificador = identificador;
        this.tipo = tipo;
        this.status = status;
        this.valorHora = valorHora;
    }

    public void ocuparVaga() {
        if (status == "ocupado"){
            System.out.println("Essa vaga já está ocupada");
        } else {
            status = "ocupado";
        }
    }

    public double liberarVaga( float tempoHoras ) {
        status = "livre";
        double valorTotal;
        valorTotal = tempoHoras * valorHora;
        System.out.println("Valor Hora: " + valorTotal);
        return valorTotal;
    }

    public void exibirInformacoes() {
        System.out.print("Identificador: ");
        System.out.println(identificador);
        System.out.print("Tipo: ");
        System.out.println(tipo);
        System.out.print("Status: ");
        System.out.println(status);
        System.out.print("Valor Hora: ");
        System.out.println(valorHora);
    }
}
