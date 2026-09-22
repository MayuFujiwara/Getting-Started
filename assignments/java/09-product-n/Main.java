import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your solution here.
        int a = Integer.parseInt(scanner.nextLine()); 
        long b = scanner.nextLong();
        long c = 0;
        for(int i = 0; i < a - 1; i++){
            c = scanner.nextLong();
            b *= c;
            b %= 1000000007;
        }

        IO.print(b);
    }
}
