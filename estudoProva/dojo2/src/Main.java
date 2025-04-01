public class Main {
    public static void main(String[] args) {
        PlanoAssinatura p1 = new PlanoAssinatura("Plano1", 10, 8, 100);
        p1.adcionarAssinante();
        p1.adcionarAssinante();
        p1.ofertarDesconto(51);
        p1.exibirDados();
    }
}