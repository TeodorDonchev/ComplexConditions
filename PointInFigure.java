import java.util.Scanner;

/**
 * Created by teodor donchev on 1/28/2018.
 */
public class PointInFigure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int h = Integer.parseInt(scan.nextLine());
        int x = Integer.parseInt(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());

        if ((x > h) && (x < 2 * h) && (y == h)) {
            System.out.println("inside");
        }
        else if ((x >= h) && (x <= 2 * h) && (y >= h) && (y <= 4 * h)) {
            if ((x > h) && (x < 2 * h) && (y > h) && (y < 4 * h)) {
                System.out.println("inside");
            }
            else if ((x >= h) && (x <= 2 * h) || (y >= h) && (y <= 4 * h)) {
                System.out.println("border");
            }
        }

        else if ((x >= 0) && (x <= 3 * h) && (y >= 0) && (y <= h)){
            if ((x > 0) && (x < 3 * h) && (y > 0) && (y < h)) {
                System.out.println("inside");
            }
            else if ((x >= 0) && (x <= 3 * h) || (y >= 0) && (y <= h)) {
                System.out.println("border");
            }
        }
        else {
            System.out.println("outside");
        }
    }
}
