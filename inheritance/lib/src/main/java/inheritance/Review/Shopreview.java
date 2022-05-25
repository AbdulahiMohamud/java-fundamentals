package inheritance.Review;

public class Shopreview extends Review {
    public Shopreview(String author, String notes, int numStar) {
        super.author = author;
        super.notes = notes;
        super.numStar = numStar;
    }




    @Override
    public String toString() {
        return author + " " + notes + " " + numStar;
    }
}
