import java.util.LinkedList;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int non = scanner.nextInt();
        int amount = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < amount; i++) {
            int [] arr = new int[amount];
            int low = 0;
            int high = arr.length-1;
            arr[i] = scanner.nextInt();
            list.add(arr[low]);
            list.add(arr[high]);
            low++;
            high--;
        }
    }
}
