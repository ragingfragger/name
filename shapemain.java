
/**
 * Write a description of class shapemain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class shapemain
{
    public static void main(String [] args)
    {
        square s = new square(10);
        System.out.println(s);
        
        equilateraltriangle et = new equilateraltriangle(5);
        System.out.println(et);
        
        regularpolygon s2 = new square(15);
        
        regularpolygon et2 = new equilateraltriangle(10);
        
        regularpolygon [] shapes = {s2, et2, s, et};
    }
}
