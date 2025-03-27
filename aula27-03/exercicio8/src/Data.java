public class Data {
    private int dia;
    private int mes;
    private int ano;

    public void construtorData (int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean ehValida() {
        if ((31 >= dia && dia >= 1) || (1 <= mes && mes<=12) || (ano >= 0 && ano <= 2026)) {
            if (ehBissexto()) {
                if (mes == 2 && dia <= 29) {
                    return true;
                } else {
                    return  false;
                }

            } else {
                if (mes == 2 && dia <= 28) {
                    return true;
                } else {
                    return  false;
                }
            }


        } else {
            return false;
        }
    }

    public boolean ehBissexto() {
        if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)){
            return true;
        } else {
            return false;
        }
    }

}
