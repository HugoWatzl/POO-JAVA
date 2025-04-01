package gerenciar;

public class PlanoAssinatura {
    private String nome;
    private int  limite , quantidade ;
    private double val_assinatura;

    public PlanoAssinatura(String nome, int limite, int quantidade, int val_assinatura) {
        this.nome = nome;
        this.limite = limite;
        this.quantidade = quantidade;
        this.val_assinatura = val_assinatura;

    }
    //num representa a qunatidade de assiantes adicionados;
    public void addAssinante(int num){
        if (quantidade > limite) {
            System.out.println("Assinatura limite excedido");
        } else { quantidade += num;
        System.out.println("Assinatura atualizada com sucesso");}

    }

    public void Desconto(double desconto){

        if(desconto > 50){
            System.out.println("Valor de desconto inválido");
        } else {
             val_assinatura = (int) val_assinatura * (1 - desconto / 100);
            System.out.println("Desconto atualizado com sucesso, valor da assinatura: " + val_assinatura);}
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valua Assinatura: " + val_assinatura);
    }

}

