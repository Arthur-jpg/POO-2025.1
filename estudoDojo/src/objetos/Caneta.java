package objetos;

public class Caneta {
    private String modelo;
    private float ponta;

    public String getModelo() {
        System.out.println("Modelo: " + modelo);
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

}
