import java.util.Scanner;

/**
 * Created by teodor donchev on 1/28/2018.
 */
public class Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String yearType = scan.nextLine();
        double holidays = Double.parseDouble(scan.nextLine());
        double gamesHome = Double.parseDouble(scan.nextLine());

        if (yearType.equals("normal")) {

            double gamesSofia = (48 - gamesHome) * 3 / 4;
            double holidayGames = holidays * 2 / 3;
            double games = gamesHome + gamesSofia + holidayGames;
            System.out.println(Math.floor(games));

        }else if (yearType.equals("leap")) {

            double gamesSofia = (48 - gamesHome) * 3 / 4;
            double holidayGames = holidays * 2 / 3;
            double games = (gamesHome + gamesSofia + holidayGames);
            double allGames = games + games * 0.15;

            System.out.println(Math.floor(allGames));
        }
    }
}
