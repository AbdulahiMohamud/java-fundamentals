package inheritance.Business;


public class Restaurant extends Business {

    public Restaurant(String name, String price) {
        super.name = name;
        super.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price + " " + numStar;
    }

}
