package exception;

public class ThrowsDemo {
    public static void main(String[] args) {
        // throws: lan truyền ngoại lệ
        try{
            check(16);
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void check(int age) throws IllegalAccessException {
        if(age < 18) {
            throw new IllegalAccessException("Chưa đủ 18 tuổi");
        } else {
            System.out.println("Bạn đủ 18 tuổi");
        }
    }
}
