import java.time.LocalDate;

public class DataTypeDemo {
    public static void main(String[] args) {
        // Cú pháp khởi tạo biến
        // <Kiểu dữ liệu><Tên biến> =  [Giá trị khởi tạo];

        // Kiểu số nguyên: byte, short, int (mặc định), long
        // Giá trị mặc định: 0
        int age = 18;
        System.out.println("age = " + age);
        long time = 800L;

        // Kiểu số thực: float, double (mặc định)
        // Giá trị mặc định: 0.0
        float score = 9.5f;
        System.out.println("score = " + score);

        // Kiểu boolean: true, false (mặc định)
        boolean isLoading = true;
        System.out.println("isLoading = " + isLoading);

        // Kiểu kí tự: char (2 bytes)
        // Bọc trong dấu nháy đơn
        // Giá trị mặc đinh: \u0000
        char c = 'h';
        System.out.println("c = " + c);

        // Kiểu chuỗi kí tự: String
        // Bọc trong dấu nháy kép
        // Giá trị mặc định: null
        String email = "huy@gmail.com";
        System.out.println("email = " + email);

        // Kiểu thời gian: LocalDate, LocalTime, LocalDateTime
        // Giá trị mặc định: null
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);

        // Kiểu enum
        // Giá trị mặc định: null
        Gender gender = Gender.MALE;
        System.out.println("gender = " + gender);

        // Kiểu mảng: array
        // Giá trị mặc định: null
        int[] numbers = {1, 2, 3, 4 ,5};
        String[] fruits = new String[]{"Táo", "Cam", "Dâu"};
        // Chỉ số của mảng bắt đầu từ 0
        System.out.println("fruits[0] = " + fruits[0]);
        System.out.println("fruits.length = " + fruits.length); // Độ dài mảng
        System.out.println("fruits[fruits.length - 1] = " + fruits[fruits.length - 1]);

    }
}
