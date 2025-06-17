class Animal {
   String food;
   String location;
   Animal(String food, String location) {
       this.food = food;
       this.location = location;
   }


    public void makeNoise() {
       System.out.println("Какое-то животное издает звук");
    };

    public void eat(){
        System.out.println("Какое-то животное ест");
    }
    public void sleep() {
        System.out.println("Такое-то животное спит");
    }

}
class Dog extends Animal {
    private String breed;
    Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }
    @Override
    public void makeNoise(){
        System.out.println("Собака лает");
    }
    @Override
    public void eat(){
        System.out.println("Собака ест "+ this.food);

    }
}
class Cat extends Animal {
    private String color;
    Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }
    @Override
    public void makeNoise(){
        System.out.println("Кошка мяукает");
    }
    @Override
    public void eat(){
        System.out.println("Кошка ест "+ this.food);

    }
}
class Horse extends Animal {
    private String hooves;
    Horse(String food, String location, String hooves) {
        super(food, location);
        this.hooves = hooves;
    }
    @Override
    public void makeNoise(){
        System.out.println("Лошадь ржёт");
    }
    @Override
    public void eat(){
        System.out.println("Лошадь ест "+ this.food);

    }
}
class Vet{
    static void treatAnimal(Animal animal){
        System.out.println("Животное ест " + animal.food+ " в локации " +animal.location);
    }
}
public class Main {
    public static void main(String[] args) {
        Dog a = new Dog("Мясо", "Двор", "Хаски");
        Cat b = new Cat("Молоко", "Квартира", "рыжий");
        Horse c = new Horse("Овес", "Конюшня", "черные");
        a.makeNoise();
        a.eat();
        a.sleep();
        Vet.treatAnimal(a);
        b.makeNoise();
        b.eat();
        b.sleep();
        Vet.treatAnimal(b);
        c.makeNoise();
        c.eat();
        c.sleep();
        Vet.treatAnimal(c);


        }
    }
