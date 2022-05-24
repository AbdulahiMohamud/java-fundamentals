package inheritance;

import java.util.ArrayList;

public class Restaurant {
    String name;
    String price;
   int numStar = 0;
   ArrayList<Review> reviewList = new ArrayList<>();

    public Restaurant(String name, String price) {
        this.name = name;
        this.price = price;
    }



    public void addReview(Review input){
        reviewList.add(input);
        updateStars(input.getNumStar());
    }

    public void updateStars(int stars){
        if(numStar == 0){
            numStar = stars;
        }
        else {
            int sum = 0;
            for(Review review : reviewList){
                sum += review.getNumStar();
            }
            numStar = sum/reviewList.size();
        }
    }

    public int getNumStar() {
        return numStar;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public ArrayList<Review> getReviewList() {
        return reviewList;
    }

    @Override
    public String toString() {
        String response = name + " " + price + " " + numStar;
        return response;
    }

}
