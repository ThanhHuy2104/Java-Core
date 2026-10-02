package exception;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try{
            int age = 15;
            if(age < 18) {
                throw new InvalidAgeException("Chưa đủ 18 tuổi");
            } else{
                System.out.println("Bạn đủ 18 tuổi");
            }
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}
