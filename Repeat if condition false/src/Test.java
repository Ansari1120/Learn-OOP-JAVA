
import java.util.Scanner;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
                    Random rand = new Random();
        int random = rand.nextInt(10) + 1;
        System.out.println(random);
        System.out.print("Pick a number 1-10: ");
                int number = input.nextInt();
        boolean found = false;
                while (!found) {
                           if (number == random) {
                            System.out.println("Good!");
                                          found = true;
                          } else if (number > random) {
                    System.out.println("Too Big, try again:");
                                   number = input.nextInt();
                  } else if (number < random) {
                               System.out.println("Too Small, try again:");
                            number = input.nextInt();
                                                                                                                                                              
                                   }
                }                                                                                                                                                                          }
                                                                                                                                                                          }