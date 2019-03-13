
/**
 * equilateral triangle.
 *
 * @author (Jeremy Rine)
 * @version (3/6/2019 p.2)
 */
public class equilateraltriangle extends regularpolygon
{
    // instance variables - replace the example below with your own
    private int x;
    /**
     * Constructor for objects of class equilateraltriangle
     */
    public equilateraltriangle(int _x)
    {
        super("Equilateral Triangle", 3, _x);
        x = _x;
    }
    
    public double getarea()
    {
        return Math.sqrt(3) / 4 * getsidelength() * getsidelength();
    }
    
    
    
}
