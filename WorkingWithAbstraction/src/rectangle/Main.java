package rectangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        int[] coord = new int[inputArr.length];

        for (int i = 0; i < inputArr.length; i++) {
            coord[i] = Integer.parseInt(inputArr[i]);
        }

        Rectangle rectangle = new Rectangle(new Point(coord[0], coord[1]), new Point(coord[2], coord[3]));

        int numOfPoints = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfPoints; i++) {
            int pointX = scanner.nextInt();
            int pointY = scanner.nextInt();

            Point point = new Point(pointX, pointY);
            System.out.println(rectangle.contains(point));
        }
    }
}
