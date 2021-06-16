class FixingExceptions {

    public static void calculateSquare(int[] array, int index) {
        try {
            System.out.println(array[index] * array[index]);
        } catch (Exception ex) {
            System.out.println("Exception!");
        }
    }

}