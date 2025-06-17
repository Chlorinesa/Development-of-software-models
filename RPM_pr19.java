enum Size {
    XXS(32) {
        @Override
        public String getDescription(){
            return "Детский размер";
        }
    },
    XS(34), S(36), M(38), L(40);
    int euroSize;
    Size(int euroSize) {
        this.euroSize = euroSize;
    }
    public String getDescription() {
        return "Взрослый размер";
    }
}
interface manClothes {
    void dressM();
}
interface womanClothes {
    void dressW();
}
abstract class Clothes{
    Size size;
    String price;
    String color;
    Clothes(Size size, String price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }
    public String toString() {
        return  size+ ", " +price+ ", " +color;
    }
}
class Shirt extends Clothes implements manClothes, womanClothes{
    Shirt(Size size, String price, String color) {
        super(size, price, color);
    }

    public void dressM() {
        System.out.println("Футболка мужчины: "+ this);
    }

    public void dressW() {
        System.out.println("Футболка женщины: " + this);
    }
}
class Pants extends Clothes implements manClothes, womanClothes{

    Pants(Size size, String price, String color) {
        super(size, price, color);
    }

    public void dressM() {
        System.out.println("Штаны мужчины: " + this);
    }

    public void dressW() {
        System.out.println("Штаны женщины: " + this);
    }
}
class Skirt extends Clothes implements womanClothes{
    Skirt(Size size, String price, String color) {
        super(size, price, color);
    }

    public void dressW() {
        System.out.println("Юбка женщины: " + this);
    }
}
class Tie extends Clothes implements manClothes{
    Tie(Size size, String price, String color) {
        super(size, price, color);
    }

    public void dressM() {
        System.out.println("Галстук мужчины: " + this);
    }
}
class Atelier {
    public void dressM(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof manClothes) {
                ((manClothes) c).dressM();
            }
        }
    }
    public void dressW(Clothes[] clothes) {
        for (Clothes c : clothes){
            if (c instanceof womanClothes){
                ((womanClothes) c).dressW();
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(args[0]);
        Clothes[] clothes = new Clothes[]{
            new Shirt(Size.S, "1000", "blue"),
            new Pants(Size.M, "1000", "blue"),
            new Skirt(Size.XXS, "1000", "blue"),
            new Tie(Size.XS, "500", "blue"),
        };
        Size d = Size.L;
        System.out.println(d);
        Atelier atelier = new Atelier();
        atelier.dressM(clothes);
        atelier.dressW(clothes);
    }
}