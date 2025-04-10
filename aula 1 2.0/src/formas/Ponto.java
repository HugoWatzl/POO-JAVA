package formas;

public class Ponto {
    private double x, y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double move(int x , int y) {
        this.x += x;
        this.y += y;
    }
     public void dividi(int a){
         if(getX() % 2 == 0 && x > 0 ||  y % 2 != 0 && y > 0){
             this.x = x / a;
             this.x = x / a;
         }
     }

     public void redimenciona(double sx, double sy){
         if (sx > 0 && sy > 0) {
             largura = (int) (sx / 100 * largura);
             altura = (int) (sy / 100 * altura);
         }
     }
}
