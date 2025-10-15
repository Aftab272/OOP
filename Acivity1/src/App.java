public class App {
    public static void main(String[] args) throws Exception {
        circle c1 = new circle();
        c1.setRadius(5);
        System.out.println("Circumference of Circle 1 is: " + c1.CalculateCircumference());
        int r = c1.getRadius();
        circle c2 = new circle(r);
        c2.setRadius(5);
        System.out.println("Circumference of Circle 2 is: " + c2.CalculateCircumference());
    }
}
