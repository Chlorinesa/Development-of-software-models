import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите m: ");
        double n = in.nextDouble();
        System.out.println("Введите x: ");
        double x = in.nextDouble();
        double sum = 0;
        if (x > 0.5) {
            for (double i = 1; i <=n; i++) {
                double w = Math.pow(x - 1, i + 1) /((i + 1) * Math.pow(x + 1, i + 1));
                sum += w;
            }
            System.out.printf("ln x = %f", sum);
        }
        else
            System.out.println("Не входит в одз");



//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите n: ");
//        double n = in.nextDouble();
//        double rez = 3* n + 1;
//        double col = 0;
//            if (rez % 2 == 0) {
//                while(rez!= 1) {
//                    rez /=2;
//                    col++;
//                }
//            System.out.println(col+1);
//}
    }
}
