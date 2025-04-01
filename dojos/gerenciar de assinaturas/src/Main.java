import java.util.Scanner;
import gerenciar.PlanoAssinatura;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PlanoAssinatura p1 = new PlanoAssinatura("X" , 30 , 3, 10);

        p1.exibirDados();
        p1.addAssinante(2);
        p1.exibirDados();
        p1.Desconto(20);
        p1.exibirDados();

    }
}