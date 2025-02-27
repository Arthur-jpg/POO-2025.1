import java.util.*;

public class Ex8 {
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        float killowats, valor, resultado;
        System.out.println("Entre a quantiade de kilowats consumido: ");
        killowats = teclado.nextFloat();
        System.out.println("Entre o valor do killowat: ");
        valor = teclado.nextFloat();
        if (killowats < 150) {
            resultado = killowats * valor;
            resultado = (float) (resultado * 0.9);
            System.out.println("Seu consumo foi inferior a 150kw, receba um desconto de 10%");
            System.out.println(resultado);
        } else {
            resultado = killowats * valor;
            System.out.println(resultado);
        }



      
    }
}