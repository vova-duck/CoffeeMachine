package HomeWork13_2;

public class Cappuccino extends Espresso{
    private String type = "Cappuccino";
    private String milk = "milk";
    private int milkPrice = 15;
    private int price = super.getPrice() + this.milkPrice;
    private int sugar;


    public Cappuccino( int sugar){
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
        return " this is "+ this.type + " price is " + this.price + ". " + this.sugar + " piece(s) of sugar. " + "Has extra " + this.milk;
    }

}
