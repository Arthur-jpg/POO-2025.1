import java.sql.SQLOutput;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean ehValida() {
        if (ehBissexto(ano) && (dia >= 29) && (mes == 2)) {
            return true;
        } else if (!ehBissexto(ano) && (mes == 2) && (dia > 28)){
            return false;
        }
        if ((dia <= 31 && dia > 0) && (mes <= 12 && mes > 0)){
            if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia > 31)){
                return false;

            } else if ((mes == 2 ||mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 30)){
                return false;
            } else {
                return true;
            }
            // conferir se é bissexto

        } else {
            return false;
        }

    }

    public void imprime() {
        if (ehValida()){
            System.out.println(dia + "/" + mes + "/" + ano);
        } else {
            System.out.println("INVÁLIDA");
        }


    }

    public boolean ehBissexto(int ano) {
        int multiloDe4 = ano % 4;
        int naoMulti100 = ano % 100;
        int multi400 = ano % 400;
        if (((multiloDe4 == 0) && (naoMulti100 != 0)) || (multi400 == 0)){
            return true;
        } else {
            return  false;
        }
    }

}
