package exception;

import java.util.Locale;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            int a = 1/1;
            System.out.println(a);

            int[] numbers = {1,2,3};
            System.out.println("numbers[10] = " + numbers[4]);

            String s = null;
            System.out.println("s.toUpperCase() = " + s.toUpperCase());
        } catch(ArithmeticException e) {
            System.out.println("Can not divide by zero");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Luôn được gọi");
        }

    }
}
