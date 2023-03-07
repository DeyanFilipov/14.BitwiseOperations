package BitwiseOperations.Lab;

import java.util.Scanner;

public class BitAtFirstPosition_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        n = n >> 1;

        System.out.println(n & 1);
    }
}
