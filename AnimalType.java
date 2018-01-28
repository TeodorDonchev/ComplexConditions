import java.util.Scanner;

/**
 * Created by teodor donchev on 1/27/2018.
 */
public class AnimalType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String animal = scan.nextLine().toLowerCase();

        String animalClass = "";

        switch (animal){
            case "dog":
                animalClass = "mammal";
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                animalClass = "reptile";
                break;
            default:
                animalClass = "unknown";
                break;
        }

        System.out.println(animalClass);
    }
}
