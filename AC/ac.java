package AC;
// AC 10/03/2025

/* 1. Leia duas variáveis inteiras e imprima a soma, subtração, multiplicação e
divisão entre elas. */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha 2 números:");
        
        a = teclado.nextInt();
        b = teclado.nextInt();
        
        int soma = a + b;
        int div = a / b;
        int multi = a * b;
        int sub = a - b;
        System.out.printf("Soma = %d\n", soma);
        System.out.printf("Divisão = %d\n", div);
        System.out.printf("Multiplicação = %d\n", multi);
        System.out.printf("Subtração = %d\n", sub);
        
    }
}

/* 2.  Altere o tipo das duas variáveis do exercício 1 para ponto flutuante.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float a, b;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha 2 números:");
        
        a = teclado.nextInt();
        b = teclado.nextInt();
        
        double soma = a + b;
        double div = a / b;
        double multi = a * b;
        double sub = a - b;
        System.out.printf("Soma = %d\n", soma);
        System.out.printf("Divisão = %d\n", div);
        System.out.printf("Multiplicação = %d\n", multi);
        System.out.printf("Subtração = %d\n", sub);
        
    }
}


/* 3. Leia o salário e o percentual de aumento. Em seguida, aplique o
percentual de aumento sobre o salário e imprima o novo salário.
 */

 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um salario :");
        a = teclado.nextInt();

        System.out.println("Insira um percentual de aumento : ");
        b = teclado.nextInt();

        float perc = (a * b) / 100.0f ;
        float salario_atual = a + perc;

        System.out.printf("Novo salario = %.2f\n " , salario_atual);

    }
}

/* 4. Leia o raio de um círculo. Em seguida imprima o perímetro (2R) e a
área (R
2
) do círculo com esse raio. */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int raio;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um raio de um circulo : ");
        raio = teclado.nextInt();

        double p = 2 * 3.14 * raio ;
        double a = 3.14 *  Math.pow(raio ,2);

        System.out.printf("perimetro = %.2f\n" , p);
        System.out.printf("area = %.2f\n" , a);


    }
}

/* 5. Leia uma variável t com um tempo qualquer em segundos e imprima
esse valor em hora, minuto e segundo.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um numero representando segundos : ");
      int temp = teclado.nextInt();

        int horas = 3600 / temp;
        int minutos =(temp % 3600)/60;
        double segundos = temp % 60;

        System.out.printf("Horas = %d\n", horas);
        System.out.printf("Minutos = %d\n", minutos);
        System.out.printf("Segundos = %.2f\n", segundos);
}
}

 /* 6. Leia a distância percorrida por um carro, o tempo gasto e a
quantidade de gasolina consumida. Em seguida, imprima a velocidade
média (KM/h) e o consumo de combustível (Km/l). */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira as informacoes do veiculo :");
        System.out.println("Distancia percorrida em km ");
        int dist =teclado.nextInt();;
       System.out.println("Quantidade de combustivel em litros ");
        int quant = teclado.nextInt();;
       System.out.println("tempo gasto em horas ");
       int temp = teclado.nextInt();;


float consumo = (float) dist/quant;
float vel = (float) dist/temp;

System.out.printf("Consumo médio: %.2f km/l\n", consumo);
System.out.printf("Velocidade média: %.2f km/h\n", vel);
}}
 
 
 /* 7.  Leia uma variável n inteira. Em seguida, imprima uma mensagem
informando se o número n é par ou ímpar. */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um numero : ");
       int num = teclado.nextInt();
       // fiz com if e else(para nao usar peguei esse metado co o gpt)

      String result = num % 2 == 0 ?"par" :"impar";
        System.out.println(result);}}


 /* 8.  Leia duas variáveis com a quantidade de kilowatts consumidos em
uma casa e o valor do kilowatt. Em seguida, calcule o valor a ser pago,
concedendo um desconto de 10% caso o consumo seja menor que
150Kw.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira a quantidade de kilowatts consumidos :");
       float quant= teclado.nextFloat();

       System.out.println("Insira o valor de Kilowatts ");
      float val = teclado.nextFloat();

       float valorPago= quant *val;

        valorPago = quant < 150 ? valorPago * 0.9f : valorPago;

        System.out.println(valorPago);}}


/* 9. Ler um número real x e imprimi-lo arredondando seu valor para mais
ou para menos. Se a parte decimal for menor que 0.5 arredonda para
menos. Se for maior ou igual a 0.5 arredonda para mais.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        float num = scanner.nextFloat(); 

        int resultado;

        if (num >= 0) {
            resultado = (num - Math.floor(num) >= 0.5) ? (int) Math.ceil(num) : (int) Math.floor(num);
        } else {
            resultado = (num - Math.floor(num) > -0.5) ? (int) Math.ceil(num) : (int) Math.floor(num);
        }
        
        System.out.println(resultado);
        scanner.close();
    }
}

/*10. Ler um número inteiro n e mais dois números (inferior e superior) que
formam um intervalo. Ao final, imprima uma mensagem informando
se n está antes, dentro ou depois do intervalo.*/

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero : ");
        int n = scanner.nextInt();

        System .out.println("Escolha um numero inicial para o intervalor :");
        int inferior = scanner.nextInt();

        System .out.println("Escolha um numero final para o intervalor :");
        int superior = scanner.nextInt();

        if(n >= inferior && n <= superior ){System.out.print("Numero esta dentro do intervalo.");}

        else if (n > superior){System.out.print("Numero esta depois do intervalo : ");}
        
        else{System.out.print("Numero esta antes do intervalo ");}

        scanner.close();
    }
}

/* 11. Ler um caractere op representando uma operação aritmética (+, -, *,
/) e em seguida dois números reais a e b. Imprimir a expressão
matemática junto com o seu resultado no formato:
a op b = resultado*/

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero : ");
        int n = scanner.nextInt();

        System .out.println("Escolha um numero inicial para o intervalor :");
        int inferior = scanner.nextInt();

        System .out.println("Escolha um numero final para o intervalor :");
        int superior = scanner.nextInt();

        if(n >= inferior && n <= superior ){System.out.print("Numero esta dentro do intervalo.");}

        else if (n > superior){System.out.print("Numero esta depois do intervalo : ");}
        
        else{System.out.print("Numero esta antes do intervalo ");}

        scanner.close();
    }
}



/*12.  Ler dois números inteiros (a e b) e imprimir os pares no intervalo a..b,
além da soma e da média desses números. Caso a seja maior que b,
imprima os números no intervalo b..a.*/
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a operação (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        System.out.print("Digite o primeiro número(A): ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo número(B): ");
        double b = scanner.nextDouble();

        double resultado = 0;
        boolean optrue = true;

        switch(op){
    case '+' :  resultado = a + b;
    break;
    case '-' : resultado = a - b;
        break;
    case '*' : resultado = a * b;
        break;
    case '/' : if (b!= 0){ resultado = a / b; }
    else {
        System.out.println("Erro: O número 'B' não pode ser 0.");
        optrue = false;
    }
    break;
default:
    System.out.println("Erro: Operador inválido!");
    optrue = false;
}

if(optrue){System.out.println(resultado);}
        scanner.close();
}
}



/*13. Ler um número de alunos n. Em seguida, ler as notas dos n alunos e
imprimir, ao final, a média da turma.*/
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro número(A): ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo número(B): ");
        double b = scanner.nextDouble();

        double soma = a + b;
        double media = soma / 2;


        if (a < b){
            for(int i = (int) a;i < b;i++){
                if( i % 2 == 0 ){System.out.println(i);}
            }
    }
        
        else {for(int i = (int) b; i < a; i++){
            if( i % 2 == 0 ){System.out.println(i);}
    }}

    System.out.printf("Soma : %2f/n, Media = %2f/n " , soma , media);

    }}


/*14. Ler notas de alunos até que o usuário digite -1. Ao final imprimir a
quantidade de alunos, a média da turma, a maior nota e a menor
nota.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as notas dos alunos (-1 para sair):");

        double nota;
        int quantidadeAlunos = 0;
        double somaNotas = 0;
        double maiorNota = Double.NEGATIVE_INFINITY; 
        double menorNota = Double.POSITIVE_INFINITY; 

        while (true) {
            nota = scanner.nextDouble();
            
            if (nota == -1) {
                break; 
            }
            quantidadeAlunos++;
            somaNotas += nota;
            
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
        }
        double  media = somaNotas / quantidadeAlunos;

    
        scanner.close(); 
        
        System.out.println("Quantidade de alunos: " + quantidadeAlunos);
        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + (quantidadeAlunos > 0 ? maiorNota : "Nenhuma nota registrada"));
        System.out.println("Menor nota: " + (quantidadeAlunos > 0 ? menorNota : "Nenhuma nota registrada"));
    }
}


/*15. Ler caracteres até que o usuário digite '.' (ponto). Ao final imprimir: a
quantidade de vogais, a quantidade de dígitos e a quantidade dos
demais caracteres.*/


import java.util.Scanner;


public class Main{
    public static void main(String [] arg){

        Scanner scanner = new Scanner(System.in);

        int vogais = 0;
        int digitos = 0;
        int outros = 0;

        while(true){
        
        System.out.print("digite seu texto (aperte . para sair) :");
        char c = scanner.next().charAt(0);

        if(c == '.') { 
        break ; }

        if (c >= '0' && c <= '9') {
            digitos++;
        } else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            vogais++;
        } else {
            outros++;
        }
        }

        scanner.close();
        System.out.println("quantidade de vogais : " + vogais);
        System.out.println("a quantidade de dígitos : " + digitos);
        System.out.println(" a quantidade dosdemais caracteres : " + outros);
    }
}
