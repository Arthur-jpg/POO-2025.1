package utilidades;

public class Sequencia {
    private int inicioSequencia;
    private int finalSequencia;

    public Sequencia(int inicioSequencia, int finalSequencia) {
        if (inicioSequencia > finalSequencia) {
            this.inicioSequencia = finalSequencia;
            this.finalSequencia = inicioSequencia;
        } else {

            this.inicioSequencia = inicioSequencia;
            this.finalSequencia = finalSequencia;
        }
    }

    public void sequencia () {
        for(int i = inicioSequencia; i <= finalSequencia; i++) {
            System.out.println(i);
        }
    }

    public void sequencia (int incremento) {
        for(int i = inicioSequencia; i <= finalSequencia; i = i + incremento) {
            System.out.println(i);
        }
    }
}
