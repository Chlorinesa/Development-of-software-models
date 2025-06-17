import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] x = new int[12];
        int s = 0;
        for (int i = 0; i < x.length; i++) {
            x[i] = ((int) ((Math.random() * 100)) - 50);
            if(x[i]>0)
            {
                s++;
            }
        }
        System.out.println("Было");
        System.out.println(Arrays.toString(x));
        int[] y = new int[s];
        for(int j = 0; j < y.length; j++) {
            for(int i = 0; i < x.length; i++){
                if (x[i] > 0) {
                    y[j] = x[i];
                    j++;
                }
            }
        }
        shakerSort(y);
        System.out.println("Стало");
        for(int j = 0; j < y.length; j++) {
            for(int i = 0; i < x.length; i++){
                if (x[i] > 0) {
                    x[i] = y[j];
                    j++;
                }
            }
        }
        System.out.println(Arrays.toString(x));
    }
    public static void shakerSort(int[] values) {
        int left = 0;
        int right = values.length - 1;
        while(left < right) {
            for (int i = left; i < right; i++) {
                if (values[i] > values[i + 1]) {
                    int temp = values[i + 1];
                    values[i + 1] = values[i];
                    values[i] = temp;
                }
            }
            --right;
            for (int i = right; i > left; i--) {
                if (values[i] < values[i - 1]){
                    int temp = values[i];
                    values[i] = values[i - 1];
                    values[i - 1] = temp;
                }

            }
            ++left;

        }
    }}
