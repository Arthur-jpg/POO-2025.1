package utilidades;

public class Sequencia {
    private int inicioSequencia;
    private int finalSequencia;

    public Sequencia (int inicioSequencia, int finalSequencia) {
        this.inicioSequencia = inicioSequencia;
        this.finalSequencia = finalSequencia;
    }

    public void formandoSequencia() {
        for (int i = 0; i <= finalSequencia; i++){
            System.out.println(i);
        }
    }
    public void formandoSequencia(int incremento) {
        for (int i = 0; i <= finalSequencia; i += incremento) {
            System.out.println(i);
        }
    }

}
