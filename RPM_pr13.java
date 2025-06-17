interface Tovar{
    public void Name(String name);
    public void Price(String price);
    public void Rating(String rating);
}
class Divan implements Tovar{
    String name;
    String price;
    String rating;
    Divan(String name, String price, String rating){
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    @Override
    public void Name(String name){
        System.out.println("название: " + name);
    }
    @Override
    public void Price(String price){
        System.out.println("цена: " + price);
    }
    @Override
    public void Rating(String rating) {
        System.out.println("рейтинг: " + rating);
    }
}

class Stol implements Tovar{
    String name;
    String price;
    String rating;
    Stol(String name, String price, String rating){
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    @Override
    public void Name(String name){
        System.out.println("название: " + name);
    }
    @Override
    public void Price(String price){
        System.out.println("цена: " + price);
    }
    @Override
    public void Rating(String rating) {
        System.out.println("рейтинг: " + rating);
    }
}
class Stul implements Tovar{
    String name;
    String price;
    String rating;
    Stul(String name, String price, String rating){
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    @Override
    public void Name(String name){
        System.out.println("название: " + name);
    }
    @Override
    public void Price(String price){
        System.out.println("цена: " + price);
    }
    @Override
    public void Rating(String rating) {
        System.out.println("рейтинг: " + rating);
    }
}
interface User{
    public void Log(String log);
    public void Pass(String pass);

}
class Teacher implements User {
    String FIO;
    String log;
    String pass;
    Teacher(String FIO, String log, String pass) {
        this.FIO = FIO;
        this.log= log;
        this.pass = pass;
    }
    @Override
    public void Log(String log){
        System.out.println(FIO + " логин: "+log);
    }
    @Override
    public void Pass(String pass){
        System.out.println(FIO +" пароль: " + pass);
    }

}
class Student implements User {
    String FIO;
    String log;
    String pass;
    Student(String FIO, String log, String pass) {
        this.FIO = FIO;
        this.log= log;
        this.pass = pass;
    }
    @Override
    public void Log(String log){
        System.out.println(FIO + " логин: " + log);
    }
    @Override
    public void Pass(String pass){
        System.out.println(FIO  +" пароль: " + pass);
    }
}
class Personal implements User {
    String FIO;
    String log;
    String pass;
    Personal(String FIO, String log, String pass) {
        this.FIO = FIO;
        this.log= log;
        this.pass = pass;
    }
    @Override
    public void Log(String log){
        System.out.println(FIO + " логин: " + log);
    }
    @Override
    public void Pass(String pass){
        System.out.println(FIO  +" пароль: " + pass);
    }
}
class Buy implements Tovar, User{
    String FIO;
    String log;
    String pass;
    String name;
    String price;
    String rating;
    Buy(String FIO, String log, String pass, String name, String price, String rating) {
        this.FIO = FIO;
        this.log= log;
        this.pass = pass;
        this.name = name;
        this.price = price;
        this.rating = rating;

    }
    @Override
    public void Name(String name){
        System.out.println("название: " + name);
    }
    @Override
    public void Price(String price){
        System.out.println("цена: " + price);
    }
    @Override
    public void Rating(String rating) {
        System.out.println("рейтинг: " + rating);
    }
    @Override
    public void Log(String log){
        System.out.println( "логин: " + log);
    }
    @Override
    public void Pass(String pass){
        System.out.println( "пароль: " + pass);
    }
    public void Vivod(String FIO, String name){
        System.out.println("Пользователь "+ FIO+" купил товар с названием "+ name );
    }
}

public class Main {
    public static void main(String[] args) {
        Divan divan = new Divan("Леопард", "20", "1");
        divan.Name(divan.name);
        divan.Price(divan.price);
        divan.Rating(divan.rating);
        Stol stol = new Stol("Парижский", "7", "6");
        stol.Name(stol.name);
        stol.Price(stol.price);
        stol.Rating(stol.rating);
        Stul stul = new Stul("Офисный", "3", "3");
        stul.Name(stul.name);
        stul.Price(stul.price);
        stul.Rating(stul.rating);
        Student student = new Student("П.О.Д", "adsga", "567");
        student.Log(student.log);
        student.Pass(student.pass);
        Teacher teacher = new Teacher("В.О.Д", "вапва", "134");
        teacher.Log(teacher.log);
        teacher.Pass(teacher.pass);
        Personal personal = new Personal("Н.Л.А", "вапва", "134");
        personal.Log(personal.log);
        personal.Pass(personal.pass);
        Buy buy = new Buy("П.О.Д", "adsga", "567", "Леопард", "20", "1");
        buy.Vivod(buy.FIO, buy.name);


    }
}