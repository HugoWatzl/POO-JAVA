import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int op;
      Curso m1 = new Curso("matematica", 10);

      do{
          System.out.println("Aperte 1 para Matricular : ");
          System.out.println("Aperte 2 para Desmatricular : ");
          System.out.println("Aperte 3 para imprimir da dados : ");
          System.out.println("Aperte 4 para Sair : ");

          op = sc.nextInt();

        switch (op) {
            case 1: System.out.println("Insira o nome do Aluno : ");
                Curso.Matricular();
            break;

            case 2: System.out.println("Insira o nome do Aluno : ");
            Curso.Desmatricular();
            break;

            case 3: System.out.println("Insira o nome do Aluno : ");
            Curso.imprimi();
            break;
            case 4: System.out.println("Encerrando programa : ");
            break;
            default: System.out.println("Opição invalida!Escolha de 1-4.");
                break;
        }
      }
      while (op != 4);
      sc.close();
 }
}
