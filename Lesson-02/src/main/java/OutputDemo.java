import java.time.LocalDate;

public class OutputDemo {
    public static void main(String[] args) {
        // Escape Characters
        /*
        \': single quote
        \": double quote
        \\ backslash
        \n new line
        \t tab
         */
        System.out.println(1);
        System.err.println(2);

        System.out.print(3 + "\n");
        System.out.print(4 + "\n");

        // Ký tự đại diện
        /*
        %d: Số nguyên
        %f: Số thực
        %s: String
        %c: char
        %n: Xuống dòng
         */
        String fullName = "Huynh Thanh Huy";
        int age = 20;
        String address = "An Giang";
        System.out.printf("Tôi tên là: %s, năm nay tôi: %d tuổi, địa chỉ: %s%n", fullName, age, address);

        // %5s: Căn lề phải, chiếm 5 ô trống (-5: căn lề trái)
        System.out.printf("%5s%n", 100);

        // %.2f: Làm tròn 2 chữ số
        System.out.printf("%.2f%n", 123.789);

        // %,d: Gom 3 số
        System.out.printf("%,d%n", 12345678);

        // VD: Tạo bảng
        int[] ids = {1,2,3};
        String[] usernames = {"Huy", "Huân", "Hoàng"};
        System.out.println("+------+--------------------+");
        System.out.println("|  ID  |      USERNAME      |");
        System.out.println("+------+--------------------+");
        for (int i = 0; i < 3; i++) {
            System.out.printf("| %4d | %-18s |%n", ids[i], usernames[i]);
            System.out.println("+------+--------------------+");

        }
        LocalDate minDate = LocalDate.now().minusYears(1); // Trừ đi 1 năm
    }
}
