package HomeWork13_2;

public class Tea extends Water{

   private String type = "Tea";
   private int teaPrice = 15;
   private int price =super.getPrice() + teaPrice;
    private int sugar;


    public Tea( int sugar){
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
        return " Take "+ this.type + " price is " + this.price + ". " + this.sugar + " piece(s) of sugar " ;
    }

}
