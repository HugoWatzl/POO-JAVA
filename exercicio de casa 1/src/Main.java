
import java.util.Scanner;
import Biblioteca.Livro;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         Livro l1 = new Livro("3 PORQUINHOS " ,"SOUZA" , 2001, true );

         l1.exibir();
         l1.getTitulo();
         l1.setTitulo("4 porquinhos");
         l1.exibir();
         l1.emprestar();
         l1.exibir();
         l1.devolver();
         l1.exibir();
    }
}