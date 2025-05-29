public enum Notas {
    PESSIMO(0f, 2.0f, "péssimo"),
    RUIM(0f, 2.0f, "péssimo");


    private float notaMaxima;
    private float notaMinima;
    private String conceito;

    Notas(float notaMaxima, float notaMinima, String conceito) {
        this.notaMaxima = notaMaxima;
        this.notaMinima = notaMinima;
        this.conceito = conceito;
    }




    public static Conceito getConceito(float nota) {
        if (nota <= PESSIMO.notaMaxima){
            return PESSIMO;
        }
    }


}
