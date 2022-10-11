package ad211.cheban;

public class Circle {
    private double centerX;
    private double centerY;
    private final double radius;
    public Circle(double centerX, double centerY, double radius) { // коли відомий радіус
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public Circle(double centerX, double centerY) { // коли радіус дорівнює 0
        this.centerX = centerX;
        this.centerY = centerY;
        radius = 0;
    }
    // методи обчислень
    public double getSquare(){
        return Math.PI*radius;
    }
    public double getLength(){
        return 2*Math.PI*radius;
    }
}
