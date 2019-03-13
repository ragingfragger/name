
/**
 * was told to make it.
 *
 * @author (Jeremy Rine)
 * @version (2/28/2019)
 */
public class dog2 extends Animal2
{
    
    private boolean isownerpresent;
    private String breed;
    
    public dog2(boolean _ishungry, String _gender, boolean _isownerpresent, String _breed)
    {
        super(_ishungry, 10, 4, _gender);
        isownerpresent = _isownerpresent;
        breed = _breed;
    }
    
    public void wagtail()
    {
        if (isownerpresent)
            System.out.println(" WAG WAG WAG WAG WAG WAG WAG WAG WAG WAG WAG WAG WAG WAG WAG");        
        else
            System.out.println("WAG");
    }
    
        public void bjork()
    {
        if (!isownerpresent)
            System.out.println("BJORK BJORK BJORK BJORK BJORK BJORK BJORK BJORK BJORK BJORK");        
        else
            System.out.println("WAG");
    }
    
}
