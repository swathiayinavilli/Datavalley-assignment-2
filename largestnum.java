import java.util.Arrays;

public class SecondThirdLargestSum {
    public static void main(String[] args) {
        int[] values = {10, 51, 53, 39, 47, 44, 21};
        int sum = findSecondThirdLargestSum(values);
        System.out.println("Sum of the 2nd and 3rd largest numbers: " + sum);
    }

    public static int findSecondThirdLargestSum(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array should contain at least two elements.");
            return 0;
        }

        Arrays.sort(arr);

        int n = arr.length;


        int firstLargest = arr[n - 1];
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < firstLargest) {
                secondLargest = arr[i];
                break;
            }
        }

        for (int i = n - 3; i >= 0; i--) {
            if (arr[i] < secondLargest) {
                thirdLargest = arr[i];
                break;
            }
        }

        return secondLargest + thirdLargest;
    }
}
