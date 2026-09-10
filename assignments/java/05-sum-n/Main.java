import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your solution here.
        int a = scanner.nextInt();
        long b = 0;
        for(int i = 0; i < a; i++){
            b += scanner.nextInt();
        }
        IO.print(b);
    }
}
