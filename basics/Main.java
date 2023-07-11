import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
  public static void main(String[] args){
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(2);
    flipNHeads(3);

    clock();


  }

  public static String pluralize(String word, int number) {
    if (number > 1 || number == 0) {
      return word + "s";
    } else {
      return word;
    }
  }

  public static void flipNHeads(int n) {
    Random random = new Random();
    int flips = 0;
    int headFlips = 0;
    


    while (headFlips < n){
      flips++;
      float coinFlip = random.nextFloat();

      if (coinFlip > 0.5){
        System.out.println("heads");
        headFlips++;

      } else {
        System.out.println("tails");
        headFlips = 0;
      }

    }
    System.out.println("It took " + flips + " flips to flip " + headFlips + " head in a row");
  }

  public static void clock() {
    LocalDateTime pastTime = null;

    while (true) {
      LocalDateTime currentTime = LocalDateTime.now();
      if (pastTime == null || pastTime.getSecond() != currentTime.getSecond()) {
        String time = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time);
      }
      pastTime = currentTime;
    }
  }
  
}
