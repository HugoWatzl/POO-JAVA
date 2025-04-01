package conta;

public class ContaBancaria {
    private String titular;
    private int numeroConta, saldo;

    public ContaBancaria(String titular, int numeroConta, int saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }
    public void depositar(double valor){
        if(valor < 0){System.out.println("Insira um valor maior que 0 para depositar em sua conta!");}

        else saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void sacar(double valor){
        double taxa = 1.50;
        double val_taxado = valor + taxa;

        if (saldo >= val_taxado){ saldo -= val_taxado;
        System.out.println("Saque realizado com sucesso!" + saldo);

    } else {
            System.out.println("Saldo insuficiente!");}
    }

    public void exibir(){
        System.out.println("Titular: " + titular);
        System.out.println("Numero Conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }

}


