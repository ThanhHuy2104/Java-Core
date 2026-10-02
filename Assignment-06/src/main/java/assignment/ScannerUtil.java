package assignment;

import java.util.Scanner;

public class ScannerUtil {
    private Scanner scanner = new Scanner(System.in);
    public int InputInt() {
        while(true) {
            try {
                String input = scanner.nextLine();
                int n = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.err.println("Yêu cầu nhập vào số nguyên");
            }

        }
    }
}
