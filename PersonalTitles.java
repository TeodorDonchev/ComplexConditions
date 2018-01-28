import java.util.Scanner;

/**
 * Created by teodor donchev on 1/27/2018.
 */
public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double age = Double.parseDouble(scan.nextLine());
        String gender = scan.nextLine();

        String result;

        if (gender.equals("m") && age >= 16) {
            result = "Mr.";
        } else if (gender.equals("m") && age < 16) {
            result = "Master";
        } else if (gender.equals("f") && age >= 16) {
            result = "Ms.";
        } else {
            result = "Miss";
        }

        System.out.println(result);
    }
}
