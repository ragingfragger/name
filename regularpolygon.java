
/**
 * Write a description of class regularpolygon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class regularpolygon
{
    String name;
    int numsides, sidelength;
    public regularpolygon(String _name, int _numsides, int _sidelength)
    {
    name = _name;
    numsides = _numsides;
    sidelength = _sidelength;
    }
    
    public int getPerimeter()
    {
        return numsides*sidelength;
    }
    
    public String tostring()
    {
        return name + " -- Perimeter: " + getPerimeter();
    }
            
    public int getsidelength()
    {
        return sidelength;
    }
    
    public int getnumsides()
    {
        return numsides;
    }
    
}
