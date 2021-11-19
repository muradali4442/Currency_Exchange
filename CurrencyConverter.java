import java.util.*;
import java.text.DecimalFormat;
 
public class CurrencyConverter {
 
	public static void main(String[] args) {
 
		double amt, euro, dollar, pound, rupee, code;
 
		DecimalFormat f = new DecimalFormat("##.##"); 
		//using ("##.##") so that we could get values up to two decimal points

		Scanner sc = new Scanner(System.in);
 
		System.out.println("This is currency converter \nwhich currency do you want to convert among the following");
 
		
		System.out.println("1:Euro \n2:Dollar \n3:Pound \n4:Rupee\n");
		code = sc.nextInt();
		
		System.out.println("Please enter the amount you want to convert\n");
		amt = sc.nextFloat();
 
		
		if (code==1) {
			dollar=amt*1.15;
			System.out.println("your "+ amt +" Euro is "+ f.format(dollar) + " Dollar");
			
			pound=amt*0.85;
			System.out.println("your " + amt + " Euro is " + f.format(pound) + " Pound");
			
			rupee=amt*198;
			System.out.println("Your " + amt +" Euro is " + f.format(rupee) + " Rupees");
			
			
		}
		
		if(code==2) {
			euro= amt*0.88;
			System.out.println("Your "+ amt +" Dollar is "+ f.format(euro) + " Euro");
			
			pound=amt*0.74;
			System.out.println("Your "+ amt +" Dollar is "+ f.format(pound) + " Pound");

			
			rupee=amt*174;
			System.out.println("Your " + amt + " Dollar is" + f.format(rupee) + " Rupees");
			
		
		}
		
		
		if(code==3) {
			euro=amt*1.18;
			System.out.println("Your "+ amt +" Pound is "+ f.format(euro) + " Euro");
			
			dollar=amt*1.34;
			System.out.println("Your "+ amt +" Pound is "+ f.format(dollar) + " Dollar");
			
			rupee=amt*234;
			System.out.println("Your "+ amt +" Pound is "+ f.format(rupee) + " Rupee");

		}
		
		
		if(code==4) {
			euro=amt*0.012;
			System.out.println("Your "+ amt +" Rupees is "+ f.format(euro) + " Euro");
			
			dollar=amt*0.013;
			System.out.println("Your "+ amt +" Rupees is "+ f.format(dollar) + " Dollar");
			
			pound=amt*0.010;
			System.out.println("Your "+ amt +" Rupees is "+ f.format(pound) + " Pound");



		}
		
		
		else {
			System.out.println("Invalid input");
		}
		
		System.out.println("Thank you for choosing our Example Programs");
	}
 
}
