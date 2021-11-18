package HomeWork13_2;

public class Espresso extends Water{
    private String type ="Espresso";
    private String coffee ="Coffee";
    private int coffeePrice = 15;
    private final int price = super.getPrice() + coffeePrice;
    private int sugar;


    public Espresso( int sugar){
        super(sugar);
        this.sugar = sugar;

    }
    public int getPrice(){
        return price;
    }


    public String toString(){
        return " Take "+ this.type + " made with extra "+ this.coffee + " price is " + this.price + ". " + this.sugar + " piece(s) of sugar."  ;
    }

}
