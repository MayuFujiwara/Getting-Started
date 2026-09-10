import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your solution here.
        int a = Integer.parseInt(scanner.nextLine());
        int b = 0;
        int c = 0;
        c = scanner.nextInt();
        for(int i = 0; i < a - 1; i++){
            b = scanner.nextInt();
            c %= b;
        }

        System.out.print(c);
    }
}
