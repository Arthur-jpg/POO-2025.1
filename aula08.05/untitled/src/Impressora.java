public class Impressora {
    private String identificado;
    private boolean status;
    private int qtdPI;
    private int qtdPD;
    private Documento documentos;

    public Impressora(int qtdPD, String identificado) {
        this.qtdPD = qtdPD;
        this.identificado = identificado;
    }

    public void ligar() {
        this.status = true;
    }

    public void imprimir(Documento doc){
        if (status && qtdPD > doc.getQtd()){
            qtdPD -= doc.getQtd();
            qtdPI += doc.getQtd();
            System.out.println("Impressão concluída");
        }
    }

    public void desligar() {
        this.status = false;
    }

    
}
