import java.io.*;
import java.util.Scanner;
class  Example implements Serializable{
    double x;
    double y;
    void function(){
        this.y = x - Math.sin(this.x);
    }
    Example(double x){
        this.x = x;
        function();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите save/upload/break: ");
        String choice = in.next();
        boolean flag = true;
        while (flag){
            if(choice.equalsIgnoreCase("save")){
                try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("examples.txt"))){
                    System.out.print("Введите x: ");
                    double z = in.nextDouble();
                    Example e = new Example(z);
                    oos.writeObject(e);
                    System.out.print("Файл сохранен\n");
                }
                catch (IOException ex) {
                    ex.printStackTrace(System.out);
                }
            }
            else if(choice.equalsIgnoreCase("upload")){
                try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("examples.txt"))){
                    Example e = (Example) ois.readObject();
                    System.out.print("Восстановленные данные: x = " + e.x +" y = "+e.y+"\n");
                }
                catch (IOException ex) {
                    ex.printStackTrace(System.out);
                }
                catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
            else if(choice.equalsIgnoreCase("break")){
                break;
            }
            else{
                flag = false;
            }
            System.out.print("Введите save/upload/break: ");
            choice = in.next();
        }
    }
}


