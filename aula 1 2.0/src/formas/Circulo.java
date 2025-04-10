package formas;

public class Circulo {
    private Ponto ponto;
    private double raio;


    //construtor
    public Circulo(double x, double y, double raio) {
        this.ponto = new Ponto(x,y);
        this.raio = raio;
      }

    public Circulo(Ponto ponto, double raio) {
        this.ponto = ponto;
        this.raio = raio;
      }

    //contrutor copia
    public Circulo(Circulo outro){
        this.ponto = outro.ponto;
        this.raio = outro.raio;
      }

    public void desenhar(){
        System.out.printf("Retangulo(%.2f, %.2f)\n",ponto,raio);
    }

    public void dividir(int a) {

    }

    public void redimencionar(float sx , float sy){
            if (sx > 0 && sy > 0) {
                this.ponto = (int) (sx / 100 * raio);

            }
    }
    public void mover(double novoX, double novoY) {
         ponto.setX(novoX);
         ponto.setY(novoY);
    }
}

