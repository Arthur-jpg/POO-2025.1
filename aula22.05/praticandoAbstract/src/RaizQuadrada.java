public class RaizQuadrada extends OperacaoUnaria {

    public RaizQuadrada(float operando) {
        super(operando);
    }

    public float calcular() {
        float resultado;
        resultado = (float) Math.sqrt(operando);
        return resultado;
    }
}
