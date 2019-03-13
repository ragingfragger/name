
/**
 * Write a description of class rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle
{
    private int length;
    private int width;
    
    public Rectangle(int newl, int neww)
    {
        length = newl;
        width = neww;
    }
    
    public int getArea()
    {
        return (length*width);
    }
    
    public int getPerimeter()
    {
        return ((2*length) + (2*width));
    }
    
    public void doubleSides()
    {
        width = width*2;
        length = length*2;
    }
    
    public boolean isSquare()
    {
        return (width == length);
    }
    
    public void changeLength(int i)
    {
        length = i;
    }
    
    public void changeWidth(int i)
    {
        width = i;
    }
    
    public int differenceInArea(Rectangle r)
    {
        return getArea() - r.getArea();
    }
    
    public String toString()
    {
        System.out.println(length + " x " + width);
        return (length + " x " + width);
    }
}
