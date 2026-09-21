public class SwitchCaseDemo {
    public static void main(String[] args) {
        int month = 2;
        switch (month) {
            case 1:
                System.out.println("Có 31 ngày");
                break;
            case 2:
                System.out.println("Có 28 hoặc 29 ngày");
                break;
            default:
                System.out.println("Có 31 ngày");
                break;
        }
    }
}
