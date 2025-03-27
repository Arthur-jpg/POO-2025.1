package formas;

public class Circulo {
    private int x;
    private int y;
    private int raio;

    public Circulo(int x, int y, int raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }
    public Circulo(int cordenada, int raio) {
        this.x = cordenada;
        this.y = cordenada;
        this.raio = raio;
    }
    public Circulo (Circulo outroCirculo) {
        this.x = outroCirculo.x;
        this.y = outroCirculo.y;
        this.raio = outroCirculo.raio;
    }

    public void desenhar() {
        System.out.println("x:" + x + " y:" + y + " raio:" + raio);
    }

    public int getX() {
        return this.x;
    }
    public void setX(int x) {
        if (x > 0){
            this.x = x;
        }
    }
    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        if (y > 0) {

            this.y = y;
        }
    }
    public int getRaio() {
        return this.raio;
    }
    public void setRaio(int raio) {
        this.raio = raio;
    }

    public void redimensionar(float sx) {
        if (sx > 0) {
            raio = (int) ((sx / 100 + 1) * this.raio);
        }
    }

    public void dividir (float ix) {
        if (ix > 0) {
            raio = (int) (this.raio/ix);
        }
    }
}


