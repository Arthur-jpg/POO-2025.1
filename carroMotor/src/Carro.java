public class Carro {

    private String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public float velocidadeMaxima() {
        if (motor.getCilindrada() <= 1.0) {
            return  140;
        } else if (motor.getCilindrada() > 1.0 || motor.getCilindrada() <= 1.6) {
            return 180;
        } else if (motor.getCilindrada() > 1.6 || motor.getCilindrada() <= 2.0) {
            return 220;
        } else {
            return 260;
        }
    }

    public void exibirDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cilindrada: " + motor.getCilindrada());
        System.out.println("Velocidade maxima: " + velocidadeMaxima() + "km/h");
    }
}
