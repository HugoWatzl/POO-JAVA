package carrinho;

public class ItemProduto {
    private int preco, subtotal,quantidade;
    private String nome;


    public ItemProduto(String nome , int preco, int quantidade) {
        if (preco < 0 && quantidade < 0){ System.out.println("Valores precisam ser maiores que 0!");

        } else{

        this.preco = preco;
        this.subtotal = quantidade * preco;
        this.quantidade = quantidade;
        this.nome = nome;
        }
    }

    private void update(){
        this.subtotal = quantidade * preco;
    }

    public void atualizarQuantidade(int nov_qnt){
        if(nov_qnt > 1){
        this.quantidade = nov_qnt;
        System.out.println("Quantidade: " + quantidade);
        update();
        System.out.println("Subtoal: " + subtotal);
        } else {
        System.out.println("Quantidade deve ser maior ou igual a 1.");
        }

    }

    public void atualizarPreco(int nov_preco){
        if (nov_preco > 1 ){
            this.preco = nov_preco;
            System.out.println("Preco: " + preco);
            update();
            System.out.println("Subtoal: " + subtotal);
        } else {
        System.out.println("Preco deve ser maior que 0.");
        }
    }

    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("subtotal " + subtotal);
    }

}
