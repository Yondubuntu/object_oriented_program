import java.util.*;

import java.util.ArrayList;

public class MultipleDataProcessingListExample

{
    public static double  calculateMean(ArrayList<Integer> data)
{    
    double mean; 
    int sum = 0 ;
    
    for (Integer s :data)
        { 
    	sum =sum + s ; 
    	 }
    
    mean = (double)sum /data.size();
    
        return mean;
}

    public static void main(String[] args)
  {
        ArrayList<Integer> scores = new ArrayList<Integer>();

        /* Get score inputs using Scanner */
        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        Integer integerObject = null;
        
        while (userInput != -1) 
        { 
        	
        	System.out.print("Enter a score (enter -1 to quit):");
        	userInput = scan.nextInt();
        	integerObject = new Integer(userInput);
        	
        	scores.add(integerObject);
        	}
        
        scores.remove(scores.size() - 1);

        System.out.println("Mean for scores: " + calculateMean(scores));
}

}


 