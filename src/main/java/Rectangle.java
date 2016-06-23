public class Rectangle implements Shape {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double area() {
        System.out.println(width * length);
        return width * length;
    }
}
