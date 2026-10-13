package assignment;

import java.util.Scanner;

public class ScannerUtil {
    private Scanner scanner = new Scanner(System.in);
    public int InputInt() {
        while(true) {
            try {
                String input = scanner.nextLine();
                int n = Integer.parseInt(input);
                return n;
            } catch (NumberFormatException e) {
                System.err.println("Yêu cầu nhập vào số nguyên");
            }
        }
    }

    public int InputPositiveInt() {
        while(true) {
            try {
                String input = scanner.nextLine();
                int n = Integer.parseInt(input);
                if(n < 0) {
                    throw new IllegalArgumentException("Yêu cầu nhập số dương");
                }
                return n;
            } catch(NumberFormatException e) {
                System.err.println("Yêu cầu nhập vào số nguyên");
            } catch(IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public String InputEmail() {
        while (true) {
            try {
                String input = scanner.nextLine();
                if(!input.contains("@")) {
                    throw new Exception("Yêu cầu nhập email có chứa @");
                }
                return input;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
