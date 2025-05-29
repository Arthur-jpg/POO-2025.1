public class Soma extends OperacaoBinaria{
    public Soma(float operando1, float operando2) {
        super(operando1, operando2);
    }

    @Override
    public float calcular() {
        float resultado;
        resultado = operando1 + operando2;
        return resultado;
    }
}
