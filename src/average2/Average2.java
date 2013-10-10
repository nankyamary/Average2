package average2;

import java.util.*;
public class Average2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int passes=0;
		int result =0;
		int failures=0;
		int studentcounter =0;
		while(studentcounter <= 10){
			System.out.println("Enter the next exam(1=passes,2=failures):");
		     result = input.nextInt();
		     if(result==1)
		    	 passes=passes+1;
		     else
		    	 failures=failures+1;
		     studentcounter = studentcounter+1;
		}
		     
		  System.out.printf("Passed :%d\n Failed : %d\n",passes,failures);
		  if(passes > 8)
			  System.out.print("Bonus to instructor");
		     
		}
	}


