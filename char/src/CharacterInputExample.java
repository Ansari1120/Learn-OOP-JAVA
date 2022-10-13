import java.util.Scanner;   
public class CharacterInputExample  
{   
public static void main(String[] args)   
{   
Scanner sc = new Scanner(System.in);   
System.out.print("Input a character: ");  
// reading a character   
char c = sc.next().charAt(0);   
//prints the character   
System.out.println("You have entered "+c);   
}   
}
