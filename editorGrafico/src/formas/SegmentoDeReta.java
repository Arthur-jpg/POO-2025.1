package formas;

public class SegmentoDeReta {

    private Ponto ponto;
    private Ponto ponto2;

    public SegmentoDeReta(Ponto ponto, Ponto ponto2) {
        this.ponto = ponto;
        this.ponto2 = ponto2;
    }

    public float tamanho() {
        float distanciaX;
        float distanciaY;
        float diatancia;
        if (ponto.getX() > ponto2.getX()) {
            distanciaX = ponto.getX() - ponto2.getX();
        } else {
            distanciaX = ponto2.getX() - ponto.getY();
        }

        if (ponto.getY() > ponto2.getY()) {
            distanciaY = ponto.getY() - ponto2.getY();
        } else {
            distanciaY = ponto2.getY() - ponto.getY();
        }

        diatancia  = (float) (Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2));
        float distanciaCerta = (float) Math.sqrt(diatancia);
        System.out.println(distanciaCerta);
        return  distanciaCerta;

    }
}
