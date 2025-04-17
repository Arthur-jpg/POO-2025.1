import dados.Membro;
import dados.Projeto;

import java.util.Calendar;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Date d1 = new Date(04, Calendar.OCTOBER, 24);
        Date d2 = new Date(05, Calendar.OCTOBER, 24);
        Membro m1 = new Membro("Arthur", d1, 100);
        Membro m2 = new Membro("Heitor", d2, 200);
        Projeto p1 = new Projeto("Eng Software", 30);

        p1.addMembro(m1);
        p1.addMembro(m2);
        p1.imprimir();
    }
}