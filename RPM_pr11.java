import java.util.Scanner;

class Person{
    private String age;
    public String FIO;
    public String num;
    Person(String age, String FIO, String num){
        this.age = age;
        this.FIO = FIO;
        this.num = num;
    }
    public String getAge() {
        return this.age;
    }
}
class Student extends Person{
    public String course;
    public String facult;
    private int data;

    Student(String age, String FIO, String num, String course, String facult, int data){
        super(age, FIO, num);
        this.course = course;
        this.facult = facult;
        this.data = data;
    }
    public int getData() {
        return this.data;
    }
}
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("17", "Соня Самариан", "89872781609","2", "Исторический", 23);
        students[1] = new Student("18", "Илья Шурпатов", "89532453445","3", "Исторический", 22 );
        students[2] = new Student("18","Дарья Куданова", "87777453445","3", "Филологический", 22 );
        System.out.println("Список студентов и их возраст: ");
        for(Student n:students){
            System.out.println(n.FIO +" "+ n.getAge());
        }
        System.out.println("введите факультет: ");
        Scanner in = new Scanner(System.in);
        String faculty = in.nextLine();
        boolean flag = true;
        for(Student n:students){
            if(n.facult.indexOf(faculty)!=-1) {
                System.out.println(n.FIO);
                flag = false;
            }
        }
        if(flag==true)
            System.out.println("такого факультета нет или он введен неправильно");
        System.out.println("введите год: ");
        int data = in.nextInt();
        for(Student n:students){
            if(n.getData()>data){
                System.out.println(n.FIO);
            }
        }
    }


}