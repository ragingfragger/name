
/**
 * Write a description of class Interview here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Interview
{
    private Character c1, c2;
    
    public Interview(Character _c1, Character _c2)
    {
        c1 = _c1;
        c2 = _c2;
    }
    
    public void comparestrength()
    {
        System.out.println("Selection process for strength comparison:");
        System.out.println(c1.namecall() + "'s tensile strength is: " + c1.tensilerespond());
        System.out.println(c2.namecall() + "'s tensile strength is: " + c2.tensilerespond());
        if (c1.tensilerespond() > c2.tensilerespond())
        {
            System.out.println(c1.namecall() + " is stronger.");
        }
        else if (c1.tensilerespond() < c2.tensilerespond())
        {
            System.out.println(c2.namecall() + " is stronger");
        }
        else 
        {
            System.out.println("They are equal in strength");
        }
    }
    
    public void flosscompare()
    {
        System.out.println("Floss comparison:");
        if (c1.flosscall() == true && c2.flosscall() == true)
        {
            System.out.println("Both gamers floss.");
        }
        else if (c1.flosscall() == false && c2.flosscall() == false)
        {
            System.out.println("Neither gamer flosses, that is epic.");
        }
        else if (c1.flosscall() == true && c2.flosscall() == false)
        {
            System.out.println("only " + c1.namecall() + " flosses, they are noob.");
        }
        else if (c1.flosscall() == false && c2.flosscall() == true)
        {
            System.out.println("only " + c2.namecall() + " flosses, they are noob.");
        }
    }
    
    public void tauntcompare()
    {
        System.out.println("Taunt comparison:");
        if (c1.flosscall() == true && c2.flosscall() == true)
        {
            System.out.println("Both gamers taunt, this is truly epic.");
        }
        else if (c1.flosscall() == false && c2.flosscall() == false)
        {
            System.out.println("Neither gamer taunts, that is super sad.");
        }
        else if (c1.flosscall() == true && c2.flosscall() == false)
        {
            System.out.println("only " + c1.namecall() + " taunts, " + c2.namecall() + " are noob.");
        }
        else if (c1.flosscall() == false && c2.flosscall() == true)
        {
            System.out.println("only " + c2.namecall() + " taunts, " + c1.namecall() + " they are noob.");
        }
    }
    
    
}
