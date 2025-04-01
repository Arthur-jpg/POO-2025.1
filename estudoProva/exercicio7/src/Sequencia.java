public class Sequencia {

    private int inicioSequencia;
    private int finalSequencia;

    public Sequencia (int ini, int fin) {
        this.inicioSequencia = ini;
        this.finalSequencia = fin;
    }

    public void formarSequencia() {
        for(int i = inicioSequencia; i <= finalSequencia; i++) {
            System.out.println(i);
        }
    }

    public void formarSequencia(int p) {
        for(int i = inicioSequencia; i <= finalSequencia; i += p) {
            System.out.println(i);
        }
    }
}
