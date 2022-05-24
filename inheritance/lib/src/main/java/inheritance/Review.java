package inheritance;

public class Review {
    String author;
    String notes;
    int numStar;

    public Review(String author, String notes, int numStar) {
        this.author = author;
        this.notes = notes;
        this.numStar = numStar;
    }


    public String getAuthor() {
        return author;
    }

    public String getNotes() {
        return notes;
    }

    public int getNumStar() {
        return numStar;
    }

    @Override
    public String toString() {
        String response = author + " " + notes + " " + numStar;
        return response;
    }

}
