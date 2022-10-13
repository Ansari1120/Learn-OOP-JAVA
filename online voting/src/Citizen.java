import java.util.Arrays;
import java.util.*;

public class Citizen { // Super class
	int num[];//array 
	Scanner scn=new Scanner(System.in);
	int i;
	int stn2=13;
	static String stn;//static value can only be explained and initialized only once

	Citizen(String stn){
		this.stn=stn;// current object in a method constructor
	}
	public static boolean isNumeric(String stn) { //boolean refers to On and off
	    int intValue;
	
	    if(stn == null || stn.equals("")) {
	        System.out.println("String cannot be parsed, it is null or empty.");
	        return false;
	    }
	    
	    try {
	        intValue = Integer.parseInt(stn);
	        return true;
	    } catch (NumberFormatException e) { //NumberFormatException is condition of try catch
	    }
	    return false;// try catch shows you error of the particular line and executes the code. 
	}
	
	class Intro extends Citizen{//Sub class of citizen
		Intro() {//default constructor
			super(stn);// use of super
			
		}
		void method1_detailed_intro() {// introduction
			System.out.println("\t\t\tThis is The Islamic Republic of Pakistan");
			System.out.println("Welcome to Online Voting System");
			System.out.println("||Think Before you choose someone, 5 years is a Big time Frame||");
		}
	}
	class Asking extends Citizen{//sub class of citizen class

		Asking(String stn) {
			super(stn);
		}
		void method1_inputs() {
			System.out.println("Enter your Full Name : ");
			stn =scn.nextLine();   
			if(isNumeric(stn)) {
				System.out.println("Error !\n'String should be in alphabets'");
				 System.exit(0);// exits the system if false
			}else{
	            System.out.println("Enter your CNIC Number : ");
			        num = new int[stn2];// input in array
			        String[] strNums = null;
			        if (scn.hasNextLine()) {
			            strNums = scn.nextLine().split("");// scanning next line in array
			        }
			        if (strNums != null) {
			            for (int i = 0; i < stn2; i++) {
			                try {
			                    num[i] = Integer.parseInt(strNums[i]);//checking integers
			                } catch (Exception  e ) {//Exception is a condition of try catch e is its variable
			                    System.out.println("Error ! you entered wrong CNIC number");
			                    System.exit(0);// system exit
			                }
			            }
			        }}
			        System.out.println("Serial No   Candidate  National Party Name (1 TO 10) \n\t\t\t'else your vote will be wasted'  : ");
			    	
				 	System.out.println("1st : {Pakistan Tahreek e Insaf}");
				 	System.out.println("2nd : {Pakistan peoples party}");
				 	System.out.println("3rd : {Awami National party}");
				 	System.out.println("4th : {Mutehda Qoumi Movement(pakistan)}");
				 	System.out.println("5th : {Jamat e Islami}");
				 	System.out.println("6th : {Pak sar zameen party}");
				 	System.out.println("7th : {Awami Muslim league (Pakistan)}");
				 	System.out.println("8th : {Pakistan Musim league N(Nawaz)}");
				 	System.out.println("9th : {Balochistan national Party}");
				 	System.out.println("10th :{Balochistan national Party}");
				 	System.out.println("Enter the serial no of Party you want to cast your vote: ");
				 	int cand_num=scn.nextInt();
					System.out.println("Dear "+stn+" of id : "+Arrays.toString(num));// calling array of interger that has 13 digits

				 	switch(cand_num) {
				 	case 1:
				 		System.out.println("You Voted For Mr. Usman Raees of Party {Pakistan Tahreek e Insaf}");
				 		break;
				 	case 2:
				 		System.out.println("You Voted For Mr. Taha Qadri of Party {Pakistan peoples party}");
				 		break;
				 	case 3:
				 		System.out.println("You Voted For Mr. Maaz Khan of Party {Awami National party}");
				 		break;
				 	case 4:
				 		System.out.println("You Voted For Mr. Hassan Afridi of Party {Mutehda Qoumi Movement(pakistan)}");
				 		break;
				 	case 5:
				 		System.out.println("You Voted For Mr. Mubashir Malik of Party {Jamat e Islami}");
				 		break;
				 	case 6:
				 		System.out.println("You Voted For Mr. Qasim Attiue Malik of Party {Pak sar zameen party}");
				 		break;
				 	case 7:
				 		System.out.println("You Voted For Mr. Hassan Baig of Party {Awami Muslim league (Pakistan)}");
				 		break;
				 	case 8:
				 		System.out.println("You Voted For Mr. Ramzan Raza of Party {Pakistan Musim league N(Nawaz)}");
				 		break;
				 	case 9:
				 		System.out.println("You Voted For Mr. Mirza Subhan Baig of Party {Balochistan national Party}");
				 		break;
				 	case 10:
				 		System.out.println("You Voted For Mr. Umar Hameed of Party {Muslim League (Q)}");
				 		break;
				 		default:
				 			System.out.println("You Wasted Your Vote");
				 			break;
				 	}
				 	System.out.println("You Casted Your Vote successfully!");
				 	
			        }		
	}
	public static void main(String[] args) {
Citizen c=new Citizen(stn);
Intro c1=c.new Intro();
c1.method1_detailed_intro();
Asking c2= c.new Asking(stn);
c2.method1_inputs();
Citizen.isNumeric(stn);
    }
}