import java.util.Scanner;

/**
 * Created by teodor donchev on 1/27/2018.
 */
public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        if (!(number == 0 || number >= 100 && number <= 200)) {
            System.out.println("invalid");
        }
    }
}

