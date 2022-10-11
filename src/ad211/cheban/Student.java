package ad211.cheban;

public class Student { // поля
    private String surname;
    private String name;
    private int course;
    private String group;
    private double average_mark;
    public Student(String surname, String name, int course, String group, double average_mark) { // конструктор
        this.surname = surname;
        this.name = name;
        this.course = course;
        this.group = group;
        this.average_mark = average_mark;
    }
    // методи обчислень
    public void setChangeGPA(double average_mark) {
        this.average_mark = average_mark;
    }
    public void getForTheNextCourse(){
        if (average_mark > 60)
        {course++;
            System.out.println("так");}
        else
        {System.out.println("ні");}
    }
    public double getScholarship(){
        return average_mark * 30;
    }
}
