package formas;


public class Retangulo {
    private int x;
    private int y;
    private int largura;
    private int altura;

    public Retangulo(int x, int y, int largura, int altura) {
        this.x = x;
        this.y = y;
        this.altura = altura;
        this.largura = largura;

    }
    public Retangulo(int x, int y, int lados) {
        this.x = x;
        this.y = y;
        this.altura = lados;
        this.largura = lados;
    }
    public void mover(int novoX, int novoY) {
        x = novoX;
        y = novoY;
    }

    public void desenhar() {
        System.out.printf("Retangulo(%d, %d, %d, %d)\n",
                x, y, largura, altura);
    }

    public void redimensionar(float sx, float sy) {
        if (sx > 0 && sy > 0) {
            largura = (int) ((sx / 100 + 1) * largura);
            altura = (int) ((sy / 100 + 1) * altura);
        }
    }

    public void dividir (float ix, float iy) {
        if (ix > 0 && iy > 0) {
            largura = (int) (altura/ix);
            altura = (int) (altura/iy);
        }
    }


};
