//class Example {
//    private static Example example;
//    private double x;
//    private double y;
//    private Example(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//    public static Example getInstance(double x, double y) {
//        if (example == null){
//            example = new Example(x, y);
//        }
//        return example;
//    }
//    public double getX(){
//        return this.x;
//    }
//    public void setX(double x){
//        this.x = x;
//    }
//    public double getY(){
//        return this.y;
//    }
//    public void setY(double y){
//        this.y = y;
//    }
//    public double calculate(){
//        if (y != 0)
//            return 2*x+3/y;
//        else
//             throw new ArithmeticException("Division by zero");
//    }
//}

enum Example{
    EXAMPLE;
    public static Example getInstance(){
        return EXAMPLE;
    }
    public double calculate(double x, double y){
        if (y != 0)
            return 2*x+3/y;
        else
            throw new ArithmeticException("Division by zero");
    }
}
public class Main {
    public static void main(String[] args) {
//        Example example = Example.getInstance(5, 8);
//        System.out.println(example.calculate());
//        example.setX(7);
//        example.setY(3);
//        System.out.println(example.calculate());

        Example example = Example.getInstance();
        System.out.println(example.calculate(7,3));

    }
}