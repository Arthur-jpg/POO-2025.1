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
        } else if (motor.getCilindrada() > 1.0f && motor.getCilindrada() <= 1.6f) {
            return 180;
        } else if (motor.getCilindrada() > 1.6f && motor.getCilindrada() <= 2.0f) {
            return 220;
        } else if (motor.getCilindrada() > 2.0f){
            return 260;
        } else return 0;
    }

    public void exibirDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cilindrada: " + motor.getCilindrada());
        System.out.println("Velocidade maxima: " + velocidadeMaxima() + "km/h");
    }
}
