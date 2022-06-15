package ride;
public class vehicle {
    
    private int weight; 

    public vehicle(int w )
    {
        weight = w;
    }

    public void goForward(int speed) 
    { 
        System.out.println("Going Forwad at the speed of " +speed+ "km/h");

    }
    public void main (String[] args) 
    { 
        vehicle testvehicle = new vehicle(1000);
        testvehicle.goForward(50); 

    }

}
