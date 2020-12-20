import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream file = new FileInputStream("C:\\Users\\student\\Desktop\\ФИО.txt");
        Scanner scanner = new Scanner(file);
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();

        a.split(";");
        HashMap<String, String> NamesAndSurenames = new HashMap<>();




}
}

