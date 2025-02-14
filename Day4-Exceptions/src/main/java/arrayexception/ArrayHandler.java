package arrayexception;

import java.util.Scanner;

public class ArrayHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of elements in the array: ");
            int size = scanner.nextInt();
            Integer[] arr = (size > 0) ? new Integer[size] : null;

            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.print("Enter index to retrieve value: ");
            int index = scanner.nextInt();

            int value = getValueAtIndex(arr, index);
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } finally {
            scanner.close();
        }
    }

    public static int getValueAtIndex(Integer[] arr, int index) {
        return arr[index];  // May throw ArrayIndexOutOfBoundsException or NullPointerException
    }
}
