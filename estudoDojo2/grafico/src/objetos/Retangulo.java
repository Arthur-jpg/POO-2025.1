package objetos;

public class Retangulo {
    private int x;
    private int y;
    private int largura;
    private int altura;
    private int x2;
    private int y2;

    public void makeRetangulo(int x, int y, int largura, int altura) {
        this.x = x;
        this.y = y;
        this.altura = altura;
        this.largura = largura;
    }

    public void mostrarRetangulo() {
        System.out.println("Retangulo: " + " x:" + this.x + " y:" + this.y + " Altura:" + this.altura + " largura:" + this.largura);
    }

    public void cortarNaDiagonal() {
        System.out.println("Triangulo1");
        //Triangulo 1.1
        System.out.println("Ponto1:" + "(" + this.x + "," + this.y + ")");

        //Triangulo 1.2
        int xPonto21 = this.x ;
        int yPonto21 = this.y + altura;
        System.out.println("Ponto2:" + "(" + xPonto21 + "," + yPonto21 + ")");

        //Triangulo 1.3
        int xPonto31 = this.x + largura ;
        int yPonto31 = this.y;
        System.out.println("Ponto2:" + "(" + xPonto31 + "," + yPonto31 + ")");

        System.out.println("");

        System.out.println("Triangulo2");
        //Triangulo 2.1
        int xPonto12 = this.x + largura;
        int yPonto12 = this.y + altura;
        System.out.println("Ponto1:" + "(" + xPonto12 + "," + yPonto12 + ")");

        //Triangulo 2.2
        int xPonto22 = xPonto12 - largura ;
        int yPonto22 = yPonto12;
        System.out.println("Ponto2:" + "(" + xPonto22 + "," + yPonto22 + ")");

        //Triangulo 2.3
        int xPonto32 = xPonto12 ;
        int yPonto32 = yPonto12 - altura;
        System.out.println("Ponto2:" + "(" + xPonto32 + "," + yPonto32 + ")");


    }
}
