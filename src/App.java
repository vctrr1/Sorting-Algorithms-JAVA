import java.util.Arrays;
import algorithms.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        BubbleSort bs = new BubbleSort();

        int arr[] = { 5, 1, 4, 2, 8 };

        System.out.println(Arrays.toString(bs.bubbleSort(arr)));

    }
}
