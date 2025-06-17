import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] x = new int[12];
        for (int i = 0; i < x.length; i ++){
            x[i] = ((int)((Math.random()*100))-50);
        }
        System.out.println("Было");
        System.out.println(Arrays.toString(x));
        int low = 0;
        int high =  x.length-1;
        quickSort(x, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
    }
    public static void quickSort(int[] array, int low, int high) {
        if(array.length == 0||low >= high)
            return;
        int middle = low +(high -low)/2;
        int i = low, j = high;
        int opora = array[middle];
        while(i<j ){
            while (array[i] < opora && array[i] > 0){
                i++;
            }
            while (array[j] > opora && array[j] > 0){
                j--;
            }
            if(i<=j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }}
        if(low < j){quickSort(array, low, j);}
        if(i < high){quickSort(array, i, high);}
        }}
