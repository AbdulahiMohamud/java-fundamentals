import java.util.Random;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Main {
  public static void main(String[] args){
    pluralize("cat",2);
    pluralize("dog",1);
    pluralize("turtle",0);
    flipNHeads(4);
    clock();
    

  }
  //Pluralize function
  public static void pluralize (String word, int num) {
    if(num == 0 || num > 1){
      System.out.println("I have " + num + " " + word + "s.");

    } else {
      System.out.println("I have " + num + " " + word + ".");
    }

  }

  // Flipping coin function
   public static void flipNHeads(int userNum){
     Random rand = new Random();
     int headNum = 0;
     int flipNum = 0;

    while(headNum != userNum) {
      flipNum++;
      if (rand.nextFloat() >= 0.5) { 
        // nextFloat() gives us a float beteen 0.0 and 1.0;
				headNum++;
				System.out.println("heads");
			} else {
				headNum = 0;
				System.out.println("tails");
			}

    }
     System.out.println("It took " + flipNum + " flips to flip " + userNum + " heads in a row");

   }

   public static void clock() {
     while (true) {
       try{
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = time.format(formatTime);
        System.out.println(formattedTime);
        // delays the for a set number of miliseconds 
        Thread.sleep(1000);
      } catch (Exception e){
        System.out.println(e);
      }
   }
}
}