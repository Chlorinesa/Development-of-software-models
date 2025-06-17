import java.util.Scanner;
class Calc {
    double x, a, b;

    Calc(double x, double a, double b) {
        this.x = x;
        this.a = a;
        this.b = b;
    }

    void first() {
        System.out.printf("3*%f + 5 = %f \n", this.x, 3 * this.x + 5);
    }

    void second() {
        if (this.a == this.b)
            System.out.println("Деление на ноль");
        else
            System.out.printf("(%f + %f) / (%f - %f) = %f \n", this.a, this.b, this.a, this.b, (this.a + this.b) / (this.a - this.b));
    }
    //    int Y() {
//        if (this.b == 0) {
//            return -1;
//        }
//        return (int) Math.round(this.a * this.x / this.b);
//    }
//    int third(int y){
//        if(y==1||y==0){
//            return 1;
//        }
//        return y*third(y-1);
//    }
    void third() {
        int y = (int) Math.round(this.a * this.x / this.b);
        if (y == 0) System.out.println(1);
        else if (this.b == 0|| y<0 )System.out.println("Не определен");
        else {
            int F = 1;
            for (int i = 1; i <= y; i++) {
                F *= i;
            }
            System.out.printf("%f * %f/ %f! = %d", this.a, this.x, this.b,F);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите x: ");
        double x = vvod();
        System.out.println("Введите a: ");
        double a = vvod();
        System.out.println("Введите b: ");
        double b = vvod();
        Calc nums = new Calc(x,a,b);
        nums.first();
        nums.second();
        nums.third();
//        System.out.printf("%f * %f/ %f! = %d",nums.a,nums.x,nums.b, nums.third(nums.Y()));
    }
    public static double vvod(){
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        return num;
    }
}