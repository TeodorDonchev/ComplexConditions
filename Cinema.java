import java.util.Scanner;

/**
 * Created by teodor donchev on 1/27/2018.
 */
public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();
        double columns = Double.parseDouble(scan.nextLine());
        double rows = Double.parseDouble(scan.nextLine());

        double cinema = columns * rows;
        double price = 0;

        switch (type)
        {case "Premiere":
                price = 12.00;
                break;
            case "Normal":
                price = 7.50;
                break;
            case "Discount":
                price = 5.00;
                break;
        }

        System.out.printf("%.2f leva", cinema * price);
    }
}
