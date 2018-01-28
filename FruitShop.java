import java.util.Scanner;

/**
 * Created by teodor donchev on 1/27/2018.
 */
public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        boolean isWeekend = day.equals("Sunday") || day.equals("Saturday");
        boolean isDayOfWeek = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                day.equals("Thursday") || day.equals("Friday");


        double price;

        if(isDayOfWeek){
            switch (product){
                case "banana":
                    price = 2.50;
                    break;
                case "apple":
                    price = 1.20;
                    break;
                case "orange":
                    price = 0.85;
                    break;
                case "grapefruit":
                    price = 1.45;
                    break;
                case "kiwi":
                    price = 2.70;
                    break;
                case "pineapple":
                    price = 5.50;
                    break;
                case "grapes":
                    price = 3.85;
                    break;
                default:
                    System.out.println("error");
                    return;
            }
        }
        else if(isWeekend){
            switch (product){
                case "banana":
                    price = 2.70;
                    break;
                case "apple":
                    price = 1.25;
                    break;
                case "orange":
                    price = 0.90;
                    break;
                case "grapefruit":
                    price = 1.60;
                    break;
                case "kiwi":
                    price = 3.00;
                    break;
                case "pineapple":
                    price = 5.60;
                    break;
                case "grapes":
                    price = 4.20;
                    break;
                default:
                    System.out.println("error");
                    return;
            }
        }
        else{
            System.out.println("error");
            return;
        }
        System.out.printf("%.2f", price * quantity);
    }
}
