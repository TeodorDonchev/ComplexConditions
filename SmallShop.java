import java.util.Scanner;

/**
 * Created by teodor donchev on 1/27/2018.
 */
public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        String town = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        double sofiaCoffee = 0.50;
        double sofiaWater = 0.80;
        double sofiaBeer = 1.20;
        double sofiaSweets = 1.45;
        double sofiaPeanuts = 1.60;

        double plovdivCoffee = 0.40;
        double plovdivWater = 0.70;
        double plovdivBeer = 1.15;
        double plovdivSweets = 1.30;
        double plovdivPeanuts = 1.50;

        double varnaCoffee = 0.45;
        double varnaWater = 0.70;
        double varnaBeer = 1.10;
        double varnaSweets = 1.35;
        double varnaPeanuts = 1.55;

        double result = 0;


        if(town.equals("Sofia")){
            switch (product) {
                case "coffee":
                    result = sofiaCoffee * quantity;
                    break;
                case "beer":
                    result = sofiaBeer * quantity;
                    break;
                case "water":
                    result = sofiaWater * quantity;
                    break;
                case "sweets":
                    result = sofiaSweets * quantity;
                    break;
                case "peanuts":
                    result = sofiaPeanuts * quantity;
                    break;
            }
        } else if(town.equals("Varna")){
            switch (product) {
                case "coffee":
                    result = varnaCoffee * quantity;
                    break;
                case "beer":
                    result = varnaBeer * quantity;
                    break;
                case "water":
                    result = varnaWater * quantity;
                    break;
                case "sweets":
                    result = varnaSweets * quantity;
                    break;
                case "peanuts":
                    result = varnaPeanuts * quantity;
                    break;
            }
        }else if(town.equals("Plovdiv")){
            switch (product) {
                case "coffee":
                    result = plovdivCoffee * quantity;
                    break;
                case "beer":
                    result = plovdivBeer * quantity;
                    break;
                case "water":
                    result = plovdivWater * quantity;
                    break;
                case "sweets":
                    result = plovdivSweets * quantity;
                    break;
                case "peanuts":
                    result = plovdivPeanuts * quantity;
                    break;
            }
        }
        System.out.println(result);
    }
}
