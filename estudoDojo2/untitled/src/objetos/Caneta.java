package objetos;

public class Caneta {
    private String cor = "Azul";
    private float carga = 1;

    public void showStatusCaneta() {
        System.out.println("Cor: " + this.cor);
        System.out.println("Carga: " + this.carga);
    }

    public void getCor() {
        System.out.println("Cor:" + this.cor);
    }
    public void setCor(String c) {
        this.cor = c;
    }

    public void escrever() {
        this.carga -= 0.1f;
    }
}
