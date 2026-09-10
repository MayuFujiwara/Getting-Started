import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your solution here.
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        System.out.print((a * b)%1000000007);
    }
}
