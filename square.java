
/**
 * Write a description of class square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class square extends regularpolygon
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class square
     */
    public square(int _x)
    {
        super ("Square", 4, _x);        
    }
    
    public double getarea()
    {
        return getsidelength() * getsidelength();
    }
    

}
