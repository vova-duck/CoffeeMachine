package HomeWork13_2;

public class Water {
    private String type;
    private int price;
    private int sugar;

    public Water(){
    }


    public Water( int sugar){
        this.type = "Hot water";
        this.price = 5;
        this.sugar = sugar;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getSugar(){
        return sugar;
    }
    public void setSugar(int sugar){
        this.sugar = sugar;
    }
    public String toString(){
        return " Take "+ this.type + " price is " + this.price + ". " + this.sugar + " piece(s) of sugar " ;
    }

    public String makeDrink() {
        return "your drink is ready ";
    }
}

