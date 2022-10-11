package ad211.cheban;

public class Triangle { // поля
    private double base;
    private double height;
    public Triangle(double base, double height) { // конструктор
        this.base = base;
        this.height = height;
    }
    public  double getSquare(){ // метод площі
        return 0.5 * base * height;
    }
    public double getHypotenuse(){ // метод гіпотенузи
        return Math.sqrt(base*base + height*height);
    }
    public double getPerimeter(){ // метод периметру
        return getHypotenuse() + height + base;
    }
}
