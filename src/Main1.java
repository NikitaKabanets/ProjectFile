import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int etaji = scanner.nextInt();
        int podiezdi = scanner.nextInt();
        int box = scanner1.nextInt();

        int podiezd = (int)Math.ceil(box/(9*etaji));
        int ostatok = box-(podiezdi-1) * (9 * etaji);
        int etaj = (int)Math.ceil(ostatok/(9 * etaji));
        int ostatok1 = ostatok-((etaj-1)*9);

        if(ostatok1>0 & ostatok1<=3){
            System.out.println(podiezd + " " + etaj + " 1");
        } else if(ostatok1>3 & ostatok1<=5) {
            System.out.println(podiezd + " " + etaj + " 2");
        } else if(ostatok1>5 & ostatok1 <=8) {
            System.out.println(podiezd + " " + etaj + " 3");
        } else if(ostatok1 == 9) {
            System.out.println(podiezd + " " + etaj + " 4");
        }
        }
    }

