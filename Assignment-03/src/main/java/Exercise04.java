import java.util.Scanner;

public class Exercise04 {
    void question01() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == ' ') continue;
            count++;
        }
        System.out.println("count = " + count);
    }
}
