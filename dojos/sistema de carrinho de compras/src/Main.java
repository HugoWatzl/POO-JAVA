import java.util.Scanner;
import carrinho.ItemProduto;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            ItemProduto i1 = new ItemProduto("banana" , 2 , 100);

            i1.exibir();
            i1.atualizarPreco(4);
            i1.atualizarQuantidade(400);
            i1.atualizarPreco(5);
            i1.exibir();

    }
}