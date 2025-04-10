package formas;

public class Circulo {
    private Ponto ponto;
    private float raio;

    public Circulo(Ponto ponto, float raio) {
        this.ponto = ponto;
        this.raio = raio;
    }

    public void mover(int x, int y) {
        ponto.mover(x, y);
    }

    public void desenhar() {
        System.out.printf("Circulo(%d, %d, %f)\n",
                ponto.getX(), ponto.getY(), raio);
    }

    public void redimensionar(float sx) {
        if (sx > 0) {
            raio = (int) ((sx / 100 + 1) * raio);
        }
    }

    public void dividir(float x) {
        if (x > 0) {
            raio = (int) (raio / x);
        }
    }
}