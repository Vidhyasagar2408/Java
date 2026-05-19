import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements to be inserted in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key to be searched: ");
        int key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(arr[i]==key) {
                System.out.println("key found at " + i + "index");
                break;5
            }
        }
        System.out.println("not found");
    }
}