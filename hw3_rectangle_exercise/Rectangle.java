

/*
 * Q: Write Rectangle class that implements the following features:
 *
 * 1. Make RectangleRunner.java run with Rectangle class that you design
 *      in Rectangle.java
 *      a. First of all, take a look at output_RectangleRunner.txt and
 *          plan to make RectangleRunner.class generate the desired output
 *      b. No need to modify RectangleRunner.java. Only write code lines
 *          in Rectangle.java
 *      c. Start by modifying the template in this file (Rectangle.java)
 * 2. In particular, design Rectangle class applying the object design technique
 *      of ADT (Abstract Data Type):
 *      a. instance variables declared as private
 *      b. constructors with width and height variables as initial input parameters
 *      c. methods: calculateArea(), print(), resize()
 *      d. setters and getters for the instance variables
 */

public class Rectangle
{
    private  int  width  ,height ; 


    public Rectangle(int a , int b) {
      
        width = a ;
        height = b ;
 
     }

    public void  setHeight(int f) 

    { 
        height = f ;
    }

    public int getHeight() {
        
        return height;

    }

    public int getWidth() {
        return width ; 


    }
    public void setWidth(int g) { 
         width =g ;
    } 


    public void resize (int c , int d ) {
        
        width = c ; 
        height =d; 


    }

    public void  print() {
        for (int j = 0 ; j< height; j++){ 
            for (int i = 0 ; i < width ; i++) 
            { 
              System.out.print("*");
             }  
             System.out.print("\n");
            }

         }


    
    public Double calculateArea ()
    
    { 
        double area  = width*height ;
        
        return area ; 

    }

  
 
    /* instance variables go here (width and height) */

    /* Constructors */

    /* Methods: calculateArea(), print(), resize() */

    /* Setters and getters */
}
