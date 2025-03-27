package Utilidades;

public class Data {
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }


    public boolean valida() {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
            System.out.println("Insira uma data válida!");
            return false;
        } else {
            return true;
        }
    }

    public boolean bissexto() {
        if (ano % 4 == 0 || ano % 100 == 0 || ano % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir(){
        System.out.printf("%d / %d / %d \n", dia, mes, ano);
    }
    }


