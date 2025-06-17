class First{
    String name;
    String sname;
    String birth;
    First(String  name, String sname, String birth){
        this.name = name;
        this.sname = sname;
        this.birth = birth;
    }
    public static void Vivod(String name, String title, String brand){
        System.out.printf("%s читает книгу %s про машину %s", name, title, brand);
    }
}
class Second{
    String brand;
    String yearM;
    String engine;
    Second(String  brand, String yearM, String engine){
        this.brand = brand;
        this.yearM = yearM;
        this.engine = engine;
    }
}
class Third{
    public String title;
    String autor;
    String yearM2;
    Third(String  title, String autor, String yearM2){
        this.title = title;
        this.autor = autor;
        this.yearM2 = yearM2;
    }
}

public class Main {
    public static void main(String[] args) {
        First person = new First("Соня", "Cамариан", " 2003");
        System.out.println(person.name + ", " + person.sname + ", " + person.birth);
        Second car = new Second("audi", "2008", "2.2");
        System.out.println(car.brand + ", " + car.yearM + ", " + car.engine);
        Third book = new Third("Война и мир", "Лев Толстой", "1865");
        System.out.println(book.title+", "+book.autor + ", " + book.yearM2);
        First.Vivod(person.name, book.title, car.brand);
    }
}