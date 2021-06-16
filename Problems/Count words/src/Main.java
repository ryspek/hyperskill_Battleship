import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int counter = 0;
            String charStr = reader.readLine();
            for (int i = 1; i < charStr.length(); i++) {
                if (!Character.isSpaceChar(charStr.charAt(i - 1)) && 1 == i) {
                    counter++;
                } else if (!Character.isSpaceChar(charStr.charAt(i)) && Character.isSpaceChar(charStr.charAt(i - 1))) {
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}