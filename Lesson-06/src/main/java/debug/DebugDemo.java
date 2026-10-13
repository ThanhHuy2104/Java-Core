package debug;

public class DebugDemo {
    public static void main(String[] args) {
        // Break Point: Điểm dừng
        // Step Into: Chạy từng dòng code (Chạy vào trong hàm)
        // Step Over: Chạy từng dòng code (Chạy qua hàm)
        // Step Out: Thoát khỏi hàm
        System.out.println("main: Dòng 1");
        System.out.println("main: Dòng 2");
        System.out.println("main: Dòng 3");
        steps();

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    public static void steps() {
        System.out.println("Dòng 1");
        System.out.println("Dòng 2");
        System.out.println("Dòng 3");
    }
}
