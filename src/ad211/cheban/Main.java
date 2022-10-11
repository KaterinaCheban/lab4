package ad211.cheban;

public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1");
        Triangle triangle = new Triangle(5,4);
        System.out.println("Площа: " +triangle.getSquare());
        System.out.println("Гіпотенуза: " + triangle.getHypotenuse());
        System.out.println("Периметр: " + triangle.getPerimeter());

        System.out.println("\nЗавдання 2");
        Circle circle1 = new Circle(5,6,10);
        Circle circle2 = new Circle(5,6);
        System.out.println("Площа першого круга: " + circle1.getSquare());
        System.out.println("Довжина першого круга: " + circle1.getLength());
        System.out.println("Площа другого круга: " + circle2.getSquare());
        System.out.println("Довжина другого кола: " + circle2.getLength());

        System.out.println("\nЗавдання 3");
        Student student = new Student("Чебан","Катерина",2,"АД-211",90);
        System.out.println("Чебан Катерина, 2 курс, АД-211, середній бал 90");
        System.out.print("Стипендія за старим середнім балом: ");
        System.out.println(student.getScholarship());
        System.out.println("Новий середній бал: 93");
        student.setChangeGPA(93);
        System.out.print("Переведено на наступний курс: ");
        student.getForTheNextCourse();
        System.out.print("Стипендія: ");
        System.out.println(student.getScholarship());

        System.out.println("\nЗавдання 4");
        Book book = new Book("Звіяні вітром","Маргарет Мітчелл",1992,181,5);
        System.out.println("Звіяні вітром, Маргарет Мітчелл, 1992, 181 грн, 5 шт.");
        System.out.println("Ціна: " + book.getTotalPrice());
        book.setQuantity(10);
        book.setPriceOfQuantity();
        System.out.print("Сума замовлення: ");
        System.out.print(book.getTotalPrice());
    }
}