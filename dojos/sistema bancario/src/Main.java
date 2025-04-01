import java.util.Scanner;
import conta.ContaBancaria;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria c1 = new ContaBancaria("HG" , 1,2000);

        c1.exibir();
        c1.depositar(1090);
        c1.exibir();
        c1.sacar(301);
        c1.exibir();

}}