package BitwiseOperations.Lab;

import java.util.Scanner;

public class BitDestroyer_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int position = Integer.parseInt(scanner.nextLine());

        int mask = ~(1 << position);

        int result = (n & mask);

        System.out.println(result);
    }
}
