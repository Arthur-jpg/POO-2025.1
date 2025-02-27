import java.util.*;

public class Ex6 {
    public static void main(String[] args) 
    {
        float distancia, tempo, gasolina, velocidade, consumo;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre uma distância em km: ");
        distancia = teclado.nextFloat();
        System.out.println("Entre um tempo em horas: ");
        tempo = teclado.nextFloat();
        System.out.println("Entre a quantiade de gasolina em litros:  ");
        gasolina = teclado.nextFloat();

        velocidade = distancia/tempo;
        consumo = distancia/gasolina;

        
        System.out.println(velocidade + "km/h");
        System.out.println(consumo + "km/l");

      
    }
}