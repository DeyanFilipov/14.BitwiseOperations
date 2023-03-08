package BitwiseOperations.Lab;

import java.util.Scanner;

public class TriBitSwitch_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int position = Integer.parseInt(scanner.nextLine());

        int mask = 7 << position;
        int result = n ^ mask;

        System.out.println(result);
    }
}
