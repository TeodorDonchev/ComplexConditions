import java.util.Scanner;

/**
 * Created by teodor donchev on 1/27/2018.
 */
public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();

        boolean isFruit = (product.equals("apple")) ||(product.equals("banana")) || (product.equals("kiwi")) ||
                product.equals("cherry") || product.equals("lemon") || product.equals("grapes");

        boolean isVegetable = (product.equals("tomato")) || product.equals("cucumber") || (product.equals("pepper")) ||
                product.equals("carrot");

        if (isFruit) {
            System.out.println("fruit");
        } else if (isVegetable) {
            System.out.println("vegetable");
        } else{
            System.out.println("unknown");
        }
    }
}
