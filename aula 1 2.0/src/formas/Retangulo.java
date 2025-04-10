package formas;

public class Retangulo {
    private Ponto pontoInicial;
    private int largura;
    private int altura;


    public Retangulo(double x, double y, int largura, int altura) {
        this.pontoInicial = new Ponto(x,y);
        this.largura = largura;
        this.altura = altura;
    }

    public Retangulo(Ponto ponto, int largura, int altura) {
        this.pontoInicial = ponto;
        this.largura = largura;
        this.altura = altura;
    }


    public void mover(int novoX, int novoY) {
        pontoInicial.move(novoX, novoY);
    }

    public void desenhar() {
            System.out.printf("Retangulo(%.2F, %d, %d, %d)\n",pontoInicial, largura, altura);
        }

    public void redimensionar(double sx, double sy) {
        if (sx > 0 && sy > 0) {
            largura = (int) (sx / 100 * largura);
            altura = (int) (sy / 100 * altura);
        }
    }

    public void dividir(int a){
        pontoInicial.dividi(a);
}
}




