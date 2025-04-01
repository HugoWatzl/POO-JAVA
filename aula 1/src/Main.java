package formas;

import java.util.Scanner;
import formas.Retangulo;


public class Main {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

       // Retangulo r1 = new Retangulo(3,5,5,6);

        System.out.print("crie um retangulo : ");
        System.out.print("angulo x :");
        int x = scanner.nextInt();
        System.out.print("angulo y :");
        int y = scanner.nextInt();
        System.out.print("largura :");
         int largura = scanner.nextInt();
        System.out.print("crie um altura :");
       int altura = scanner.nextInt();

       Retangulo r2 = new Retangulo(x,y,largura,altura);

       System.out.println(r2);

       r2.desenhar();
       r2.dividir(2);
       r2.desenhar();
       r2.mover(4 , 5);
       r2.desenhar();
       r2.dividir(4);
       r2.desenhar();

        Circulo c1 = new Circulo(4 , 5 , 2);
        Circulo c2 = new Circulo(10 , 6 , 2);
        Circulo c3 = new Circulo(15 , 20 , 5);

        c1.desenhar();
        c1.mover(5,10);
        c1.desenhar();
        c2.dividir(4);
        c3.redimencionar(10,10);

        scanner.close();
    }
}
