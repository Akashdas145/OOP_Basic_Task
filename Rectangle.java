public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }
    // Main method
    public static void main(String[] args) {
        // Create a Rectangle object with new initial values
        Rectangle rect = new Rectangle(10.0, 6.0);
        // Print initial area and perimeter
        System.out.println("The area of the rectangle is " + rect.getArea());
        System.out.println("The perimeter of the rectangle is " + rect.getPerimeter());
        System.out.println();
        // Update width and height
        rect.setWidth(8.0);
        rect.setHeight(5.0);
        // Print updated area and perimeter
        System.out.println("The area of the rectangle is now " + rect.getArea());
        System.out.println("The perimeter of the rectangle is now " + rect.getPerimeter());
    }
}
