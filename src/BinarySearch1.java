import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        int[] n1 = new int[n];
        int[] k1 = new int[k];

        for (int i = 0; i < n; i++) {
            n1[i] = scanner.nextInt();
        }

        for (int i = 0; i < k; i++) {
            k1[i] = scanner.nextInt();

            int answer = Arrays.binarySearch(n1, k1[i]);

            if(answer>=0){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
