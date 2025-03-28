import java.util.*;

public class largeNoArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 0, 54, 53, 32, 43, 25, 23};
        Arrays.sort(arr);
        int arraySize = arr.length;
        int largestEle = arr[arr.length-1];

        System.out.println("The Sorted array is: " + Arrays.toString(arr));
        System.out.println(arraySize);

        System.out.println("Largest Element is : "+largestEle );

    }
}
