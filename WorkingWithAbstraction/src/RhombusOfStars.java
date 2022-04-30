import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int i = 0; i < row; i++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int row = n - 2; row >= 0; row--) {
            for (int col = n - row - 1; col > 0; col--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int i = row; i > 0; i--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}