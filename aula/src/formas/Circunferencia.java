package formas;

public class Circulo {
    private double x;
    private double y;
    private double raio;


    //construtor
    public Circulo(double x, double y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }
    //contrutor copia
    public Circulo(Circulo outro){
        this.x = outro.x;
        this.y = outro.y;
        this.raio = outro.raio;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRaio() {
        return raio;
    }

    public void setX(double x) {
        if(x > 0){
        this.x = x;}
    }

    public void setY(double y) {
        if(x > 0){
        this.y = y;}
    }

    public void setRaio(double raio) {
        if(x > 0){
        this.raio = raio;}
    }

    public void desenhar(){
        System.out.printf("Retangulo(%d, %d, %d)\n" , x, y,raio);
    }
    public void dividir(int a) {
        if (x % 2 == 0 && x > 0 || y % 2 != 0 && y > 0) {
            x = x / a;
            y = y / a;
        }
    }

    public void redimencionar(float sx , float sy){
            if (sx > 0 && sy > 0) {
                x = (int) (sx / 100 * raio);
                y = (int) (sy / 100 * raio);
            }
    }
    public void mover(int novoX, int novoY) {
        x = novoX;
        y = novoY;
    }
}
