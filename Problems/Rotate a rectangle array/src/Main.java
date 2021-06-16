import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        int[][] array = createArrayFromInput();

        int[][] rotatedArray = rotateArrayBy90DegreesClockwise(array);

        printArray(rotatedArray);
    }

    private static int[][] createArrayFromInput() {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }

    private static int[][] rotateArrayBy90DegreesClockwise(int[][] array) {
        int[][] result = new int[array[0].length][array.length];
        for (int i = 0; i < result.length; i++) {
            int rowIdx = array.length - 1;
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = array[rowIdx--][i];
            }
        }
        return result;
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}