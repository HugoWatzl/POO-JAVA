package Biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel;

    public Livro(String titulo, String autor, int ano, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

   public void emprestar(){
        if(disponivel){
            disponivel = false;
        System.out.print("livro emprestado!");

        } else {
               System.out.print("Livro ja foi emprestado!");
       }
    }

    public void devolver(){
        if (disponivel == false){
            disponivel = true;
            System.out.print("Livro devolvido!");
        } else {System.out.print("Livro ja foi devolvido!");;
        }
    }


    public void exibir(){
        String status = disponivel ? "Emprestado" : "Disponivel";
        System.out.println(titulo + ", "+ autor +", " + ano +", " + disponivel);
    }
   }



