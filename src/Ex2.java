import java.util.Scanner;

public class Ex2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int times = scanner.nextInt();
        for (int i = 0; i < times; i++) {
            program1();
        }
    }
    public static void program1() {
        String pattern1 = "*[^20]2020";
        String pattern2 = "2*[^20]020";
        String pattern3 = "20*[^20]20";
        String pattern4 = "202*[^20]0";

        int n = Integer.parseInt(scanner.nextLine());
        String[] arr = scanner.nextLine().split("");




    }
}
