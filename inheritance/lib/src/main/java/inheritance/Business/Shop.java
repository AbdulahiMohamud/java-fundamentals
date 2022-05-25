package inheritance.Business;



public class Shop extends Business {
    String description;


    public Shop(String name , String description , String price) {
        super.name = name;
        this.description = description;
        super.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price + " " + description;
    }
}

