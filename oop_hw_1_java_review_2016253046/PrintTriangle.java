public class PrintTriangle
{
    public static void main(String[] args)
    {
        /* Print out the following triangular shape
         * using any loop statments.
         */
    	
    	for (int i = 1 ; i <13 ; i++) { 
    		for (int j = 12 ; j > 0 ;  j--) { 
    			if (i<j) 
    			{ 
    				System.out.print(" ");
    			}
    			else 
    			{ 
    				System.out.print("#"); 
    			}
    			
    	   }
    		System.out.println("");
    	
    	}
        /*
                      #
                     ## 
                    ###
                   ####
                  #####
                 ######
                #######
               ########
              #########
             ##########
            ###########
           ############
         */
    }
}
