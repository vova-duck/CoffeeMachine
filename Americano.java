package HomeWork13_2;

public class Americano extends Espresso{
    private String type = "Americano";
    private String water = "water";
    private int waterPrice = 5;
    private int price = super.getPrice() + waterPrice;
    private int sugar;

    public Americano(int sugar){
        super(sugar);
        this.sugar = sugar;


    }
    public void setSugar(int sugar){
        this.sugar = sugar;
    }
    public int getPrice(){
        return price;
    }

    public String toString(){
        return "Take "+ this.type + " price is " + this.price + ". " + this.sugar + " piece(s) of sugar. " + " Has extra" + this.water;
    }




}
