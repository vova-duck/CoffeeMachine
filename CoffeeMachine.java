package HomeWork13_2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CoffeeMachine {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("press enter to order drink or type quit to stop");
        ArrayList<Water> drinks = new ArrayList<>();
        {
            String input;
            while (!(input = reader.readLine()).equals("quit")) {
                System.out.println("choose your drink type WATER, ESPRESSO, AMERICANO, CAPPUCCINO, TEA or LATTE");
                try {
                    Water drink = drinkMaker(DrinkTypes.valueOf(reader.readLine()));

                    drinks.add(drink);
                    System.out.println("Press enter to continue order, type quit to stop");
                }catch (IllegalArgumentException e ){
                    System.out.println("press enter to order drink or type quit to stop");
                }
            }
            for (Water drink:drinks){
                System.out.println(drink.makeDrink());
                System.out.println(drink);


            }
            int totalCheck= 0;
            for (Water drink:drinks){
                totalCheck =  totalCheck + drink.getPrice();

            }
            System.out.println("Your total check is " + totalCheck +" bucks");



        }
    }

        public static Water drinkMaker (DrinkTypes types) throws IOException {
            Water drink;
            switch (types) {
                case WATER:
                    int sugar;
                    sugar = sugarReceive();
                    drink = new Water(sugar);

                    break;
                case ESPRESSO:
                    sugar = sugarReceive();
                    drink = new Espresso(sugar);
                    break;

                case TEA:
                    sugar = sugarReceive();
                    drink = new Tea(sugar);
                    break;

                case AMERICANO:
                    sugar = sugarReceive();
                    drink = new Americano(sugar);
                    break;

                case LATTE:
                    sugar = sugarReceive();
                    drink = new Latte(sugar);
                    break;

                case CAPPUCCINO:
                    sugar = sugarReceive();
                    drink = new Cappuccino(sugar);
                    break;

                default:
                    throw new IllegalStateException("theres no property like this " + types);
            }
            return drink;
        }
        public static int sugarReceive () throws IOException {
            int sugar;
            System.out.println("How many sugar do you want?");
            try {
                sugar = Integer.parseInt(reader.readLine());

            if (sugar < 0 || sugar >= 5) {
                System.out.println("unacceptable amount");
                sugarReceive();
            }} catch (NumberFormatException e){
                return 0;
            }
            return sugar;
        }
    }

