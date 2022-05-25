package inheritance.Business;

import inheritance.Review.Review;

import java.util.ArrayList;

public abstract class Business {
    public String name;
    public String price;
    public int numStar = 0;
    public ArrayList<Review> reviewList = new ArrayList<>();

    public void addReview(Review input){
        reviewList.add(input);
        updateStars(input.numStar);
    }

    public void updateStars(int stars){
        if(numStar == 0){
            numStar = stars;
        }
        else {
            int sum = 0;
            for(Review review : reviewList){
                sum += review.numStar;
            }
            numStar = sum/reviewList.size();
        }
    }




}
