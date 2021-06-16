import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String numStr = scanner.nextLine();
            try {
                int num = Integer.parseInt(numStr);
                if (0 == num) {
                    System.out.println();
                    break;
                }
                System.out.println(num * 10);
            } catch (NumberFormatException ex) {
                System.out.printf("Invalid user input: %s%n", numStr);
            }

        }
    }

}