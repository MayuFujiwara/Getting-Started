import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your solution here.
        int a = Integer.parseInt(scanner.nextLine());
        int[] b = new int[a];
        for(int i = 0; i < a; i++){
            b[i] = scanner.nextInt();
        }

        for(int i = a - 1; i >= 0; i--){
            IO.print(b[i] + " ");
        }
    }
}
