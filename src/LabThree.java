import java.util.Scanner;
public class LabThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print(" Enter a number between 1 and 100: ");
	    x = scnr.nextInt();
	    
	    if (x % 2 == 1 && x > 60)
	    	System.out.println(+ x +  " Odd and over 60.");
	    else if (x % 2 == 1 && 100 > x)
	    	System.out.println(+ x +  " Odd");
	    else if (x % 2 == 0 && 25 > x ) {
	        System.out.println("Even and less than 25");}
	      else if (x % 2 == 0 && 26 <= x && 60 >= x ) {
	    	  System.out.println("Even");}
	      else if (x % 2 == 0 && x > 60)
	    	System.out.println(+ x +  " Even");
	    
	    scnr.close();
	     
	    
	
	      }
	    }
	


