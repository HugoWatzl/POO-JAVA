package formas;

public class Retangulo {
    private int x;
    private int y;
    private int largura;
    private int altura;


    public Retangulo(int x, int y, int largura, int altura) {
        this.y = y;
        this.x = x;
        this.largura = largura;
        this.altura = altura;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    public void mover(int novoX, int novoY) {
        x = novoX;
        y = novoY;
    }

    public void desenhar() {
            System.out.printf("Retangulo(%d, %d, %d, %d)\n",
                    x, y, largura, altura);
        }

    public void redimensionar(float sx, float sy) {
        if (sx > 0 && sy > 0) {
            largura = (int) (sx / 100 * largura);
            altura = (int) (sy / 100 * altura);
        }
    }


    public void dividir(int a){
        if(x % 2 == 0 && x > 0 ||  y % 2 != 0 && y > 0){
            x = x/a;
            y = y/a;
        }
        else {
            x = ++x;
            y = --y;
        }

}


}



