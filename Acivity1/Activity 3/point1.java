public class point1 {

    private int x;
    private int y;

    public point1() {
        x = 0;
        y = 0;
    }

    public point1(int a, int b) {
        x = a;
        y = b;
    }

    public void setx(int a) {
        x = a;
    }

    public void sety(int b) {
        y = b;
    }

    public int getx() {
        return x;
    }

    public int gety() {
        return y;
    }

    public void display() {
        System.out.println("x coordinate = " + x + " y coordinate = " + y);
    }

    public void movepoint(int a, int b) {
        x = x + a;
        y = y + b;
    }

}
