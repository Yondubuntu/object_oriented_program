public class StringExample
{
    public static void main(String[] args)
    {
        /* 1. Concatenate the following two String variables and print out
         * "Hello there.I feel good." Use concatenation operator for String.
         */

        String firstMessage = "Hello there.";
        String secondMessage = "I feel good.";
        
        String result = firstMessage +secondMessage ; 
        System.out.println (result);
        
        /* 2. Convert the following message into upperclass and prints out the
         * result.
         */ 
        String upperResult = result.toUpperCase();
    	System.out.println (upperResult);
       

        String messageForConversion = "The quick brown fox jumps over the lazy dog.";

        /* 3. Use split() method in String and split the sentence into words.
         * Then print out each word as follows. Need to use array and any loop
         * statements.
         */
        String [] word = messageForConversion.split(" "); 
        
        for (int i = 0 ; i < word.length ; i++)
        { 
        	System.out.println(word[i]);
        }
        	
        

        String sentence = "Conditions worsen in Ukraine as war enters 3rd week.";

        /* Example:
           Conditions
           worsen
           in
           Ukraine
           as
           war
           enters
           3rd
           week.
        */         
    }
}
