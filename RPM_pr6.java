import java.util.Arrays;
import java.util.Scanner;
class Reader{
    String FIO;
    String cardnum;
    String facult;
    String birth;
    String phone;
    Reader(String FIO,String cardnum,String facult,String birth,String phone){
        this.FIO = FIO;
        this.cardnum = cardnum;
        this.facult = facult;
        this.birth = birth;
        this.phone = phone;
    }
    public String toString() {
        return "[" + FIO  + ", " + cardnum+ ", " + facult  + ", " + birth+ ", " + phone  + "]";
    }
    public void takeBook(int col){
        System.out.printf("%s взял %d книг/и\n", FIO, col);
    }
    public void takeBook(String ... proizv){
        String pr = String.join(", ", proizv);
        System.out.printf("%s взял книги: %s\n", FIO, pr);
    }
    public void returnBook(int col){
        System.out.printf("%s вернул %d книг/и\n", FIO, col);
    }
    public void returnBook(String ... proizv){
        String pr = "";
        for(String i : proizv){
            pr = pr + i + ", ";
        }
        System.out.printf("%s вернул книги: %s\n", FIO, pr);
    }
}
public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[5];
        for (int i = 0; i < readers.length; i++) {
                System.out.println("Введите ФИО читателя:");
                String FIO = vvodS();
                System.out.println("Введите номер читательского билета:");
                String cardnum = vvodS();
                System.out.println("Введите факультет:");
                String facult = vvodS();
                System.out.println("Введите дату рождения:");
                String birth = vvodS();
                System.out.println("Введите телефон:");
                String phone = vvodS();
                readers[i] = new Reader(FIO, cardnum, facult, birth, phone);
        }
        System.out.println(Arrays.toString(readers));
        System.out.println("Введите ФИО из списка: ");
        String str = vvodS();
        int FIO = -1;
        for(int i = 0; i< readers.length; i++){
            if(readers[i].FIO.indexOf(str)!=-1)
                FIO = i;
        }
        if(FIO != -1){
            System.out.println("Введите количество книг: ");
            int col = vvodD();
            String[] proizv = new String[col];
            for (int i = 0; i<col; i++){
                System.out.printf("Введите название %d произведения: ", i +1);
                proizv[i] = vvodS();
            }
            readers[FIO].takeBook(col);
            readers[FIO].takeBook(proizv);
            readers[FIO].returnBook(col);
            readers[FIO].returnBook(proizv);
        }
        else
            System.out.println("Такого ФИО нет в списке!");
    }
    static String vvodS(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        return str;
    }
    static int vvodD(){
        Scanner in = new Scanner(System.in);
        int col = in.nextInt();
        return col;
    }
}
