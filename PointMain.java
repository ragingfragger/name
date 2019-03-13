/**
 * Write a description of class PointMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PointMain
{
    public static void main(String [] args)
    {
        Point p1 = new Point(3, 8);
        
        System.out.println(p1);
        
        System.out.println(p1.x);
        p1.x = 5;
        System.out.println(p1);
        
        p1.setlocation(7,2);
    }
}
