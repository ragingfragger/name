
/**
 * Our own Point class to explore objects.
 *
 * @author (Jeremy Rine)
 * @version (1/29/2019 p.2)
 */
public class Point
{
    public int x;
    private int y;
    
    public Point(int initialX, int initialY)
    {
        x = initialX;
        y = initialY;
        
    }
    
    //shift's this point's location by the given amount
    public void translate(int dx, int dy)
    {
        x += dx;
        y += dy;
    }
    
    public Point()
    {
        this(0, 0);
    }
    
    public String tostring()
    {
        return "(" + x + "," + y + ")";
    }
    
    public void setlocation(int x1, int y1)
    {
        x = x1;
        y = y1;
    }
}
