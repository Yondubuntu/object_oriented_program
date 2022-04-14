import java.util.ArrayList;
import java.util.Scanner;


public class  dice_roll/* put appropriate class name here */
{
    public static int singleCubeRoll()
    {
        int number = (int)(Math.random() * 6) + 1;      

        return number;
    }

    public static ArrayList<Integer> multipleRolls(int tosTime) 
	{
    	ArrayList<Integer> number = new ArrayList<Integer>();
		Integer integerObject = null;
    	
    	for (int i = 0 ; i < tosTime; i++)
    	 { 
    		integerObject= (int)(Math.random() * 6) + 1  ; 
    		number.add(integerObject);
    	 }
    	
    	return number;
	}
    	
    public static void main(String[] args)
    {
        System.out.println("A dice roll: " + singleCubeRoll());
        System.out.print("How many times do you want to roll a dice?: ");
       
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ArrayList <Integer> diceNumbers = multipleRolls(n)  ;/* function call for multipleRolls()? */

        System.out.println("### Dice numbers:");
      
        for (int number: diceNumbers)
        {
            System.out.println(number);
        }

    }
}
