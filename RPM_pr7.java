import java.util.Arrays;
import java.util.Scanner;
class Product{
    String name;
    String manufact;
    String price;
    String shelfL;
    String col;
    Product(String name,String manufact,String price,String shelfL,String col){
        this.name = name;
        this.manufact = manufact;
        this.price = price;
        this.shelfL = shelfL;
        this.col = col;
    }
    public String toString() {
        return  "[" +name+ ", " +manufact+ ", " +price+ ", " +shelfL+ ", " +col+ "]";
    }
}
public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        for (int i = 0; i < products.length; i++) {
            System.out.println("Введите наименование: ");
            String name = vvod();
            System.out.println("Введите производителя: ");
            String manufact = vvod();
            System.out.println("Введите цену: ");
            String price = vvod();
            System.out.println("Введите срок хранения: ");
            String shelfL = vvod();
            System.out.println("Введите количество: ");
            String col = vvod();
            products[i] = new Product(name, manufact, price, shelfL, col);
        }
        System.out.println(Arrays.toString(products));
        System.out.println("Введите наименование: ");
        String str = vvod();
        boolean flag = false;
        for(int i = 0; i< products.length; i++){
            if(products[i].name.indexOf(str)!=-1){
                System.out.println(products[i]);
                flag = true;
            }
        }
        if(!flag)
            System.out.println("Такого наименования нет в списке ");
    }
    static String vvod(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        return str;
    }
}