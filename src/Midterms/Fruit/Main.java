package Midterms.Fruit;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        FruitBasket fruitBasket = new FruitBasket();

        // Adding some fruits to the basket
        fruitBasket.addFruit(new Apple());
        fruitBasket.addFruit(new Orange());
        fruitBasket.addFruit(new Banana());
        fruitBasket.addFruit(new Orange());
        fruitBasket.addFruit(new Apple());
        fruitBasket.addFruit(new Orange());

        System.out.print("Enter code: ");
        int code = s.nextInt();

        switch (code) {
            case 8:
                fruitBasket.countOrange();
                System.out.println("SUCCESS");
                break;
            case 11:
                fruitBasket.fruitBasketTastes();
                System.out.println("SUCCESS");
                break;
            case 12:
                fruitBasket.fruitBasketTextures();
                System.out.println("SUCCESS");
                break;
            default:
                System.out.println("Invalid code");
        }

        s.close();
    }
}