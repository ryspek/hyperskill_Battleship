import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int units = scanner.nextInt();
        String message = "";
        if (units < 1) {
            message = "no army";
        }
        if (units >= 1 && units <= 19) {
            message = "pack";
        }
        if (units >= 20 && units <= 249) {
            message = "throng";
        }
        if (units >= 250 && units <= 999) {
            message = "zounds";
        }
        if (units >= 1000) {
            message = "legion";
        }
        System.out.println(message);
    }
}