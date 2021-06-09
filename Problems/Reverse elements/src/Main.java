class ArrayOperations {

    public static void reverseElements(int[][] twoDimArray) {
        for (int i = 0; i < twoDimArray.length; i++) {
            int start = 0;
            int end = twoDimArray[0].length - 1;
            while (start < end) {
                int temp = twoDimArray[i][start];
                twoDimArray[i][start++] = twoDimArray[i][end];
                twoDimArray[i][end--] = temp;
            }
        }
    }

}