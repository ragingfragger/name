
/**
 * Write a description of class Animal12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Animal2
{
    private boolean ishungry;
    private int tastiness, numlegs;
    private String gender;
    
    public Animal2(boolean _ishungry, int _tastiness, int _numlegs, String _gender)
    {
        ishungry = _ishungry;
        tastiness = _tastiness;
        numlegs = _numlegs;
        gender = _gender;
    }
    
    public void locomote()
    {
    System.out.println("I am moving!");
    }
    
    public void eat()
    {
        ishungry = false;
    }
    
    public void loselegs(int num)
    {
    numlegs -= num;
    if (numlegs < 0)
    {
        numlegs = 0;
    }
    System.out.println("I have " + numlegs + " left. :(");
    }       
    
}
