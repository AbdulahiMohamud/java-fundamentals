package inheritance.Review;

public class TheaterReview extends Review{
    public String movieName = "N/A";
    public TheaterReview (String author, String movieName,String notes ,int numStar){
        super.author = author;
        this.movieName = movieName;
        super.notes = notes;
        super.numStar = numStar;
    }
    public TheaterReview (String author,String notes ,int numStar){
        super.author = author;
        super.notes = notes;
        super.numStar = numStar;
    }
    @Override
    public String toString() {
        return "Author" + author +"Notes" + notes +"Movie" + movieName + "Number of stars " + numStar;
    }
}
