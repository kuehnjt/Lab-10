import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class testSelectionSort {
        @Test
        public void test() {
                testPositive();
                testNegative();
                testMixed();
                testDuplicates();
        }

    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        SelectionSort sorter = new SelectionSort();
        System.out.println("Original Array (Positive): " + java.util.Arrays.toString(arr));
        int[] result = sorter.basicSelectionSort(arr);
        System.out.println("Sorted Array (Positive): " + java.util.Arrays.toString(result));
        System.out.println("Expected Sorted Array (Positive): " + java.util.Arrays.toString(Sortedarr));
        assertArrayEquals(Sortedarr, result);
    }

    public void testNegative(){

        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;

        SelectionSort sorter = new SelectionSort();
        System.out.println("Original Array (Negative): " + java.util.Arrays.toString(arr));
        int[] result = sorter.basicSelectionSort(arr);
        System.out.println("Sorted Array (Negative): " + java.util.Arrays.toString(result));
        System.out.println("Expected Sorted Array (Negative): " + java.util.Arrays.toString(Sortedarr));
        assertArrayEquals(Sortedarr, result);
    }

    public void testMixed(){

    /** Test data contains with both positive, negative and zeros **/
    }

    public void testDuplicates(){

    /** Test data contains duplicates **/
    }
}