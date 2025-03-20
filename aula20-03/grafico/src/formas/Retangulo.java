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
    

};
