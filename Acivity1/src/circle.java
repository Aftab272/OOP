public class circle {
    private int radius;

    public circle() {
        radius = 7;
    }

    public circle(int r) {
        radius = r;
    }

    public void setRadius(int r) {
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public void display() {
        System.out.println("radius = " + radius);
    }

    public double CalculateCircumference() {
        double a = 3.14 * radius * radius;
        return a;
    }
}
