package HomeWork13_2;

public class Latte extends Espresso{
    private String type = "Latte";
   private String cream = "cream";
    private int creamPrice = 20;
   private int price = super.getPrice() + creamPrice;
    private int sugar;


    public Latte( int sugar) {
        super(sugar);
this.sugar = sugar;
    }
    public int getPrice(){
        return price;
    }

    public String toString(){
        return "Take "+ this.type + " price is " + this.price + ". " + this.sugar + " piece(s) of sugar." + "Has extra "+ this.cream ;
    }

}
