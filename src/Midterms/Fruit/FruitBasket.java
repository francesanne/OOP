package Midterms.Fruit;

import java.util.ArrayList;

public class FruitBasket {
    private ArrayList<Fruit> fruits = new ArrayList<>();

    public void addFruit(Fruit fruit){
        fruits.add(fruit);
    }
    public void countApple(){
        int count=0;
        for(Fruit fruit: fruits){
            if(fruit instanceof Apple) {
                count++;
            }
        }
        System.out.println("Number of Apples in the basket: " + count);
    }

    public void countOrange(){
        int count=0;
        for(Fruit fruit: fruits){
            if(fruit instanceof Orange){
                count++;
            }
        }
        System.out.println("Number of Oranges in the basket: " + count);
    }

    public void countBanana(){
        int count=0;
        for(Fruit fruit: fruits){
            if(fruit instanceof Banana){
                count++;
            }
        }
        System.out.println("Number of Bananas in the basket: " + count);
    }

    public void fruitBasketTastes(){
            for(Fruit fruit: fruits){
                fruit.getTaste();
            }
    }

    public void fruitBasketTextures(){
            for(Fruit fruit:fruits){
                fruit.getTexture();
            }
    }
}
