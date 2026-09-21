public class ReturnDemo {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5};
        int n = 2;
        int indexOfTwo = indexOf(numbers, n);
        System.out.println("indexOfTwo = " + indexOfTwo);
    }

    static int indexOf(int[] numbers, int n) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
