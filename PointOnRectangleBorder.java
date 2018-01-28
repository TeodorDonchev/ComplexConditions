import java.util.Scanner;

/**
 * Created by teodor donchev on 1/27/2018.
 */
public class PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());

        boolean borderX = (x == x1 || x == x2) && (y >= y1 && y <= y2);
        boolean borderY = (y == y1 || y == y2) && (x >= x1 && x <= x2);

        if(borderX || borderY){
            System.out.println("Border");
        }else{
            System.out.println("Inside / Outside");
        }
    }
}
