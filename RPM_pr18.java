import java.util.Arrays;
interface Order{
    boolean order(int i, int j);
}
public class Main {
    public static void main(String[] args) {
    Order v = ( i, j) -> i > j ;
    Order u = ( i, j) -> j > i ;
    int[] mas1 = {1,5,9,11,23,4,6};
    int[] mas2 = {1,5,9,11,23,4,6};
    Sort(mas1, v);
    System.out.println("По возрастанию: \n" +Arrays.toString(mas1));
    Sort(mas2, u);
    System.out.println("По убыванию: \n" + Arrays.toString(mas2));
    }

    public static void Sort(int[] sortArr, Order order){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(order.order(sortArr[j], sortArr[j+1])) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }
}