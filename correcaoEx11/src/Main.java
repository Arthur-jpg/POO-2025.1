import java.util.Date;

public class Main {
    public static void main(String[] args){
        Endereco e1 = new Endereco("Rua oscar valedtaro", "Rio de janeiro", 94, "Barra da tijuca", "Rio de janeiro", "34006065");

        Cliente c1 = new Cliente(e1, "00000000", true, "Arthur Schiller");

        Agencia a1 = new Agencia(5596, e1);

        Conta [] contas = new Conta[3];
        contas[0] = new Conta(new Date(), a1, 1000, c1);
        contas[1] = new ContaComum(new Date(), a1, 123123, c1);
        contas[2] = new ContaEspecial(new Date(),a1, 123123,c1, 1000);


        for (int i = 0; i < contas.length; i++){
            System.out.println(contas[i]);
            contas[i].sacar(10);
            System.out.println(contas[i].consultarSaldo());
            System.out.println("---------------");
        }



    }
}