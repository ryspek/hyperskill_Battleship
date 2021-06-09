import java.util.Scanner;

public class Main {

    public static int sign(int number) {
        if (0 > number) {
            return -1;
        } else if (0 == number) {
            return 0;
        }
        return 1;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}