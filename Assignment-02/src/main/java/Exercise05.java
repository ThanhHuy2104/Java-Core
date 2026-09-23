import java.util.Scanner;

public class Exercise05 {
    void question05() {
        Scanner scanner = new Scanner(System.in);

        Account account = new Account();
        System.out.println("Nhập vào ID:");
        account.id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nhập vào email:");
        account.email = scanner.nextLine();

        Position position = new Position();
        System.out.println("Nhập vào position name");
        System.out.println("1. Dev");
        System.out.println("2. Test");
        System.out.println("3. Scrum Master");
        System.out.println("4. PM");
        int menu = scanner.nextInt();
        switch (menu) {
            case 1:
                position.name = PositionName.DEV;
                break;
            case 2:
                position.name = PositionName.TEST;
                break;
            case 3:
                position.name = PositionName.SCRUM_MASTER;
                break;
            case 4:
                position.name = PositionName.PM;
                break;
        }

        account.position = position;
        System.out.println("Thông tin nhân viên:");
        System.out.println("id = " + account.id);
        System.out.println("email = " + account.email);
        System.out.println("position = " + account.position.name);
    }
}
