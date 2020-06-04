package HomeWorkArea;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Homewrok_3 {

	public static void main(String[] args) {
		
		//first question /////////////////////////////////////////////////////
		// TODO Auto-generated method stub
//		System.out.println("input number");
//		Scanner scan1 = new Scanner(System.in);	
//		Scanner scan2 = new Scanner(System.in);
//		Scanner scan3 = new Scanner(System.in);
//
//		int newWord1 = scan1.nextInt();
//		int newWord2 = scan2.nextInt();
//		int newWord3 = scan3.nextInt();
//
//		//int newData = scan.nextInt();
//		
//		if((newWord1^2) + (newWord2^2) < (newWord3^2) || ((newWord3^2) + (newWord2^2) < (newWord1^2)) || ((newWord3^2) + (newWord1^2) < (newWord2^2))) {
//			System.out.println("這不是三角形");
//			
//		} else {
//			
//			if(newWord1 == newWord2 && newWord3 == newWord2 && newWord3 == newWord1) {
//				System.out.println("是正三角形");
//			} 
//			else if (newWord1 != newWord2 && newWord3 != newWord2 && newWord3 != newWord1){
//				
//				if ((newWord1^2) + (newWord2^2) == (newWord3^2) || ((newWord3^2) + (newWord2^2) == (newWord1^2)) || ((newWord3^2) + (newWord1^2) == (newWord2^2))) {
//				System.out.println("是直角三角形");
//				} else {
//				
//				System.out.println("是其他三角形");
//				}
//			}
//			else  {
//				System.out.println("是等腰三角形");
//			}
//		}
		
		
		
		
		//second /////////////////////////////////////////////////////
		
		
		
//		int intRandom = (int)(Math.random()*101);
//		
//		
//		System.out.println(intRandom);
//		while(true) {
//		
//		System.out.println("input number");
//		Scanner testIt = new Scanner(System.in);
//		int newTest = testIt.nextInt();	
//		
//			if(intRandom != newTest) {
//				System.out.println("guess wrong");
//				System.out.println("next line");
//				
//				if(intRandom > newTest) {
//					System.out.println("number is larger than your typing");
//				} else {
//					System.out.println("number is smaller than your typing");
//
//				}
//				
//			} else {
//				System.out.println("you got the right number "+ intRandom);
//				break;
//			}
//	
//		}
		

		//third/////////////////////////////////////////////////////
		int availableNumber = (int)(Math.random()*51);

		while(true) {
			System.out.println();
			System.out.println("please enter number you don't like it:");
			Scanner randomNumber = new Scanner(System.in);

			int unWantNumber = randomNumber.nextInt();

			String StrUnWant = Integer.toString(unWantNumber);
					
	    int allNum = 0;
	    int []available = new int[49];
	    for(int i = 1; i<50; i ++) {
	    	
	    	String vers = Integer.toString(i);
	    
	    	if(!vers.contains(StrUnWant)) {
	    			
		    		int intValue = Integer.valueOf(vers);
		    		System.out.print(intValue + "\t");	
		    		allNum++;
		    		available[allNum] = intValue;
		    		
		    		if(allNum % 6 == 0) {
	    			System.out.println();	
	    			
		    		}
		    	}

		}
		System.out.println("there have " + allNum + " can choose");
		
	    for(int v=0; v<6;v++) {
	    	int w = (int)(Math.random() * 49);
	    	int comChoose = available[w];
	    	
	    	if(comChoose == 0) {
	    		v-= 1;
	    	} else {

	    		System.out.print(comChoose + "\t");

	    		available[w] = 0;
	    	}
	    }
			
		}
		
		
	}

}
