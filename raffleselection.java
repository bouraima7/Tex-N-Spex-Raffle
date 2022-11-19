package raffle;

import java.util.Scanner;

public class raffleselection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declarations
		Scanner input = new Scanner(System.in);//uses "input" as new Scanner
		String [] candidate= {"","","","","","","","",""}; // Creates an array(table) for candidates
		
		//Takes in the entries of the raffle and puts them into an array(table)
		System.out.println("Welcome to the Tex N Spex Raffle!!!");
		System.out.println();
		System.out.println("Candidate #1: ");
		String loc1= input.next();
		candidate[0]=loc1;
		System.out.println("Candidate #2: ");
		String loc2= input.next();
		candidate[1]=loc2;
		System.out.println("Candidate #3: ");
		String loc3= input.next();
		candidate[2]=loc3;
		System.out.println("Candidate #4: ");
		String loc4= input.next();
		candidate[3]=loc4;
		System.out.println("Candidate #5: ");
		String loc5= input.next();
		candidate[4]=loc5;
		System.out.println("Candidate #6: ");
		String loc6= input.next();
		candidate[5]=loc6;
		System.out.println("Candidate #7: ");
		String loc7= input.next();
		candidate[6]=loc7;
		System.out.println("Candidate #8: ");
		String loc8= input.next();
		candidate[7]=loc8;
		System.out.println("Candidate #9: ");
		String loc9= input.next();
		candidate[8]=loc9;
		
		//Prints out the array of destinations
		System.out.println("The candidates in this raffle are:");
		for (int i=0; i<candidate.length; i++) {
			System.out.print(candidate[i]+", ");
		}
		System.out.println();
		
		
		//randomly selects 3 candidates from the array
		//using Math.random(); Parameters are 0-8 (9 total)
		System.out.println("And the winner is:");
		System.out.println();
		
		//will filter through array to ensure same number not selected twice
		int rand=0;//integer to note which random place to pick from array
		int [] nums= {0,0,0};//creates an array for selected candidates
		
		for (int n=0; n<3; n++) {// will loop 3 times (0,1,2) stop at 3
			rand= (int)(Math.random()*4)+1; // randomly picks a number from 0-2 (3 options)
			nums[n]=rand;//adds random generated value to array
			
			if (n==1) {
				while (nums[n]==nums[0]) {
					rand= (int)(Math.random()*8)+1;
					nums[n]=rand;
				}
			}
			else if (n==2) {
				while (nums[n]==nums[0] || nums[n]==nums[1]) {
					rand= (int)(Math.random()*8)+1;
					nums[n]=rand;
				}
			}
			
			//System.out.print(nums[n]);
		}
		System.out.println();
		
		System.out.println("Candidate 1: " + candidate[nums[0]]);
		System.out.println("Candidate 2: " + candidate[nums[1]]);
		System.out.println("Candidate 3: " + candidate[nums[2]]);
		
		System.out.println("You thought it was over? Just like that?");
		System.out.println("Hahaha");
		System.out.println("Now we choose the real winner!");
		
		boolean kill = false;
		System.out.println("You guys ready for the real winner???");
		
		String last = input.next();
		String last1 = "y";
		
		if (last.equals(last1)) {
			kill=true;
		}
		
		String cand1 = candidate[nums[0]];
		String cand2 = candidate[nums[1]];
		String cand3 = candidate[nums[2]];
		String [] finalwin= {cand1,cand2,cand3};
		
		if (kill==true) {
			int finalrand=0;
			finalrand= (int)(Math.random()*2)+1;
			System.out.println("The final winner is: " +finalwin[finalrand]);
		}
		
		
		
		
		
		

	}//end of main

}
