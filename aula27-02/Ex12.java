import java.util.*;

public class Ex12 {
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        int a,b, restoA, restoB;
        System.out.println("Entre um número(a): ");
        a = teclado.nextInt();
        System.out.println("Entre um número(b): ");
        b = teclado.nextInt();

        if (a < b) {
            restoA = a%2;
            if (restoA == 0) {
                for (int i = 0; a<b-2; ++i) {
                    a = a + 2;
                    System.out.println(a);

                }
            } else {
                a += 1;
                System.out.println(a);
                for (int i = 0; a<b-2; ++i) {
                    a = a + 2;
                    System.out.println(a);

                }
            }
        } else if (a > b) {
            restoA = a%2;
            if (restoA == 0) {
                for (int i = 0; a-2>b; --i) {
                    a = a - 2;
                    System.out.println(a);

                }
            } else {
                a -= 1;
                System.out.println(a);
                for (int i = 0; a-2<b; --i) {
                    a = a - 2;
                    System.out.println(a);

                }
            }
        }

      
    }
}