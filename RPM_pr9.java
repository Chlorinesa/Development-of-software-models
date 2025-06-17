import java.util.Scanner;
class Student{
    private String FIO;
    private int data;
    private String address;
    private String phone;
    private String course;
    private String faculty;
    public Student(String FIO, int data, String address,String phone, String course,String faculty){
        this.FIO = FIO;
        this.data = data;
        this.address = address;
        this.phone = phone;
        this.course = course;
        this.faculty = faculty;

    }
    public String getFIO(){
        return this.FIO;
    }
    public void setFIO(String FIO){
        this.FIO = FIO;
    }
    public int getData(){
        return this.data;
    }
    public void setData(int data){
        this.data= data;
    }
    public String getAddress(){
        return this.address;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getCourse(){
        return this.course;
    }
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    public String getFaculty(){
        return this.faculty;
    }

}
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Соня Самариан",22, "ул N1", "89872781609","2", "Исторический");
        students[1] = new Student("Илья Шурпатов", 23,"ул N2", "89532453445","2", "Исторический" );
        students[2] = new Student("Дарья Куданова", 21,"ул N3", "87777453445","4", "Филологический" );
        System.out.println("Список студентов: ");
        for(Student n:students){
            System.out.println(n.getFIO());
        }
        System.out.println("введите факультет: ");
        Scanner in = new Scanner(System.in);
        String faculty = in.nextLine();
        boolean flag = true;
        for(Student n:students){
            if(n.getFaculty().indexOf(faculty)!=-1) {
                System.out.println(n.getFIO());
                flag = false;
            }
        }
        if(flag==true)
            System.out.println("такого факультета нет или он введен неправильно");
        System.out.println("введите год: ");
        int data = in.nextInt();
        for(Student n:students){
            if(n.getData()>data){
                System.out.println(n.getFIO());
            }
        }
    }
}