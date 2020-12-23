import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fio {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File file = new File(path);
        Scanner scanner1 = new Scanner(file);
        String surname = scanner.nextLine();
        String a = scanner1.nextLine();
        String[]b = a.split(";");
        for (int i = 0; i < b.length; i++) {
            boolean c = b[i].contains(surname);
            if(b[i].contains(surname)){
                System.out.println(b[i]);
            }
        }
    }
}
