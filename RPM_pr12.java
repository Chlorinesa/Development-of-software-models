interface Person{
    public void Log(String log);
    public void Pass(String pass);

}
abstract class People implements Person{
    String FIO;
    String age;
    String doljnost;
    People(String FIO,String age, String doljnost){
        this.FIO =FIO;
        this.age = age;
        this.doljnost = doljnost;
    }
}
class Teacher extends People {
    String log;
    String pass;
    Teacher(String FIO, String age, String doljnost, String log, String pass) {
        super(FIO, age, doljnost);
        this.log= log;
        this.pass = pass;
    }
    @Override
    public void Log(String log){
        System.out.println(FIO + age+ doljnost + "логин: "+log);
    }
    @Override
    public void Pass(String pass){
        System.out.println(FIO + age+ doljnost +"пароль: " + pass);
    }

}
class Student extends People {
    String log;
    String pass;
    Student(String FIO, String age, String doljnost, String log, String pass) {
        super(FIO, age, doljnost);
        this.log= log;
        this.pass = pass;
    }
    @Override
    public void Log(String log){
        System.out.println(FIO + age+ doljnost + "логин: " + log);
    }
    @Override
    public void Pass(String pass){
        System.out.println(FIO + age+ doljnost +"пароль: " + pass);
    }


}
public class Main {
    public static void main(String[] args) {
    Student a = new Student("С.С.В ", "25 ", "студент ", "asd ", "123");
    a.Log(a.log);
    a.Pass(a.pass);
    Teacher b = new Teacher("Р.П.Г ", "40 ", "преподаватель ", "hfhg ", "987");
    b.Log(b.log);
    b.Pass(b.pass);
    }

}