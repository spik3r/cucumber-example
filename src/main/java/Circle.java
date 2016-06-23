public class Circle implements Shape {
    private final double radius;
    private final double pi = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        System.out.println(pi * Math.pow(radius, 2));
        return pi * Math.pow(radius, 2);
    }
}
