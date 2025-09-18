class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
public class CircleTest {
    public static void main(String[] args) {
        // Create a circle with radius 7
        Circle c1 = new Circle(7);
        System.out.println("Radius of the circle is " + c1.getRadius());
        System.out.println("The area of the circle is " + c1.getArea());
        System.out.println("The circumference of the circle is " + c1.getCircumference());
        System.out.println();

        // Modify radius to 10
        c1.setRadius(10);
        System.out.println("Radius of the circle is " + c1.getRadius());
        System.out.println("The area of the circle is now " + c1.getArea());
        System.out.println("The circumference of the circle is now " + c1.getCircumference());
    }
}