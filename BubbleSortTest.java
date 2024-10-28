import java.util.Arrays;

class BubbleSort {
    public void swap(int[] number, int i, int j) {
        int temp = number[i];
        number[i] = number[j];
        number[j] = temp;
    }

    public void bubbleSort(int[] number) {
        int n = number.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (number[j] > number[j + 1]) {
                    swap(number, j, j + 1);
                }
            }
        }
    }
}

public class BubbleSortTest {
    public static void main(String[] args) {
		
        int[] number = {8, 3, 1, 4, 5, 11, 7, 2, 17, 13};

        BubbleSort bubbleSort = new BubbleSort();

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(number));

        bubbleSort.bubbleSort(number);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(number));
    }
}