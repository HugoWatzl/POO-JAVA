import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int op;
      Curso m1 = new Curso("matematica", 10);

      do{
          System.out.println("  ----- MENU -----");
          System.out.println("Aperte 1 para Matricular : ");
          System.out.println("Aperte 2 para Desmatricular : ");
          System.out.println("Aperte 3 para imprimir da dados : ");
          System.out.println("Aperte 4 para Sair : ");

          op = sc.nextInt();
          sc.nextLine();

        switch (op) {
            case 1: System.out.println("Insira o nome do Aluno : ");
                String nomealu = sc.nextLine();

                System.out.println("Insira a matricula do Aluno : ");
                String matriculalu = sc.nextLine();

                Aluno novaluno = new Aluno(nomealu,matriculalu);
                if (m1.Matricular(novaluno)) {
                    System.out.println("Aluno matriculado com sucesso!");
                } else {
                    System.out.println("Não foi possível matricular o aluno. Verifique as vagas.");
                }
            break;

            case 2: System.out.println("Insira a matricula do Aluno : ");
            String a = sc.nextLine();

            if(m1.Desmatricular(a)){System.out.println("Aluno des1matriculado com sucesso!");
            }
            else System.out.println("Aluno não encontrado .");

            break;


            case 3: System.out.println("Insira o nome do Aluno : ");
            m1.imprimi();
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

