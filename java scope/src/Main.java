
/*Variables declared directly inside a method are available anywhere in the\
method following the line of code in which they were declared
A block of code refers to all of the code between curly braces {}. 
Variables declared inside blocks of code are only accessible by the 
code between the curly braces,
which follows the line in which the variable was declared:*/
public class Main {
  public static void main(String[] args) {

    // Code here CANNOT use x

    { // This is a block

      // Code here CANNOT use x

      int x = 100;

      // Code here CAN use x
      System.out.println(x);

   } // The block ends here

  // Code here CANNOT use x

  }
}
