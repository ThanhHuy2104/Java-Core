public class ForIndexDemo {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }

        int[] numbers = new int[]{6, 324, 12, 234, 21, 55};
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[i] = " + numbers[i]);
        }

    }
}
