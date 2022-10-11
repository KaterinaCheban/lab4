package ad211.cheban;

public class Book { // поля
    private String name;
    private String author;
    private int year;
    private double price;
    private int quantity;
    public Book(String name, String author, int year, double price, int quantity) { // конструктор
        this.name = name;
        this.author = author;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    } // метод на кількість

    public void setPriceOfQuantity() { // метод на ціну від кількості
        this.price = price*quantity;
    }

    public double getTotalPrice() {
        return price;
    } // загальна ціна
}
