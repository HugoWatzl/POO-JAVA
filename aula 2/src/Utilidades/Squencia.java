package Utilidades;

public class Squencia {
    private int numi, numf;

    public Squencia(int numi, int numf) {
        this.numi = numi;
        this.numf = numf;
    }


     void exibir(){
        System.out.printf("numero do começo : %d numero do fim : %d\n" , numi ,numf);
     }
    public void imprimir(int p) {
        if(numi > numf){
            System.out.print("erro!");}

        for (int i = numi; i <= numf;i += p) {
            System.out.println(i);
        }
    }
}

