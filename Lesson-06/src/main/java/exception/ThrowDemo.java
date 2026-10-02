package exception;

public class ThrowDemo {
    public static void main(String[] args) {
        // throw: chủ động ném ra ngoại lệ
        try{
            int age = 15;
            if(age < 18) {
                throw new IllegalAccessException("Chưa đủ 18 tuổi");
            } else{
                System.out.println("Bạn đủ 18 tuổi");
            }
        } catch (IllegalAccessException e) {
            System.err.println(e.getMessage());
        }

    }
}
