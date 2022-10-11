package ad211.cheban;

public class Triangle { // поля
    private double base;
    private double height;
    public Triangle(double base, double height) { // конструктор
        this.base = base;
        this.height = height;
    }
    // методи обчислень
    public  double getSquare(){
        return 0.5 * base * height;
    }
    public double getHypotenuse(){
        return Math.sqrt(base*base + height*height);
    }
    public double getPerimeter(){
        return getHypotenuse() + height + base;
    }
}
