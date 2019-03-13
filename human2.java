
/**
 * Write a description of class human2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class human2 extends Animal2
{
    private String name;
    private boolean isideologue;
    
    public human2(boolean _ishungry, String _gender, String _name, boolean _isideologue)
    {
        super(_ishungry, 10, 4, _gender);
        name = _name;
        isideologue = _isideologue;
    }
    
    public void whine()
    {
        if(isideologue)
            System.out.println("Whine Whine Whine Whine Whine - Thats not fair - Whine Whine Whine");
        else
            System.out.println("Oof, how do we fix this?");
    }
    
    public void sayname()
    {
        System.out.println("Hi! my name is " + name);
    }
    
}
